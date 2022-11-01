package day14;

public class Test04 {
/*
	public Test04(int no) {

	}
	//이렇게 생성자를 정의 하게되면 JVM은 기본 생성자를 만들어 주지 않는다.
*/
	
	public static void main(String[] args) {
		new Test04();
		// 생성자를 하나도 정의하지 않으면
		// 자바 가상 머신이 내부적으로 기본 생성자(매개변수가 없는 생성자)를 만들어서
		// 호출 할 수 있게 된다.
		
	}
}
