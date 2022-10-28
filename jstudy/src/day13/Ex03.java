package day13;

import java.util.Scanner;

public class Ex03 {

	/*
	 계산기 프로그램을 작성해서 실행
	 
	 수식입력
	 계산
	 출력 기능은 각각 함수로 작성해서 구현
	*/
	public Ex03() {
		String str = que();
		String[] calList = cal(str);
		String resultStr = result(calList[0],calList[1],calList[2]);
		System.out.println(resultStr);
	}
	
	public String que() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수식입력 : ");
		String str = sc.nextLine();
		
		return str;
	}
	
	public String[] cal(String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				num = i;
			}
		}
		String c1 = str.substring(0, num);
		String c2 = str.substring(num,num+1);
		String c3 = str.substring(num+1);
		
		String[] cal = new String[3];
		cal[0] = c1;
		cal[1] = c2;
		cal[2] = c3;
		
		return cal;
	}
	
	public String result(String s1, String s2, String s3) {
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s3);
		double num3 = 0;
		String str = "";
		switch (s2) {
		case "+":
				num3 = cal1(num1, num2);
				str = num1 + " + " + num2 + " = " + num3;
			break;
		case "-":
				num3 = cal2(num1, num2);
				str = num1 + " - " + num2 + " = " + num3;
			break;
		case "*":
				num3 = cal3(num1, num2);
				str = num1 + " * " + num2 + " = " + num3;
			break;
		case "/":
				num3 = cal4(num1, num2);
				str = num1 + " / " + num2 + " = " + num3;
			break;
		}
		
		return str;
	}
	
	public int cal1(int num1, int num2) {
		return num1 + num2;
	}
	public int cal2(int num1, int num2) {
		return num1 - num2;
	}
	public int cal3(int num1, int num2) {
		return num1 * num2;
	}
	public int cal4(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
