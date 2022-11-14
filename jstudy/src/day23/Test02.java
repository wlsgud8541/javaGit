package day23;

import java.io.FileNotFoundException;

public class Test02 {

	public Test02() {
		try {
			abc();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 예외의 범위는 좁은 것부터 나열하는 것이 원칙이다.
	}
	
	public void abc() throws FileNotFoundException{
		// 강제로 예외를 던져보자.
		throw new FileNotFoundException();
		
//		System.out.println("abc 함수 종료"); // 이 부분은 위에서 예외가 강제로 발생하기 때문에 실행 될 수 없다.
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
