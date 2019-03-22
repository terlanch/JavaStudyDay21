package cn.tedu.demo6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * 序列化和反序列化
 * 
 * 序列化：将对象转换为字节
 * 反序列化：将字节数组转换为对象
 * 
 * static修饰的内容不能被序列化
 * 因为static修饰的是共享的内容，序列化没有意义
 * 
 * transient修饰的内容，强制不能序列化（可以把不想要的属性不序列化）
 * 
 * stream classdesc 
 * serialVersionUID = -5009869688454202565, 
 * local class 
 * serialVersionUID = 6623572798885484954
 * 类中在序列化的时候，会根据类中的属性和方法进行计算，
 * 得到一个值（serialVersionUID），在反序列化的时候，
 * 会首先获取IO流中的UID和本地类的UID进行比较，如果一样
 * 那么可以进行反序列化，如果不一样，那么就会抛出异常
 * InvalidClassException
 * 
 * 手动指定类的UID 就可以在修改类的内容后在进行反序列化不报错
 * 
 * 集合的容器不能被直接序列化。可以遍历容器
 * 一个一个元素进行序列化
 * 
 */
public class SerialDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//创建一个学生对象
		Student stu = new Student();
		stu.setName("赵本山");
		stu.setAge(60);
		
//		Student stu1 = new Student();
//		stu.setName("赵本山");
//		stu.setAge(60);
//		ArrayList<Student> list = new ArrayList<>();
//		list.add(stu);
//		list.add(stu1);
		
		//序列化-->将对象转换为字节
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p.data"));
//		//将stu对象转换为字节
//		oos.writeObject(stu);
//		//
//		oos.close();
		
		//反序列化 --> 将字节转换为对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p.data"));
		
		Student stu1 = (Student) ois.readObject();
		//查看对象的名字
		System.out.println(stu1.getName());
		//关流
		ois.close();
	}
	
}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6623572798885484954L;
	// NotSerializableException:需要序列化的类要实现接口
	//Serializable是一个空接口，只是对类做一个标识
	//实现这个接口的类，可以被序列化
	private String name;
	private int age;
	static String classRoom = "502";
	private int weight;
	transient private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
