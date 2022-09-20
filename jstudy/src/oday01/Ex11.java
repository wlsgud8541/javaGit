package oday01;

import java.util.Scanner;

public class Ex11 {
/*
	두 수를 입력받아서
	두 수의 최대 공약수를 출력해주는 프로그램을 작성하세요.
	
	최대공약수 : 두수를 나눌수 있는 수 중 제일 큰 수
	
	최소 공배수도 해보세요.
	
 */
	public static void main(String[] args) {
		int num1 = 0;  //숫자입력용 변수 1
		int num2 = 0; //숫자입력용 변수 2
		int tempNum1 = 0; //임시변수
		int tempNum2 = 0; //임시변수
		int resultNum1 = 0; //결과값 저장변수 - 최대 공약수
		int resultNum2 = 0; //결과값 저장변수 - 최소 공배수
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		num2 = sc.nextInt();
		/*
		//tempNum1 작은수
		//tempNem2 큰수
		if (num1 < num2) {
			tempNum1 = num1;
			tempNum2 = num2;
		}else if (num1 > num2) {
			tempNum1 = num2;
			tempNum2 = num1;
		}
		
		for (int i = 1; i <= tempNum1; i++) {
			if (tempNum1 % i == 0) {
				if (tempNum2 % i == 0) {
					resultNum1 = i;
				}
			}
		}
		//tempNum1 12
		//tempNum2 24 
		
		// a : 24 * 1 = 24
		// b : 12*1=12 , b : 12*2=24 .....
		
		loop:
		for (int i = 1; i <= tempNum1; i++) {
			int a = tempNum2 * i; //큰수 수를 작은 수 와 동일한 값까지 곱함 24
			for (int j = 1; j <= tempNum2; j++) {
				int b = tempNum1*j;
				if (a == b) {
					resultNum2 = b;
					break loop;
				}
			}
		}
		
		System.out.println("최대 공약수 : " + resultNum1);
		System.out.println("최소 공배수 : " + resultNum2);
		*/
		
		
		int min, max;
		//삼항연산자로 입력받은 값의 가장 작은수와 큰수를 찾는다. 굳이 위 코드처럼 if문 사용할 필요 없음!
		min = (num1 <= num2) ? num1:num2;
		max = (num1 <= num2) ? num2:num1;
		
		// 최대 공약수 : 두 수를 나누는 가장 큰 숫자
		// 두 숫자를 나누는 가장 큰 숫자를 찾는 것이므로 작은 값을 기본값으로 1씩 감소 시키면서 가장 큰 공약수를 찾는다.  
		
		for(int i = min ; i > 1 ; i-- ) { // 작은수부터 시작, min값을 1식 감소시키면서 
			if(min % i == 0 && max % i == 0) { // 작은 수(min) 과 큰 수 (max)가 min부터 1씩 감소시킨 i값으로 나눴을 때 0이 나온다면 두 수의 최대 공약수이다. 
				System.out.println("두수 " + min + ", " + max + " 의 최대 공약수는 " + i + " 입니다.");
				break;
			}
		}
		// 최소 공배수
		// 큰수부터 무한히 1씩 증가 작은 수로 나눌 수 있는 수가 나올때까지
		// 조건) max부터 1씩 증가한 수가 min값으로도 나뉘고 max값으로도 나뉘는 경우가 최소 공배수 
		for (int i = max ; max <= i; i++) {
			if (i % min == 0 && i % max == 0) {
				System.out.println("두수 " + min + ", " + max + " 의 최소 공배수는 " + i + " 입니다.");
				break;
			}
		}
		
		sc.close();
	}

}
