package cn.tedu.demo05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeDemo {
	public static void main(String[] args) throws IOException {
		//��ȡһ����Ϣ BufferedReader
		//�ӿ���̨��ȡ��Ϣ System.in
		//System.in���ֽ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(str);
	}
}
