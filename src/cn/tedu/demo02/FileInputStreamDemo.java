package cn.tedu.demo02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//����һ���ֽ�����������
		FileInputStream fis = new FileInputStream("D:\\d.txt");
		//��ȡһ���ֽ�����
//		fis.read(byte []);
		//���Խ�ȡ�ֽ����� ����1 �����ֽ�����
		//����2 ���ǽ�����ʼ������ ����3 ���ǽ�ȡ�ĳ���
//		fis.read(byte[], int, int);
		
		byte[] bys = new byte[3];
		int len;
		while ((len = fis.read(bys)) != -1){
			System.out.print(new String(bys,0,len));
		}
		//����
		fis.close();
	}
}
