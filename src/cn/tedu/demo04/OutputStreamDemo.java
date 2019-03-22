package cn.tedu.demo04;
/*
 * 转换流
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//OutputStreamWriter 字符流
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\c.txt"),"utf-8");
//		osw.write("abdsad");
//		osw.close();
		
		//通过字节流创建字符流
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\c.txt"));
//		char[] chs = new char[5];		
//		int len = isr.read(chs);
//		System.out.println(new String(chs,0,5));
//		//关流
//		isr.close();
		
	}
}
