package day13;

/*
 * VO(Value Object) 또는 DTO(Data Transfer Object) 클래스 라고 부른다.
 * */
public class Nemo {
	private int garo, sero;
	private double area;
	
	
	// 변수에 셋팅해주는 함수들
	
	//가로 셋팅해주는 함수
	public void setGaro(int garo) {
		// 이 함수는 입력받은 데이터 garo를 멤버변수(field)에 셋팅해주는 기능이다.
		this.garo = garo; // 부여받은 기능을 충실히 수행 했다.
		return;
	}
	
	
	// 변수에 셋팅된 값을 알려주는 함수
	// 가로 알려주는 함수
	public int getGaro() {
		// 멤버변수가 기억하고 있는 값을 알려주는 기능
		// 따라서 함수 실행의 결과는 garo 의 값을 알려줘야 할 것이고
		// 반환값 타입은 garo의 타입을 적으면 될 것이다.
		
		// garo를 반환해준다.
		return garo;
	}
	
	//세로 세팅
	public void setSero(int sero) {
		this.sero = sero;
		return;
	}
	
	//세로 꺼내는 함수
	public int getSero() {
		return sero;
	}
	
	//면적
	//Overloading : 함수의 중첩
	public void setArea() {
		area = garo * sero;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	//면적 알려주는 함수
	public double getArea() {
		return area;
	}
	
	
}
