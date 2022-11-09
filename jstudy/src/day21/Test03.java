package day21;

import java.util.*;

public class Test03 {

	public Test03() {
		HashMap map = new HashMap();
		/*
		map.put("jennie", "제니");
		map.put("lisa", "리사");
		map.put("rose", "로제");
		map.put("jisoo", "지수");
		
		//데이터 꺼내기
		String name = (String)map.get("jennie");
		System.out.println("jennie : " + name);
		 */
		
		// 제니의 정보를 기억하는 맵을 만드세요
		map.put("name", "jennie");
		map.put("age", 27);
		map.put("height", 165.5);
		map.put("gen", 'F');
		
		//꺼내서 출력
//		System.out.println("Object : " + new Object());
//		int[] nums = new int[10];
//		System.out.println("nums : " + nums);
		
		System.out.println("name : " + map.get("name"));
		System.out.println("age : " + map.get("age"));
		System.out.println("height : " + map.get("height"));
		System.out.println("gen : " + map.get("gen"));
	}	

	public static void main(String[] args) {
		new Test03();
	}
}
