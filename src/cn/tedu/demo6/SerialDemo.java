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
 * ���л��ͷ����л�
 * 
 * ���л���������ת��Ϊ�ֽ�
 * �����л������ֽ�����ת��Ϊ����
 * 
 * static���ε����ݲ��ܱ����л�
 * ��Ϊstatic���ε��ǹ�������ݣ����л�û������
 * 
 * transient���ε����ݣ�ǿ�Ʋ������л������԰Ѳ���Ҫ�����Բ����л���
 * 
 * stream classdesc 
 * serialVersionUID = -5009869688454202565, 
 * local class 
 * serialVersionUID = 6623572798885484954
 * ���������л���ʱ�򣬻�������е����Ժͷ������м��㣬
 * �õ�һ��ֵ��serialVersionUID�����ڷ����л���ʱ��
 * �����Ȼ�ȡIO���е�UID�ͱ������UID���бȽϣ����һ��
 * ��ô���Խ��з����л��������һ������ô�ͻ��׳��쳣
 * InvalidClassException
 * 
 * �ֶ�ָ�����UID �Ϳ������޸�������ݺ��ڽ��з����л�������
 * 
 * ���ϵ��������ܱ�ֱ�����л������Ա�������
 * һ��һ��Ԫ�ؽ������л�
 * 
 */
public class SerialDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//����һ��ѧ������
		Student stu = new Student();
		stu.setName("�Ա�ɽ");
		stu.setAge(60);
		
//		Student stu1 = new Student();
//		stu.setName("�Ա�ɽ");
//		stu.setAge(60);
//		ArrayList<Student> list = new ArrayList<>();
//		list.add(stu);
//		list.add(stu1);
		
		//���л�-->������ת��Ϊ�ֽ�
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p.data"));
//		//��stu����ת��Ϊ�ֽ�
//		oos.writeObject(stu);
//		//
//		oos.close();
		
		//�����л� --> ���ֽ�ת��Ϊ����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p.data"));
		
		Student stu1 = (Student) ois.readObject();
		//�鿴���������
		System.out.println(stu1.getName());
		//����
		ois.close();
	}
	
}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6623572798885484954L;
	// NotSerializableException:��Ҫ���л�����Ҫʵ�ֽӿ�
	//Serializable��һ���սӿڣ�ֻ�Ƕ�����һ����ʶ
	//ʵ������ӿڵ��࣬���Ա����л�
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
