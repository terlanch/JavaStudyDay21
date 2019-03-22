package cn.tedu.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 提供一个文件操作的方法，其需要实现功能：对一个文件的任意位置可以插入任何内容
 */
public class Practice01 {
	public static void main(String[] args) throws IOException {
		add("D:\\abc\\a.txt",10,"NIGHT");
	}
	public static void add(String filePath,int position,String conten) throws IOException{
		File file = new File(filePath);
		if(!(file.exists()) && file.isFile()){
			System.out.println("此文件不存在~");
			return;
		}
		if(position < 0 || position > file.length()){
			System.out.println("插入的位置不对~");
			return;
		}
		
		//创建临时文件
		File temp = File.createTempFile("temp", "temp", new File("D:\\"));
		FileOutputStream fos = new FileOutputStream(temp);
		FileInputStream fis = new FileInputStream(temp);
		
		//在退出JVM时自动删除
		temp.deleteOnExit();
		
		//创建随机获取流
		RandomAccessFile ra = new RandomAccessFile(file, "rw");
		//将指针移到position这个位置
		ra.seek(position);
		
		
		int len;
		//将原文件position后的内容全写到临时的文件中，这时指针移动到最后的位置
		while((len = ra.read()) != -1){
			fos.write(len);
		}
		//再次将指针移动到position这个位置
		ra.seek(position);
		//将要输入的内容输入到原文件中
		ra.write(conten.getBytes());
		//再将临时文件中的内容复制到原文件中，并且此时指针不用移动了
		while((len = fis.read()) != -1){
			ra.write(len);
		}
		//关流
		ra.close();
		fis.close();
		fos.close();
		
		
	}
}
