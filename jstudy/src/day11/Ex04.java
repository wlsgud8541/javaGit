package day11;

import java.util.Scanner;

public class Ex04 {
/*
 * 문제 4 ]
 * 		계산식을 입력 받아서
 * 		그 식을 숫자와 연산기호를 기억할 배열을 만들어서 기억시키고
 * 		그 배열을 이용한 계산기 프로그램을 작성해서 실행하세요.
 * 
 * 		예]
 * 			1+1
 * 			==>
 * 			sik[0] = "1";
 * 			sik[1] = "+";	
 * 			sik[2] = "1";
 * 			sik[3] = "2";
 * 
 * 		참고 ]
 * 			문자열에서 공백 제거하는 방법
 * 			==> 문자열.replaceAll(" ","");
 * */
	public Ex04() {
		String[] sik = new String[4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산식 입력 : ");
		String str = sc.nextLine().replaceAll(" " ,"");
		
		int num = 0;
		if (str.contains("+")) {
			num = str.lastIndexOf("+");
		}else if (str.contains("-")) {
			num = str.lastIndexOf("-");
		}else if (str.contains("/")) {
			num = str.lastIndexOf("/");
		}else if (str.contains("*")) {
			num = str.lastIndexOf("*");
		}
		
		/*
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				num = i;
				break;
			}
		}
		*/
		
		sik[0] = str.substring(0,num);
		sik[1] = str.substring(num,num+1);
		sik[2] = str.substring(num+1);
		
		if (sik[1].equals("+")) {
			sik[3] = (Integer.parseInt(sik[0])+Integer.parseInt(sik[2]))+"";
		}else if (sik[1].equals("-")) {
			sik[3] = (Integer.parseInt(sik[0])-Integer.parseInt(sik[2]))+"";
		}else if (sik[1].equals("/")) {
			sik[3] = (Integer.parseInt(sik[0])/Integer.parseInt(sik[2]))+"";
		}else if (sik[1].equals("*")) {
			sik[3] = (Integer.parseInt(sik[0])*Integer.parseInt(sik[2]))+"";
		}
		
		System.out.println(str+"의 결과는 ["+sik[3]+"] 입니다.");
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
