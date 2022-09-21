package oday02;

import java.util.Scanner;

public class Ex07 {
	
	/* 문제5]
	 * 소수점이 있는 숫자를 입력한 후
	 * 소수이하 셋째자리에서 반올림한 결과를 계한해서 출력
	 * 
	 * 참고] 입력받은 값 뽑아오는 방법
	 * nextInt...nextFloat...nextDouble...
	 * */
	public static void main(String[] args) {
		int temp1,temp2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 입력 : ");
		double num = sc.nextDouble();
		result = (int)(num*100+0.5)/100.0;
		
		System.out.println("입력값에 대한 반올림 결과는 '"+result+"' 입니다.");
		sc.close();
	}
}
