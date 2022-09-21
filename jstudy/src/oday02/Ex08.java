package oday02;

import java.util.Scanner;

public class Ex08 {
	/*
	 * 문제 6]
	 * 		1. 양의 정수 하나를 입력한 후 그 숫자보다 큰 가장 가까운 10의 배수 구하기
	 * 		2. 입력한 숫자와의 차이를 출력하는 프로그램 작성.
	 * */
	
	public static void main(String[] args) {
		int num,temp,result;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		temp = (num+10)-(num%10);
		result = temp - num;
		System.out.println("=============== 출 력 결 과 ===============");
		System.out.printf("입력한 값 : %s\n가장 큰 배수 : %s\n입력한 숫자와의 차 : %s",num, temp, result);
		sc.close();
	}
}
