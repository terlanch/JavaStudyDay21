package cn.tedu.demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//��������  �ײ㱾���ϻ���ʹ��FileWriter����д��
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\c.txt"));
		//д������
		bw.write("HelloWorld");
		//����  ���Զ����ݵ�ǰ����ϵͳ�������з�
		bw.newLine();
		bw.write("HelloWorld");
		//��ˢ������
		bw.flush();
		//�ر���
		bw.close();
	}
}
