package oday01;

public class Ex09 {
/*
 	
 	문제 9 ]
 		12345
 		23456
 		34567
 		45678
 		56789

 */
	public static void main(String[] args) {
		int num = 0; //임시 변수
		
		for (int i = 0; i < 5; i++) { //세로줄이 다섯라인이므로 5번 반복하는 for문 생성
			for (int j = 0; j < 5 ; j++) { //가로줄 또한 다섯 라인이므로 5번 반복하는 for문 생성
				//1. 12345가 출력 되야 하므로 j값은 print문으로 출력
				//2. 다음 라인의 수가 각 자리에 1을 더한 값인 23456이 출력 되야 하므로 임시 변수 num을 증감연산자를 통해 1씩 증가시켜 더해줌
				System.out.print(j+1+num);  
			}
			num++; // 내부 for문이 끝난 후 num을 1 증가시켜 다음 내부 for문이 돌 때 j값을 1증가 시키기 위해 num변수에 증감연산자를 사용 
			System.out.println(); // 라인 변경용 
		}
	}

}
