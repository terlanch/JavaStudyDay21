package cn.tedu.demo05;

import java.io.IOException;

/*
 * ϵͳ��  
 * 	���ֽ���
 * ϵͳ����Ҫ�رգ�����
 * ϵͳ����ʹ��static���εģ��Ǳ�����ϵͳ�����
 * һ����һ�����б��رգ���ô��������ȫ����������ʹ��
 */
public class SystemDemo {
	public static void main(String[] args) throws IOException {
		//ϵͳ������
//		int i = System.in.read();
//		//ϵͳ�����
//		System.out.println(i);
//		//ϵͳ����������ɫ�����
//		System.err.println(i);
		
		for(int i = 0;i < 100;i++){
			//һ�����ʱ�����ܲ�����
			//��û�������Ľ������
			System.out.println("a");
			System.err.println("a");
		}
	}
}
