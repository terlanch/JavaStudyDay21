package cn.tedu.demo05;
/*
 * ��ӡ��
 */
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("D:\\c.txt");
		//������
//		ps.write("dasdasd".getBytes());
		//�����������ָ���ļ���
		ps.print("dsadasdas123");
		//���������ָ���ļ���
		ps.println("helloworld");
		//����
		ps.close();
	}
}
