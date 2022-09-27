package oday03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex02 {
	/*
	 * 문제2 ]
	 *  1. 두 자리 숫자 두개를 입력받기
	 *  2. 두 수의 최소공배수와 최대공약수를 구해서 출력하는 프로그램을 작성
	 *
	 * 	참고] 
	 * 		최소공배수 : 두 수의 배수 중 최소 숫자. / 반복문 사용
	 * 		최대공약수 : 두 수의 공통 약수 중 최대 숫자.
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("숫자(1) 입력 : ");
		num1 = sc.nextInt();
		System.out.print("숫자(2) 입력 : ");
		num2 = sc.nextInt();
	
		int numMax = num1 > num2 ? num1 : num2;
		int numMin = num1 < num2 ? num1 : num2;

		//최소 공배수
		for (int i = numMax;; i++) {
			if ((i%numMax == 0)&&(i%numMin == 0)) {
				//System.out.println("입력한 숫자 [ "+num1+" , "+num2+" ]의 최소 공배수 : "+i);
				String msg = "입력한 숫자 [ "+num1+" , "+num2+" ]의 최소 공배수 : "+i;
				JOptionPane.showMessageDialog(null, msg);
				break;
			}
		}
		//최대 공약수
		for (int i = numMin; i > 0; i--) {
			if ((numMax%i == 0) && (numMin%i == 0)) {
				System.out.println("입력한 숫자 [ "+num1+" , "+num2+" ]의 최대 공약수 : "+i);
				break;
			}
		}
		sc.close();
	}
}
