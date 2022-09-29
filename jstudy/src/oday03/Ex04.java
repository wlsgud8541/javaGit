package oday03;

/*
 * 문제4 ]
 * 	1. 3 ~ 100사이의 숫자 하나를 랜덤하게 발생시키기
 *  2. 이 숫자가 소수인지 판별해주는 프로그램을 작성.
 *  
 *  참고 ] 소수 : 1과 자기 자신 이외에 나눌 수 있는 수가 없는 수.
 * */

public class Ex04 {
	public static void main(String[] args) {
		int no = (int)(Math.random()*98 +3);
		
		//결과값 변수
		String result = "소수입니다.";
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				// i로 나누어 떨어지는 경우
				result = "소수가 아닙니다.";
				// 반복 작업의 의미가 없어졌으므로 즉시 종료시킨다.
				break;
			}
		}
		
		System.out.println(no + "는 " +result);
	}
}
