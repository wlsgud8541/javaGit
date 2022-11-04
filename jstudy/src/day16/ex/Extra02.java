package day16.ex;

public class Extra02 {
/*
	
	Sub01 클래스를 제작하세요.
	이 클래스는 
		0 ~ 2 사이의 정수를 랜덤하게 10 발생시켜서
		Extra 클래스의 객체가 가지고 있는 배열 변수에 셋팅하고
		그 내용을 출력해주는 기능을 가지고 있다.
		
	Sub01에서 배열을 완성하고 결과를 출력하세요.
	배열을 완성하고 배열의 내용을 출력하는 기능은 Sub01에서 구현하세요.
	
	힌트 ]
		this : 현재 실행중인 객체 자기 자신의 주소를 기억하는 예약된 변수
	
 */
	private Dohyung[] arr;
	private Sub02 sub;
	
	public Extra02() {
		sub = new Sub02(this);
		sub.setArr();	
		sub.setPrint();
	}
	public static void main(String[] args) {
		new Extra02();
	}
	
	public Dohyung[] getArr() {
		return arr;
	}
	public void setArr(Dohyung[] arr) {
		this.arr = arr;
	}
	public Sub02 getSub() {
		return sub;
	}
	public void setSub(Sub02 sub) {
		this.sub = sub;
	}
}