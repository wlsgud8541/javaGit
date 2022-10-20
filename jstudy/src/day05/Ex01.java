package day05;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

/*
 * 숫자 3개를 입력 받아서 
 * 가장 큰 수를 선택해서 출력해주는 프로그램을
 * 3항 조건 연산자를 사용해서 구현
 * 
 * */
public class Ex01 {
	public static void main(String[] args) {
		// 세개의 숫자를 입력 받는 방법
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
	
		int result = (no1 > no2) ? ((no1 > no3) ? no1 : no3 ) :
								   ((no2 > no3) ? no2 : no3 ) ;
		
		//System.out.println("입력한 숫자 "+no1+","+no2+","+no3+"중 가장 큰 숫자는 ["+result+"] 입니다.");
		System.out.printf("입력한 숫자 [%d], [%d], [%d] 중 가장 큰 숫자는 [%d] 입니다.",no1,no2,no3,result);
		
	}
}
