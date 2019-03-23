package cn.tedu.demo6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * �ϲ���
 * ���Խ�������ϲ���һ�����
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//Ҫ������ļ����кϲ�
		//����vector
		Vector<FileInputStream> v = new Vector<>();
		
		//���������
		FileInputStream fis1 = new FileInputStream("D:\\a.txt");
		FileInputStream fis2 = new FileInputStream("D:\\d.txt");
		FileInputStream fis3 = new FileInputStream("D:\\c.txt");
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);

		//��ȡ������ --> ��vector�ĵ�����
		Enumeration<FileInputStream> e= v.elements();
		//ʹ�úϲ��� -->��������
		//�ϲ�����ʹ��SequenceInputStream���ж���������ݶ�ȡ
		//��ʹ���ֽ�������������
		SequenceInputStream sis = new SequenceInputStream(e);
		
		//�����ֽ�������
		FileOutputStream fos = new FileOutputStream("D:\\123.txt");
		//�����ֽ�����
		byte[] bys = new byte[1024];
		
		int len;
		while((len = sis.read(bys)) != -1){
			fos.write(bys, 0, len);
		}
		
		//����
		fos.close();
		sis.close();
	}

}
