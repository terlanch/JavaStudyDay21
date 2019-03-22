package cn.tedu.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * �ṩһ���ļ������ķ���������Ҫʵ�ֹ��ܣ���һ���ļ�������λ�ÿ��Բ����κ�����
 */
public class Practice01 {
	public static void main(String[] args) throws IOException {
		add("D:\\abc\\a.txt",10,"NIGHT");
	}
	public static void add(String filePath,int position,String conten) throws IOException{
		File file = new File(filePath);
		if(!(file.exists()) && file.isFile()){
			System.out.println("���ļ�������~");
			return;
		}
		if(position < 0 || position > file.length()){
			System.out.println("�����λ�ò���~");
			return;
		}
		
		//������ʱ�ļ�
		File temp = File.createTempFile("temp", "temp", new File("D:\\"));
		FileOutputStream fos = new FileOutputStream(temp);
		FileInputStream fis = new FileInputStream(temp);
		
		//���˳�JVMʱ�Զ�ɾ��
		temp.deleteOnExit();
		
		//���������ȡ��
		RandomAccessFile ra = new RandomAccessFile(file, "rw");
		//��ָ���Ƶ�position���λ��
		ra.seek(position);
		
		
		int len;
		//��ԭ�ļ�position�������ȫд����ʱ���ļ��У���ʱָ���ƶ�������λ��
		while((len = ra.read()) != -1){
			fos.write(len);
		}
		//�ٴν�ָ���ƶ���position���λ��
		ra.seek(position);
		//��Ҫ������������뵽ԭ�ļ���
		ra.write(conten.getBytes());
		//�ٽ���ʱ�ļ��е����ݸ��Ƶ�ԭ�ļ��У����Ҵ�ʱָ�벻���ƶ���
		while((len = fis.read()) != -1){
			ra.write(len);
		}
		//����
		ra.close();
		fis.close();
		fos.close();
		
		
	}
}
