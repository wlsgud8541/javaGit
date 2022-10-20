package day07;

import java.util.HashSet;

public class Test03 {
	/*
	 * 1~45 까지의 랜덤한 정수를 6개 만들어보자.
	 * */
	public static void main(String[] args) {
		/*
		 * 참고] while 명령은 반복의 횟수를 제어할 카운터변수가 형식에 포함되어있지 않다.
		 * 		 따라서 횟수를 제어하려면 먼저 카운터 변수를 만들어 놓고 사용해야 한다. 
		 * */
		
		// 카운터 변수
		int count = 0;
		while(count < 6) { //6번 반복
			//랜덤하게 숫자를 만든다.
			int num = (int)(Math.random() * 45 + 1); 
			
			//출력한다.
			System.out.println(num);
			
			//카운터변수를 증가 시킨다.
			count++;
		}
		
		/*
		 * Set의 특징
		 * 	1. 입력순서를 보장하지 않는다.
		 *  2. 중복데이터를 허락하지 않는다.
		 * */
		
		HashSet lotto = new HashSet();
		
		while(lotto.size() < 6) {
			int num = (int)(Math.random() * 45 + 1);
			lotto.add(num);
		}
		
		for (Object o : lotto) {
			System.out.print(o + ", ");
		}
	}
}
