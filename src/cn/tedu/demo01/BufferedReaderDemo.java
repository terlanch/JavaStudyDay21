package cn.tedu.demo01;
/*
 * 
 * BufferedReader�ص㣺����һ�ζ�ȡһ���ַ��� readLine
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//�������� �ײ㻹��ʹ��FileReader
		BufferedReader br = new BufferedReader(new FileReader("D:\\c.txt"));
		//һ�ζ�ȡһ���ַ���
		//readLine������û�ж�ȡ���з�
//		String str = br.readLine();
		String str;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		
		//�ر���
		br.close();
	}
}
