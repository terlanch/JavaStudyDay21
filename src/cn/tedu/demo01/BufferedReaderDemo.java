package cn.tedu.demo01;
/*
 * 
 * BufferedReader特点：可以一次读取一行字符串 readLine
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建对象 底层还是使用FileReader
		BufferedReader br = new BufferedReader(new FileReader("D:\\c.txt"));
		//一次读取一行字符串
		//readLine方法并没有读取换行符
//		String str = br.readLine();
		String str;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		
		//关闭流
		br.close();
	}
}
