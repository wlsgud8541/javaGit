package day13;

public class Ex01 {

	/*
	 * 반환값을 랜덤하게 입력한 후
	 * 원의 넓이와 둘레를 계산해서
	 * 출력해주는 프로그램을 제작하세요.
	 * 단,
	 * 		반지름 셋팅
	 * 		넓이 계산
	 * 		둘레 계산
	 * 		출력 기능
	 * 은 각각의 함수로 제작해서 하세요.
	 * */
	
	int rad;
	double arround, area;
	
	public Ex01() {
		int num = (int)(Math.random()*16+5);
		setRad(num);
		setArround();
		setArea();
		result();
		
	}
	
	public void setRad(int rad) {
		this.rad = rad;
	}
	
	public void setArround() {
		arround = 2*3.14*rad;
	}

	public void setArea() {
		area = rad*rad*3.14;
	}
	
	public void result() {
		System.out.println("반지름 : " + rad + "\n둘레 : "+arround + "\n넓이 : "+area);
	} 
	
	public static void main(String[] args) {
		new Ex01();
	}
}
