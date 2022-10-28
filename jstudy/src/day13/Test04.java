package day13;

public class Test04 {
	/*
	 * 랜덤하게 가로, 세로 길이를 만들어서
	 * 사각형의 면적을 출력해주는 프로그램을 작성하세요
	 * 단,
	 * 	길이 셋팅
	 * 	면적 계산
	 * 	출력 기능
	 * 은 함수로 제작해서 해결하세요.
	 * */
	int garo, sero, area; // 전역변수이므로 클래스내의 어느곳에서든지 접근 가능하게 된다.
	
	public Test04() {
		setLength();
		setArea();
		toPring();
	}
	public static void main(String[] args) {
		new Test04();
	}
	
	public void setLength() {
		garo = (int)(Math.random()*16+5);
		sero = (int)(Math.random()*16+5);
	}
	
	public void setArea() {
		area = garo * sero;
	}
	
	public void toPring() {
		System.out.printf("가로가 %3d이고 세로가 %3d 인 사각형의 넓이는 %4d 입니다.",garo,sero,area);
	}
}
