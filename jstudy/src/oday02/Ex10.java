package oday02;

import java.util.Scanner;

//문제8] 정수 세개를 입력받아서 가장 큰 수를 출력해주는 프로그램 작성
public class Ex10 {
	public static void main(String[] args) {
		int num1, num2, num3, temp, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 = sc.nextInt();

		System.out.print("두번째 숫자 입력 : ");
		num2 = sc.nextInt();
		
		System.out.print("세번째 숫자 입력 : ");
		num3 = sc.nextInt();
		
		
		temp = num1 > num2 ? num1 : num2;
		result = num3 > temp ? num3 : temp;
		
		System.out.println("입력받은 수 '"+num1+"', '"+num2+"', '"+num3+"' 중 가장 큰 수는 '"+ result +"' 입니다.");
		
		sc.close();
	}
}
