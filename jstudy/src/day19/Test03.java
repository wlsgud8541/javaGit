package day19;

import java.util.*;

public class Test03 {
/*
 * 1. ArrayList에 1 ~ 50 사이의 정수 10개를 랜덤하게 만들어서 채우고 이것을 정렬해서 출력하세요
 * 
 * 2. 위의 채워진 결과를 내림차순 정렬해서 출력
 * 
 * 단, 정렬은 Comparator 를 구현해서 처리하세요.
 * */
	public Test03() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*50+1);
			list.add(num);
		}
		
		// 정렬 전
		System.out.println("##### 정렬 전 #####");
		for (int num : list) {
			System.out.print(num + " | ");
		}
		System.out.println();

		// 오름차순 정렬
		Collections.sort(list, new MyAsc());
		System.out.println("##### 정렬 후 (오름차순) #####");
		for (int num : list) {
			System.out.print(num + " | ");
		}
		System.out.println();

		// 내림차순 정렬
		Collections.sort(list, new MyDesc());
		System.out.println("##### 정렬 후 (내림차순) #####");
		for (int num : list) {
			System.out.print(num + " | ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}

class MyAsc implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// o1 : 원본, o2 : 대상
		
		/*
		 * 이 함수는 Collections.sort() 자동 호출되는 함수
		 * 반환값이 음수(-) 이면 순서를 바꾸지 않는다.
		 * 반환값이 양수(+) 이면 순서를 바꾼다.
		 * */
		int num1 = (int)o1;
		int num2 = (int)o2;
		int result = num1 - num2;
		
		return result;
	}
}

class MyDesc implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		/*
		 * 이 함수는 Collections.sort() 자동 호출되는 함수
		 * 반환값이 음수(-) 이면 순서를 바꾸지 않는다.
		 * 반환값이 양수(+) 이면 순서를 바꾼다.
		 * */
		int num1 = (int)o1;
		int num2 = (int)o2;
		int result = num1 - num2;
		
		return -result;
	}
}
