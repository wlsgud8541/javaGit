package oday02;

import java.util.Scanner;

public class Ex12 {
	
	/*
	 * 문제 10]
	 * 	전기 요금을 계산해주는 프로그램을 작성하세요.
	 * 			   코드	  기본요금   사용요금
	 * 	가정용  	1		3800	   245
	 *  산업용  	2		2400	   157
	 *  교육용  	3		2900       169
	 *  상업용  	4		3200       174
	 * 
	 * 전기요금 계산식 : 기본요금 + 사용량 * 사용요금
	 * 
	 * 1. 코드를 입력
	 * 2. 사용량 입력
	 * 3. 전기요금을 출력해주는 프로그램 
	 * */
	public static void main(String[] args) {
		String user = "";
		int result = 0;
		int code;
		int use;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("(1)가정용 / (2)산업용 / (3)교육용 / (4)상업용 / (-1)종료");
			System.out.println("================================================================");
			System.out.print("코드 입력 : ");	
			code = sc.nextInt();
			if (code == -1) {
				System.out.println("======================");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("======================");
				break;
			}
			System.out.print("사용량 입력 : ");	
			use = sc.nextInt();
			
			if (code == 1) {
				result = 3800 + (use*245);
				user = "가정용";
			}else if (code == 2) {
				result = 2400 + (use*157);
				user = "산업용";
			}else if (code == 3) {
				result = 2900 + (use*169);
				user = "교육용";
			}else if (code == 4) {
				result = 3200 + (use*174);
				user = "상업용";
			}
			System.out.println("'"+user+"' 의 전기요금은 '"+result+"원' 입니다.");
			System.out.println("================================================================");
			System.out.println();
		}
		sc.close();
	}
}
