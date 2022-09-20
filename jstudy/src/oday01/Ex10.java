package oday01;

import java.util.Scanner;

public class Ex10 {
/*
 	
 	문제 10 ] 1. 키보드로 문자열을 입력 받아서 출력
			  2. 하나씩 꺼내서 출력
			  
			  ex)입력하신 문자는
			     '가나다라 입니다.'
			     가
			     나
			     다
			     라
		힌트] 문자열중에서 특정위치의 문자 추출하는 방법
			  char ch = 문자열.charAt(위치값);
		
		참고] 문자열 중 특정 문자의 위치값을 반환해주는 함수
			  문자열.indexOf(문자 || 문자열);
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("텍스트를 입력해주세요 : ");
		
		String inputText = sc.nextLine();
		System.out.println("입력하신 텍스트는 '" + inputText + "'입니다.");
		
		for (int i = 0; i < inputText.length(); i++) {
			char text = inputText.charAt(i);
			System.out.println(i+1 + "번째 텍스트 : " + text);
		}
		
		sc.close(); //입력도구 종료
	}

}
