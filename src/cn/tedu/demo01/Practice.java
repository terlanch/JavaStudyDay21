package cn.tedu.demo01;
/*
 * ���Լ�д�˶����д���
 * 
 * 24�ֳ������ģʽ
 * 
 * ģʽ����ͬһ������Ĵ���ʽ
 * ���ģʽ����������������У���ͬ���������һ��ͳһ��
 * ����ʽ
 * װ�����ģʽ����ͬ������챾����󣬴Ӷ��Ա����������޸�����ǿ
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practice {
	static int line = 0;
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Users\\TEDU\\workspace");
		read(file);
		System.out.println(line);
	}
	public static void read(File file) throws IOException{
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File f:files){
				read(f);
			}
		}else if(file.getName().endsWith(".java")){
			BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
			String str;
			while((str = br.readLine()) != null){
				line++;
			}
			br.close();
		}
	}
}
