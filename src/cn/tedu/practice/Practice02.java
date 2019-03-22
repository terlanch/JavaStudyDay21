package cn.tedu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * ����������ļ��ϣ����ϵ�ÿ��Ԫ�ض���һ�η�Χ����
 * �佻�������罻��{[4,8],[9,13]}��{[6,12]}�Ľ���
 * ��{[6,8],[9,12]}
 */
public class Practice02 {
	public static void main(String[] args) {
		//����һ����ż��ϵļ���
		List<List<Integer>> lists1 = new ArrayList<>();
		List<List<Integer>> lists2 = new ArrayList<>();
		//����������ֵļ���
		List<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(8);
		List<Integer> list2 = new ArrayList<>();
		list2.add(9);
		list2.add(13);
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(12);
		//��С���ϴ�ŵ��󼯺���
		lists1.add(list1);
		lists1.add(list2);
		lists2.add(list3);
		
		manage(lists1,lists2);
	}
	/**
	 * ����У��
	 * @param lists
	 * 
	 */
	public static boolean islegal(List<List<Integer>> lists){
		//�󼯺���������һ��Ԫ��
		if(lists.size() < 1){
			System.out.println("�󼯺���������һ��Ԫ��");
			return false;
		}
		//����������
		Iterator<List<Integer>> it = lists.iterator();
		while(it.hasNext()){
			List<Integer> list1 = it.next();
			//С������Ԫ��ֻ��������
			if(list1.size() !=2){
				System.out.println("С������Ԫ��ֻ��������");
				return false;
			}
			//С�����е�һ��Ԫ�ز��ܴ��ڵڶ���
			if(list1.get(0) > list1.get(1)){
				System.out.println("С�����е�һ��Ԫ�ز��ܴ��ڵڶ���");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ��������
	 * @param lists1
	 * @param lists2
	 */
	public static void manage(List<List<Integer>> lists1,List<List<Integer>> lists2){
		//�ж��������󼯺��Ƿ�Ϸ�
		if(!islegal(lists1) || !islegal(lists2)){
			System.out.println("�������󼯺ϲ��Ϸ�");
			return;
		}
		//����������
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
	 * ������ϼ� 
	 * @param list1
	 * @param list2
	 */
	public static void intersection(List<Integer> list1,List<Integer> list2){
		int start1 = list1.get(0);
		int end1 = list1.get(1);
		int start2 = list2.get(0);
		int end2 = list2.get(1);
		//�������������û�н���ʱ
		if(start1 > end2 || start2 > end1){
			System.out.println("�����������û�н���");
			return;
		}
		//�����ĸ�������,�м�������ķ�Χ�������ǵĽ���
		int[] arr = {start1,end1,start2,end2};
		Arrays.sort(arr);
		int left = arr[1];
		int right = arr[2];
		System.out.println("["+left+","+right+"]");
				
	}
}
