package cn.tedu.demo02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建一个字节输入流对象
		FileInputStream fis = new FileInputStream("D:\\d.txt");
		//读取一个字节数组
//		fis.read(byte []);
		//可以截取字节数组 参数1 就是字节数组
		//参数2 就是街区开始的索引 参数3 就是截取的长度
//		fis.read(byte[], int, int);
		
		byte[] bys = new byte[3];
		int len;
		while ((len = fis.read(bys)) != -1){
			System.out.print(new String(bys,0,len));
		}
		//关流
		fis.close();
	}
}
