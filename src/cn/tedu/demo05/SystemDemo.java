package cn.tedu.demo05;

import java.io.IOException;

/*
 * 系统流  
 * 	是字节流
 * 系统流不要关闭！！！
 * 系统流是使用static修饰的，是被整个系统共享的
 * 一旦在一个类中被关闭，那么整个工程全部不能正常使用
 */
public class SystemDemo {
	public static void main(String[] args) throws IOException {
		//系统输入流
//		int i = System.in.read();
//		//系统输出流
//		System.out.println(i);
//		//系统错误流（红色输出）
//		System.err.println(i);
		
		for(int i = 0;i < 100;i++){
			//一起输出时，可能不换行
			//并没有真正的交叉输出
			System.out.println("a");
			System.err.println("a");
		}
	}
}
