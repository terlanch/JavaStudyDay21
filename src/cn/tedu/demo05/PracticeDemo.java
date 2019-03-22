package cn.tedu.demo05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeDemo {
	public static void main(String[] args) throws IOException {
		//读取一行信息 BufferedReader
		//从控制台获取信息 System.in
		//System.in是字节流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(str);
	}
}
