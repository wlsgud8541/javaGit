package day06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 1. 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력
		System.out.print("첫번째 숫자 : ");
		// 3. 입력데이터 꺼내서 변수 기억
		int no1 = sc.nextInt();
		// 2. 메세지 출력
		System.out.print("두번째 숫자 : ");
		// 3. 입력데이터 꺼내서 변수 기억
		int no2 = sc.nextInt();
		// 2. 메세지 출력
		System.out.print("세번째 숫자 : ");
		// 3. 입력데이터 꺼내서 변수 기억
		int no3 = sc.nextInt();
		
		sc.close();
	
		int result = 0; // 결과값 저장 변수
		
		if (no1 > no2) {      // no1이 no2보다 큰 경우
			if (no1 > no3) {  // no1이 no3보다 큰 경우
				result = no1; // no1을 결과값 result에 저장 
			}else {			  // no3이 no1보다 큰 경우
				result = no3; // no3을 결과값 result에 저장
			}
		}else {				  // no2가 no1보다 큰 경우
			if (no2 > no3) {  // no2가 no3보다 큰 경우
				result = no2; // no2을 결과값 result에 저장
			}else {			  // no3이 no2보다 큰 경우
				result = no3; // no3을 결과값 result에 저장
			}
		}
		
		//결과값 출력
		System.out.printf("입력한 숫자 [%d], [%d], [%d] 중 가장 큰 숫자는 [%d] 입니다.",no1,no2,no3,result);
	}
}
