package oday01;

public class Ex06 {
/*
 	문제 6]
 		*****
 		*****
 		*****
 		*****
 		*****

 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { //세로줄이 다섯라인이므로 5번 반복하는 for문 생성
			for (int j = 0; j < 5; j++) { //가로줄이 다섯라인이므로 5번 반복하는 for문 생성
				System.out.print("*"); // *모양 출력
			}
			System.out.println(); // 라인 변경용
		}
	}


}
