package day14;

public class Test02 {
	int no1, no2;
	/*
	 * 숫자를 더하는 기능의 plus 함수를 제작하세요.
	 * 
	 * 멤버 변수 no1, no2가 기억하는 숫자를 더하는 기능의 plus 함수로 오버로딩하세요.
	 * 
	 * 세개의 숫자를 입력 받아서 더해서 반환해주는 함수로 오버로딩
	 * 
	 * 두개의 정수를 입력받아서 멤버변수 no1에 셋팅해주는 함수로 오버로딩
	 * */
	public Test02() {
		// TODO Auto-generated constructor stub
	}

	public int plus(int a, int b) {
		return a+b;
	}

	public int plus(int a, int b, int c) {
		return a+b+c;
	}
	
	public int plus() {
		//no1, no2는 전역변수이므로 클래스 내 어디에서든지 사용가능하므로
		//매개변수로 입력되어야 할 필요가 없다.
		return no1 + no2;
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
