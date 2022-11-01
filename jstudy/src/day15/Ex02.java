package day15;

import java.util.Scanner;

public class Ex02 {
/*
 * 1. 다음두 변수르르 기억하는 클래스 Point 를 제작
 * 		int x, y;
 * 
 * 2. 생성자를 정의하세요
 * 		1) 기본 생성자 함수
 * 		2) 두 수를 알려주면 그 수를 x,y에 기억해서 이 클래스의 객체를 생성해주는 생성자
 * 		3) 두 수를 배열로 알려주면
 * 			그 수를 x, y에 기억하는 생성자
 * 	
 * 3. 다음 기능을 가진 함수를 추가하세요.
 * 		1) 입력된 값으로 x의 값을 수정하는 함수
 * 		2) 입력된 값으로 y의 값을 수정하는 함수
 * 		3) 입력된 두 값으로 x, y를 수정하는 함수 setXy()
 * 		4) getters 함수
 * 		5) x와 y값을 출력해주는 함수 toPrint
 * 
 * 4. 위 클래스를 사용해서 객체를 만들고 데이터를 채우고 출력
 * 		입력 또는 랜덤
 * 
 * */
	public Ex02() {
		Point point = new Point();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("(1) x값을 입력 : ");
		point.x = sc.nextInt();
		
		System.out.print("(2) y값을 입력 : ");
		point.y = sc.nextInt();
		
		point.toPrint();
		System.out.println("=========================================");
	
		int[] nums = new int[2];
		
		System.out.print("(2) x값을 입력 : ");
		nums[0] = sc.nextInt();
		System.out.print("(2) y값을 입력 : ");
		nums[1] = sc.nextInt();

		point = new Point(nums);
		
		sc.close();
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
