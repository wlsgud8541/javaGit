package oday02;

import java.util.Scanner;

public class Ex13 {
	/* 문제 11]
	 * 다섯자리의 숫자를 입력받아서 그 숫자가 회문수인지 아닌지를 판별하는 프로그램 작성
	 * 
	 * 참고] 회문수 : 앞에서 읽으나 뒤에서 읽으나 같은 수를 회문수라고 한다. 예) 12321 => 회문수
	 * 
	 * 해결방법 ]
	 * 	1. 쉬운방법 ] 문자열로 처리하는 방법
	 * 
	 *  2. 어려운방법 ] 숫자로 처리하는 방법
	 * 
	 * */
	
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int no  = sc.nextInt();
		int tmp = no;
		sc.close();
		
		int num = (int) Math.pow(10, (no + "").length() -1 );
		String result = "회문수이다.";
		for (int i = 0; i < (no + "").length() / 2; i++) {
			if ((tmp / num) != (tmp % 10)) {
				result = "회문수가 아니다.";
				break;
			}
			tmp = tmp % num / 10;
			num /= 100;
		}
		System.out.println("입력받은 숫자 [ " + no + " ]는 " + result);
		
		
		
	}
}
