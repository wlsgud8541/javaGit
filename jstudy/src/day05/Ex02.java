package day05;

import java.util.Scanner;

/*
 * 문제 2 ]
 * 	알파벳 문자 하나를 입력받아서
 * 	그 문자가 대문자인지 소문자인지 판별해서 출력
 * 
 * 소문자면 대문자로 변환
 * 대문자면 소문자로 변환
 * 
 * 참고]
 * 	문자열에서 문자를 추출하는 방법
 * 		문자열.charAt(위치값)
 * 		이 문제의 경우는 하나의 문자만 입력할 예정이므로
 * 		문자열 .charAt(0)
 * 		으로 꺼내서 사용하면 된다.
 * */

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		//String result = (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') ? "소문자" : "대문자";
		//String result2 = (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') ? str.toUpperCase() : str.toLowerCase();
		//char result2 = ((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') ? str.charAt(0)-('a'-'A') : str.charAt(0)+('a'-'A'));
		
		String result = (ch < 'a') ? "대문자" : "소문자";
		char result2 = (ch < 'a') ? (char)(ch+('a'-'A')) : (char)(ch-('a'-'A'));
		
		System.out.printf("입력하신 문자 [%c] 는 '%s'이며, 변환된 문자는 [%c] 입니다.",str.charAt(0), result, result2);
		
	}
}	
