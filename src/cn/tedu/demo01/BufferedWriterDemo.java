package cn.tedu.demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建对象  底层本质上还是使用FileWriter进行写入
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\c.txt"));
		//写入数据
		bw.write("HelloWorld");
		//换行  会自动根据当前操作系统调整换行符
		bw.newLine();
		bw.write("HelloWorld");
		//冲刷缓冲区
		bw.flush();
		//关闭流
		bw.close();
	}
}
