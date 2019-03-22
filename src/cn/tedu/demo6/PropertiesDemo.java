package cn.tedu.demo6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * properties(映射)
 * 能够持久化存储映射内容
 * properties是继承自HashTable，所以键值对不能为null
 * properties
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		//创建properties
		Properties pro = new Properties();
		//添加数据 添加的键值对只能为String类型
		pro.put("name", "Amy");
		pro.put("age", "18");
		
		//持久化存储
		//持久化存储的文件后缀必须是.properties  参数2是文件中的注释
		pro.store(new FileOutputStream("data.properties"), "I love you");
//		System.out.println(pro);
		
		//加载数据
		pro.load(new FileInputStream("data.properties"));
		
		//获取数据 参数1获取key对应的value
		//参数2 如果数据不存在，给定一个默认值
//		System.out.println(pro.getProperty("ert", "Alice"));
		
		//遍历打印
		pro.list(System.out);
		
	}
}
