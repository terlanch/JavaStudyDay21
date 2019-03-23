package cn.tedu.demo6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 合并流
 * 可以将多个流合并在一起输出
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//要将多个文件进行合并
		//创建vector
		Vector<FileInputStream> v = new Vector<>();
		
		//创建多个流
		FileInputStream fis1 = new FileInputStream("D:\\a.txt");
		FileInputStream fis2 = new FileInputStream("D:\\d.txt");
		FileInputStream fis3 = new FileInputStream("D:\\c.txt");
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);

		//获取迭代器 --> 是vector的迭代器
		Enumeration<FileInputStream> e= v.elements();
		//使用合并流 -->创建对象
		//合并流：使用SequenceInputStream进行多个流的数据读取
		//在使用字节输出流进行输出
		SequenceInputStream sis = new SequenceInputStream(e);
		
		//创建字节数出流
		FileOutputStream fos = new FileOutputStream("D:\\123.txt");
		//创建字节数组
		byte[] bys = new byte[1024];
		
		int len;
		while((len = sis.read(bys)) != -1){
			fos.write(bys, 0, len);
		}
		
		//关流
		fos.close();
		sis.close();
	}

}
