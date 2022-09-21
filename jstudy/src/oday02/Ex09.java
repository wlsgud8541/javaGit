package oday02;

import java.util.Scanner;

public class Ex09 {
	/*
	 * 문제 7]
	 * 		1. 산수 계산식을 입력 받기
	 * 		2. 그 결과를 처리해서 출력해주는 프로그램 작성
	 * 		3. 조건문, 반복문이 필요하면 사용
	 * 
	 * 		예] 123 - 23
	 * 			=> 100
	 * */
	
	public static void main(String[] args) {
		String str;
		String sno1 = "";
		String sno2 = "";
		String giho = ""; //입력 받은 숫자 
		int idx=0;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("계산식 입력 : ");
			str = sc.nextLine();
			
			//반복 종료 조건 추가
			if (str.equals("q")) {
				System.out.println("================종료================");
				break;
			}
			
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
	
				//추출한 문자가 연산기호
				if (ch < '0' || ch >'9') {
					idx = i; //연산기호 위치값 저장
					giho = ch + ""; //연산기호를 String타입으로 저장
				}
			}
			
			//첫번재 숫자 꺼내기
			for (int i = 0; i < idx; i++) {
				sno1 = sno1 + str.charAt(i);
			}
			
			//두번재 숫자 꺼내기
			for (int i = idx+1; i < str.length(); i++) {
				sno2 = sno2 + str.charAt(i);
			}
			
			//숫자만들기
			int no1 = Integer.parseInt(sno1);
			int no2 = Integer.parseInt(sno2);
			
			//1번 방법
			/*
			int result = 0;
			if (giho.equals("+")) {
				result = no1 + no2;
			}else if (giho.equals("-")) {
				result = no1 - no2;
			}else if (giho.equals("*")) {
				result = no1 * no2;
			}else if (giho.equals("/")) {
				result = no1 / no2;
			}
			*/
			
			int result = 0;
			switch (giho) {
			case "+":
				result = no1 + no2;
				break;
			case "-":
				result = no1 - no2;
				break;
			case "*":
				result = no1 * no2;
				break;
			case "/":
				result = no1 / no2;
				break;
			}
			
			System.out.println("입력된 계산식 '" + str +"' 의 결과는 '"+result+"'입니다.");
			System.out.println("==========================================================================");
		}
		sc.close();
	}
}
