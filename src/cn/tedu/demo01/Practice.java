package cn.tedu.demo01;
/*
 * 看自己写了多少行代码
 * 
 * 24种常用设计模式
 * 
 * 模式：对同一类问题的处理方式
 * 设计模式：在软件开发过程中，对同样的问题的一种统一的
 * 处理方式
 * 装饰设计模式：用同类对象构造本类对象，从而对本类对象进行修复和增强
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practice {
	static int line = 0;
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Users\\TEDU\\workspace");
		read(file);
		System.out.println(line);
	}
	public static void read(File file) throws IOException{
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File f:files){
				read(f);
			}
		}else if(file.getName().endsWith(".java")){
			BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
			String str;
			while((str = br.readLine()) != null){
				line++;
			}
			br.close();
		}
	}
}
