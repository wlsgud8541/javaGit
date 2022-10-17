package day04;

import java.util.Scanner;

public class Ex02 {
	/*
	 * 문제 2]
	 * 		하나의 숫자를 입력 받은 후
	 * 		그 숫자가 반지름으로 하고 
	 * 		원의 넓이와 원의 둘레를 구해서 출력해주는 프로그램을 작성하세요.
	 * 
	 * 		참고 ] 원의 넓이 : 반지름 x 반지름 x 3.14
	 * 			   원의 둘레 : 2 * 반지름 * 3.14
	 * 
	 * */
	
	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		//입력 메세지 출력
		System.out.print("반지름 입력 : ");
		
		//입력 받아서 변수에 저장
		int num = sc.nextInt();
		
		//도구 닫아주기
		sc.close();
		
		//결과값 변수에 저장
		double result1 = num * num * 3.14;
		double result2 = 2 * num * 3.14;
		
		//결과값 출력
		System.out.printf("원의 넓이: %.2f / 원의 둘래: %.2f",result1,result2);
		
		
	}
}
