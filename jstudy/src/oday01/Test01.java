package oday01;

public class Test01 {
	public static void main(String[] args) {
//		System.out.println("Hello java");
		
		//이클립스에서 자바 소스코드 실행
		//ctrl + F11
		
		//System.out.println(Math.random());
		/*
		 * Math.random() 함수는
		 * Math라는 클래스에 소속된 함수로
		 * 호출할 때마다 0 <= 그리고 < 1 실수를 꺼내서 보여준다.
		 * 
		 * 따라서 원하는 랜덤한 정수를 꺼내는 방법은
		 * 
		 * double no = Math.random();
		 * 
		 * 두 정수 사이의 랜덤한 정수를 발생시키는 방법
		 * (int)(Math.random() * (최댓값 - 최소값 + 1) + 최소값)
		 * 
		 * int result = (int)(no * 10) ==> 0 <= result < 10 
		 * */
		
//		1 ~ 10 사이의 랜덤한 정수를 출력하세요
	
		for (int i = 0; i < 10; i++) {
			int no = (int)(Math.random() * (10-1+1)+1);
			System.out.println(no);
			
		}
		
	}
}
