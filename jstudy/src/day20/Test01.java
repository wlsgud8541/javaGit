package day20;

import java.util.*;

import day15.Student;

public class Test01 {
/*
 * 10명의 이름을 HashSet에 기억시킨 후 꺼내서 사용
 * 
 * */
	Student[] stu = new Student[5];
	String[] name = {"가학생","나학생","다학생","라학생","마학생","바학생","사학생","아학생","자학생","차학생"};
	public Test01() {
		// HashSet 생성
		HashSet set = new HashSet();
		
		// 데이터 넣기
		for (int i = 0; i < name.length; i++) {
			set.add(name[i]);
		}
		
		// 입력된 갯수 출력
		int size = set.size();
		System.out.println("set에 입력된 갯수 : "+ size);
		System.out.println();
		/*
		 * Set 계열은 데이터를 꺼내는 기능이 존재하지 않는다.
		 * 왜냐하면 데이터의 기억 위치를 개발자가 알 수 없기 때문이다.
		 * 
		 * 따라서 꺼낼 때는 
		 * 1. Iterator 로 변환시켜서 꺼내는 방법
		 * 2. ArrayList 로 변환시켜서 꺼내는 방법
		 * 을 사용해야한다.
		 * */
		
		//1. Iterator 로 변환시켜서 꺼내는 방법
		System.out.println("## Iterator 출력 ##");
		Iterator itor = set.iterator();
		while (itor.hasNext()) {
			//itor.hasNext() : 꺼낼 데이터가 아직 잠아 있는지 알아보는 함수.
			//반환값은 꺼낼 데이터가 있으면 true, 없으면 false를 반환
			String name = (String)itor.next(); // itor.next() : 데이터 꺼내는 함수. 반환값타입 : Object
			System.out.println("꺼낸 데이터 : " + name);
		}

		System.out.println();
		
		System.out.println("#### List 출력 ####");
		//2. ArrayList 로 변환해서 꺼내는 방법
		ArrayList list = new ArrayList(set);
		
		for (int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println("꺼낸 데이터 : " + name);
		}
		
	
	}
	public static void main(String[] args) {
		new Test01();
	}
}
