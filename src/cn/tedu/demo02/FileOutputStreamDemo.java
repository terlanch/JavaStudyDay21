package cn.tedu.demo02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//����һ���ֽ����������  �ֽ������û�л����� ����Ҫ��ˢ
		FileOutputStream fos = new FileOutputStream("D:\\d.txt");
		//ָ�����뷽ʽ
		fos.write("HelloWorld".getBytes("utf-8"));
		//����
		fos.close();
	}
}
