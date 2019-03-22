package cn.tedu.demo6;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 随机获取流是一个双向流(可以读 也可以写)
 * 
 * r:可以读不可以写入
 * rw：可读可写
 * rws：可读可写	读取一段时间后再写入  效率高  容易出现数据丢失
 * rwd：可读可写  读取数据后立即写入  效率低  不容易出现数据丢失
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		RandomAccessFile raf = new RandomAccessFile("D:\\c.txt","rw");
		//写入数据
		raf.write("123".getBytes());
		//将底层的字节数组的索引设置为指定的索引
		raf.seek(0);
		raf.skipBytes(2);
		System.out.println((char)raf.read());
//		System.out.println((char)raf.read());
		//关流
		raf.close();
		
	}
}
