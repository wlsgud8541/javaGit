package day05;

import java.util.Scanner;

public class Test01 {
/*
 * 예제 1 ] 정수를 입력받아서 입력된 정수가
 * 		  	짝수인지 홀수인지 아니면 0인지 판별하세요
 * 
 * */	
	public static void main(String[] args) {
		//0. 결과를 기억할 변수 만들기
		int num = 0;
		String result = "";
		
		//1. 입력도구준비
		Scanner sc = new Scanner(System.in);
		//2. 입력 메세지 출력
		System.out.print("숫자 입력 : ");
		//3. 입력받아서 변수에 기억
		num = sc.nextInt();

		sc.close(); //입력도구 닫기
		//4. 결과 판별
		result = (num==0) ? "0 입니다." : ((num%2 == 0) ? "짝수입니다" : "홀수입니다");
		
		//5. 출력
		System.out.println("입력받은 숫자 [" +num +"]은 "+ result);
	}
}
