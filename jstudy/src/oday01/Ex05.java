package oday01;

public class Ex05 {
	/*
	 * 문제 5] 21 부터 99 사이의 랜덤한 숫자 10개를 만들어서 그 숫자들을 더한 합을 출력해주는 프로그램을 작성
	 * */
	public static void main(String[] args) {

		int result = 0;
		System.out.print("발생한 난수 : ");
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*79+21);
			result += num;
			System.out.print(num+", ");
		}
		System.out.println();
		System.out.println("결과값 : " + result);
	}
}
