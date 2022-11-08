package day20;

import java.util.*;

public class Test03 {

	public Test03() {
		TreeSet set = new TreeSet();
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("disk");
		set.add("dance");
		set.add("elephant");
		set.add("elevator");
		set.add("superman");
		set.add("flower");
		set.add("spiderman");

		ArrayList<String> list = new ArrayList<String>(set);
		for (String s : list) {
			System.out.print(s+ ", ");
		}
		System.out.println();
			
		/*
		 * 이 중에서 b로시작하는 데이터부터 d로 시작하는 데이터까지만(ef로 시작하는 문자 이전까지) 꺼내서 새로운 Set을 만들기
		 * */
		TreeSet tmpSet = (TreeSet)set.subSet("b", "e"); // "da" < "db", "db" < "dba" 
		list = new ArrayList<String>(tmpSet);

		for (String s : list) {
			System.out.print(s+ ", ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test03();
	}
}
