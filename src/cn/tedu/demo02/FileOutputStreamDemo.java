package cn.tedu.demo02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建一个字节输出流对象  字节输出流没有缓冲区 不需要冲刷
		FileOutputStream fos = new FileOutputStream("D:\\d.txt");
		//指定编码方式
		fos.write("HelloWorld".getBytes("utf-8"));
		//关流
		fos.close();
	}
}
