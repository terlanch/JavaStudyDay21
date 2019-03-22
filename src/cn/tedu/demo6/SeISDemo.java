package cn.tedu.demo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SeISDemo {		
	public static void main(String[] args) throws IOException {
		Vector<FileInputStream> v = new Vector<>();
		//创建流
		FileInputStream file1 = new FileInputStream("D:\\abc\\a.txt");
		FileInputStream file2 = new FileInputStream("D:\\abc\\a1.txt");
		FileInputStream file3 = new FileInputStream("D:\\abc\\aaa.txt");
		
		//添加
		v.add(file1);
		v.add(file2);
		v.add(file3);
		
		Enumeration<FileInputStream> e = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(e);
		
		FileOutputStream fos = new FileOutputStream("D:\\abc\\nie.txt");
		
		byte[] bys = new byte[1024];
		int len;
		while((len = sis.read(bys)) != -1){
			fos.write(bys,0,len);
		}
		fos.close();
		sis.close();
		
		File file = new File("D:\\abc\\nie.txt");
		if(file.exists()){
			System.out.println("合并成功！");
		}
	}
}
