package cn.tedu.demo03;
import java.io.IOException;
/*
 * 读取内存中的流 （没用）
 */
import java.io.StringReader;

public class StringReaderDemo {
	public static void main(String[] args) throws IOException {
		String str = "46468";
		//创建对象
		StringReader sr = new StringReader(str);
		
		char[] chs = new char[3];
		int len;
		while((len = sr.read(chs)) != -1){
			System.out.println(new String(chs,0,len));
		}
		
		//关流
		sr.close();
		
		//写入流 。。。
	}
}	
