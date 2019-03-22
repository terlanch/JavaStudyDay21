package cn.tedu.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * 一个文本文件记录了1000条数据数据内容需自己初始化产生。数据内容为部分用户的银行卡消费记录，
 * 消费记录信息包含姓名 消费金额，找出消费次数最多的用户，并且该用户单笔消费最高的金额是多少？
 *例：文件内容格式
 *张三,666
 *李四,7893
 *张三,9999
 */
public class Practice03 {
	public static void main(String[] args) {
		String filePath = "D:\\money.txt";
		ArrayList<String> userlist = new ArrayList<>();
		userlist.add("张三");
		userlist.add("李四");
		userlist.add("王五");
		
	}
	
	/**
	 * 初始化文件内容：数据内容为用户的银行卡消费记录，消费记录信息包含([姓名] [消费金额])
	 * 要求：用户列表中的用户出现次数随机，消费金额信息随机，总数据条数1000条
	 *  
	 */
	private static void InitFile(String filePath,List<String> userlists){
		File file = new File(filePath);
		if(userlists.size() < 1){
			System.out.println("用户列表不能为空");
			return;
		}
	}
}
