package cn.tedu.demo6;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * �����ȡ����һ��˫����(���Զ� Ҳ����д)
 * 
 * r:���Զ�������д��
 * rw���ɶ���д
 * rws���ɶ���д	��ȡһ��ʱ�����д��  Ч�ʸ�  ���׳������ݶ�ʧ
 * rwd���ɶ���д  ��ȡ���ݺ�����д��  Ч�ʵ�  �����׳������ݶ�ʧ
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		//��������
		RandomAccessFile raf = new RandomAccessFile("D:\\c.txt","rw");
		//д������
		raf.write("123".getBytes());
		//���ײ���ֽ��������������Ϊָ��������
		raf.seek(0);
		raf.skipBytes(2);
		System.out.println((char)raf.read());
//		System.out.println((char)raf.read());
		//����
		raf.close();
		
	}
}
