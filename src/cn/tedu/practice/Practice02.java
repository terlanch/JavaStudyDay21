package cn.tedu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 有两个有序的集合，集合的每个元素都是一段范围，求
 * 其交集，例如交集{[4,8],[9,13]}和{[6,12]}的交集
 * 是{[6,8],[9,12]}
 */
public class Practice02 {
	public static void main(String[] args) {
		//创建一个存放集合的集合
		List<List<Integer>> lists1 = new ArrayList<>();
		List<List<Integer>> lists2 = new ArrayList<>();
		//创建存放数字的集合
		List<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(8);
		List<Integer> list2 = new ArrayList<>();
		list2.add(9);
		list2.add(13);
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(12);
		//将小集合存放到大集合中
		lists1.add(list1);
		lists1.add(list2);
		lists2.add(list3);
		
		manage(lists1,lists2);
	}
	/**
	 * 参数校验
	 * @param lists
	 * 
	 */
	public static boolean islegal(List<List<Integer>> lists){
		//大集合中至少有一个元素
		if(lists.size() < 1){
			System.out.println("大集合中至少有一个元素");
			return false;
		}
		//创建迭代器
		Iterator<List<Integer>> it = lists.iterator();
		while(it.hasNext()){
			List<Integer> list1 = it.next();
			//小集合中元素只能有两个
			if(list1.size() !=2){
				System.out.println("小集合中元素只能有两个");
				return false;
			}
			//小集合中第一个元素不能大于第二个
			if(list1.get(0) > list1.get(1)){
				System.out.println("小集合中第一个元素不能大于第二个");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 输出最后结果
	 * @param lists1
	 * @param lists2
	 */
	public static void manage(List<List<Integer>> lists1,List<List<Integer>> lists2){
		//判断这两个大集合是否合法
		if(!islegal(lists1) || !islegal(lists2)){
			System.out.println("这两个大集合不合法");
			return;
		}
		//创建迭代器
		Iterator<List<Integer>> it = lists1.iterator();
		while(it.hasNext()){
			List<Integer> list1 = it.next();
			Iterator<List<Integer>> it1 = lists2.iterator();
			while(it1.hasNext()){
				List<Integer> list2 = it1.next();
				intersection(list1,list2);
			}
		}
	}
	
	/**
	 * 求区间合集 
	 * @param list1
	 * @param list2
	 */
	public static void intersection(List<Integer> list1,List<Integer> list2){
		int start1 = list1.get(0);
		int end1 = list1.get(1);
		int start2 = list2.get(0);
		int end2 = list2.get(1);
		//当这个两个集合没有交集时
		if(start1 > end2 || start2 > end1){
			System.out.println("这个两个集合没有交集");
			return;
		}
		//给这四个点排序,中间两个点的范围就是他们的交集
		int[] arr = {start1,end1,start2,end2};
		Arrays.sort(arr);
		int left = arr[1];
		int right = arr[2];
		System.out.println("["+left+","+right+"]");
				
	}
}
