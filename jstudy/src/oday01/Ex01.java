package oday01;

public class Ex01 {
	/*
	 * 문제 1] 구구단의 단을 랜덤하게 발생시켜서 그 단의 구구단을 출력하는 프로그램을 작성하세요.
	 * */
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 8)+2;
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
}
