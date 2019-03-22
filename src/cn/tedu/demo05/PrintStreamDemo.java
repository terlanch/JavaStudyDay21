package cn.tedu.demo05;
/*
 * 打印流
 */
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("D:\\c.txt");
		//不常用
//		ps.write("dasdasd".getBytes());
		//不换行输出到指定文件中
		ps.print("dsadasdas123");
		//换行输出到指定文件中
		ps.println("helloworld");
		//关流
		ps.close();
	}
}
