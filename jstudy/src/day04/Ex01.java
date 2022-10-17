package day04;

import java.util.Scanner;

public class Ex01 {
	/*
	 * 문제 1]
	 * 		두 개의 숫자를 가로와 세로로 입력 받아서
	 * 		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를
	 * 		출력해주는 프로그램을 작성
	 * 
	 * 		힌트] 사각형 넓이 공식 : 가로x세로
	 * 			  삼각형 넓이 공식 : 밑변x높이x0.5(또는 1 / 2.0)
	 * 
	 * */
	
	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		//입력 메세지 출력1
		System.out.print("첫번째 숫자 입력 : ");
		
		//입력 받아서 변수에 저장1
		int num1 = sc.nextInt();
		
		//입력 메세지 출력2
		System.out.print("두번째 숫자 입력 : ");
				
		//입력 받아서 변수에 저장2
		int num2 = sc.nextInt();

		//도구 닫아주기
		sc.close();
		
		//결과 값 변수에 저장
		int result1 = num1*num2;  //사각형
		double result2 = num1*num2*0.5;  //삼각형
		
		//결과 값 출력
		System.out.printf("사각형의 넓이는 %d / 삼각형의 넒이는 %.2f",result1, result2);
		
		
	}
}
