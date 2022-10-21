package day08;

public class Test04 {
	
	/*
	 * 원의 정보를 기억할
	 * Won을 제작해서
	 * 반지름 5 ~ 20 사이의 값으로 랜덤하게 갖는
	 * 원 하나를 만들어서 출력해보세요
	 * 
	 * 반지름, 둘레, 넓이
	 * 
	 * 둘레 = 2 * 3.14 * 반지름
	 * 널이 = 반지름 * 반지름 * 3.14
	 * 
	 * */
	public static void main(String[] args) {
		
		//class 객체생성
		Won won = new Won();
		
		//반지름세팅
		won.radius = (int)(Math.random()*16+5);
		//둘레세팅
		won.setRound();
		//면적세팅
		won.setArea();
		
		//출력
		System.out.println("반지름 : "+won.radius);
		System.out.println("둘레 : "+won.round);
		System.out.println("면적 : "+won.area);
	}
}
