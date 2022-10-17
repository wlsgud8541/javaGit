package day04;

import java.util.Scanner;

public class Test02 {
/*
 * 콘솔로 입력받는 방법
 * 
 * 1. import java.unil.Scanner; // Scanner 클래스를 사용할 준비
 *	  또는
 * 	  import java.util.*; // java.util 폴더내에 있는 모든 클래스를 사용할 준비를 하는 것이 된다.
 *    로 사용할 클래스가 있는 위치를 알려준다.
 * 
 * 
 * 2. 함수 내에서
 * 	  Scanner sc = new Scanner(System.in);
 *    명령으로 입력도구 객체를 만든다.
 * 
 * 
 * 3. 입력 메세지를 출력해준다.
 * 	  System.out.println("메세지");
 * 
 * 
 * 4. 사용목적에 따라서 함수를 호출해서 입력데이터를 꺼내면 된다.
 *     
 *     문자열 ] String str = sc.nextLine();
 *     
 *     정수   ] int no = sc.nextInt();
 *     
 *     실수   ] double no2 = sc.nextDouble();
 *     
 *     등 으로 읽어서 변수에 기억시켜서 사용하면 된다. 
 * 
 * */
	
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
	
		// 입력메세지 출력
		System.out.print("이름입력 : ");
		
		// 읽어서 변수 기억
		String name = sc.nextLine();
		
		// 나이 입력 메세지 출력
		System.out.print("나이 입력 : ");
		
		// 읽어서 변수 기억
		int age = sc.nextInt();
		
		// 출력
		System.out.printf("이름: %4s / 나이: %3d", name, age);
	}
}
