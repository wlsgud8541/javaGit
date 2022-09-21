package oday02;

import java.util.Scanner;

public class Ex13 {
	/* 문제 11]
	 * 다섯자리의 숫자를 입력받아서 그 숫자가 회문수인지 아닌지를 판별하는 프로그램 작성
	 * 
	 * 참고] 회문수 : 앞에서 읽으나 뒤에서 읽으나 같은 수를 회문수라고 한다. 예) 12321 => 회문수
	 * 
	 * 
	 * 해결방법 ]
	 * 	1. 쉬운방법 ] 문자열로 처리하는 방법
	 * 
	 *  2. 어려운방법 ] 숫자로 처리하는 방법
	 * 
	 * */
	
	public static void main(String[] args) {
		String temp1; 
		String temp2 = "";
		String temp3 = "";
		char ch1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		temp1 = sc.nextLine();
		
		for (int i = 0; i < 2; i++) {
			ch1 = temp1.charAt(i);
			temp2 += ch1+""; 
			//System.out.println("temp2 : "+temp2);
		}
		
		for (int i = 4; i > 2; i--) {
			ch1 = temp1.charAt(i);
			temp3 += ch1+"";
			//System.out.println("temp3 : "+temp3);
		}
		
		if (temp2.equals(temp3)) {
			System.out.println("입력하신 수 '"+temp1+"'은 회음수입니다.");
		}else {
			System.out.println("입력하신 수 '"+temp1+"'은 회음수가 아닙니다.");
		}
		sc.close();
	}
}
