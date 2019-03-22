package cn.tedu.demo6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * properties(ӳ��)
 * �ܹ��־û��洢ӳ������
 * properties�Ǽ̳���HashTable�����Լ�ֵ�Բ���Ϊnull
 * properties
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		//����properties
		Properties pro = new Properties();
		//������� ��ӵļ�ֵ��ֻ��ΪString����
		pro.put("name", "Amy");
		pro.put("age", "18");
		
		//�־û��洢
		//�־û��洢���ļ���׺������.properties  ����2���ļ��е�ע��
		pro.store(new FileOutputStream("data.properties"), "I love you");
//		System.out.println(pro);
		
		//��������
		pro.load(new FileInputStream("data.properties"));
		
		//��ȡ���� ����1��ȡkey��Ӧ��value
		//����2 ������ݲ����ڣ�����һ��Ĭ��ֵ
//		System.out.println(pro.getProperty("ert", "Alice"));
		
		//������ӡ
		pro.list(System.out);
		
	}
}
