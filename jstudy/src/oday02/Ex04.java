package oday02;

import java.util.Scanner;

public class Ex04 {
	/*
	 * 
	 * 문제 2 ]
	 * 		1. 3자리로 구성된 숫자 하나를 입력 받기
	 * 		2. 십단위 이하를 버린 숫자를 만들어서 출력하기
	 * 		3. 계속 입력 가능하게 변경
	 * 		예]
	 * 			123 ==> 100
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		int result, num2;
		if (num1 >=100  && num1 < 1000) {
			num2 = num1 % 100;
			result = num1 - num2;
			System.out.println("십단위 이하 나머지를 버린 값 : " + result);
		}else {
			System.out.println("정해진 범위를 넘어갔습니다.");
		}
		sc.close();
	}
}
