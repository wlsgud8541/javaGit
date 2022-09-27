package oday05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		int[] nums = new int[6];

		/* 정보 
		 * HashMap = 키,벨류값으로 데이터 저장(키, 벨류)
		 * ArrayList = 순차적으로 데이터 저장, 인덱스 있음, 반복데이터 저장됨
		 * HashSet = 중복된 데이터는 저장되지않는다, 인덱스가 존재하지 않음
		 * Iterator = 데이터에 순차적으로 인덱스를 넣어주는 함수, 임시로 저장하기 때문에 따로 변수에 저장해야한다.
		 * */
		
		/*
		nums[0] = 10;
		nums[5] = 45;
		//System.out.println(nums[6]);
		
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < 30; i++) {
			list.add(i+1);
		}
		
		for (Object o : list) { //향상된 for 명령
			System.out.println(o);
		}
		list.add(100);
		System.out.println(list.get(30));
	*/	
		HashSet<Integer> set = new HashSet<Integer>(); // 중복된 데이터는 저장되지않지만 인덱스가 존재하지 않는다.
		
		int idx = 0;
		for (; set.size() < 6;) {
			set.add((int)(Math.random()*45+1));
			++idx;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		
		for (int no : list) {
			System.out.print(no + " | ");
		}
		System.out.println();
		
		
		Iterator<Integer> itor = set.iterator(); // 인덱스를 매겨주는 함수
		
		while (itor.hasNext()) {
			System.out.print(itor.next() + "-");
		}
		System.out.println();
		System.out.println("idx : " + idx);
		
		
		HashMap map = new HashMap();
		
		map.put("name", "jennie");
		map.put("age", 27);
		map.put("gen", 'F');
		
		System.out.printf("name : %s\nage : %d\ngender : %c", map.get("name"), map.get("age"), map.get("gen"));
		
		
	}
}
