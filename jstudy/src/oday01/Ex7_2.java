package oday01;

public class Ex7_2 {
/*
 	문제 7 ]
 		*
 		**
 		***
 		****
 		*****

 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { //세로줄이 다섯라인이므로 5번 반복하는 for문 생성
			/*
			  i 0   j 0 1 2 3 4  => 1번
			  i 1   j 0 1 2 3 4  => 2번
			  i 2   j 0 1 2 3 4  => 3번
			  i 3   j 0 1 2 3 4  => 4번
			  i 4   j 0 1 2 3 4  => 5번
			  
			  위와 같은 방식으로 * 모양이 찍혀야 하므로 j가 i랑 값이 같거나 작을 떼 *모양을 하나씩 찍어줌
			 */
			for (int j = 0 ; j <= i; j++) { 
				System.out.print("*");
			}
		System.out.println(); //라인 변경용
		}
	}

}
