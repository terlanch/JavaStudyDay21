package cn.tedu.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * һ���ı��ļ���¼��1000�����������������Լ���ʼ����������������Ϊ�����û������п����Ѽ�¼��
 * ���Ѽ�¼��Ϣ�������� ���ѽ��ҳ����Ѵ��������û������Ҹ��û�����������ߵĽ���Ƕ��٣�
 *�����ļ����ݸ�ʽ
 *����,666
 *����,7893
 *����,9999
 */
public class Practice03 {
	public static void main(String[] args) {
		String filePath = "D:\\money.txt";
		ArrayList<String> userlist = new ArrayList<>();
		userlist.add("����");
		userlist.add("����");
		userlist.add("����");
		
	}
	
	/**
	 * ��ʼ���ļ����ݣ���������Ϊ�û������п����Ѽ�¼�����Ѽ�¼��Ϣ����([����] [���ѽ��])
	 * Ҫ���û��б��е��û����ִ�����������ѽ����Ϣ���������������1000��
	 *  
	 */
	private static void InitFile(String filePath,List<String> userlists){
		File file = new File(filePath);
		if(userlists.size() < 1){
			System.out.println("�û��б���Ϊ��");
			return;
		}
	}
}
