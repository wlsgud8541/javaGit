package oday01;

public class Ex08 {
/*
 	문제 8 ]
 		1111
 		2222
 		3333
 		4444
 		5555

 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { //세로줄이 다섯라인이므로 5번 반복하는 for문 생성
			for (int j = 0; j < 5; j++) { //가로줄이 네개라인이므로 4번 반복하는 for문 생성
				//첫번째 라인에 1111이란 값이 들어가야 하므로 첫번째 반복중인 외부 for문의 i값을 입력
				System.out.print(i+1); 
			}
			System.out.println(); //라인 변경용
		}
		
	}

}
