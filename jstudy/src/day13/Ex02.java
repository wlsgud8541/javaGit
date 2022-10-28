package day13;

public class Ex02 {
	/* 10개의 원을 기억할 Circle 배열을 입력받아서
	 * 반지름을 랜덤하게 셋팅하고 둘레와 넓이를 채워서
	 * 배열을 완성해서
	 * 출력해주는 프로그램을 작성하세요
	 * 
	 * 단, 각 기능은 함수를 제작해서 처리하세요
	 * 
	 * */
	
	public Ex02() {
		Circle[] won = new Circle[10];
		
		
		for (int i = 0; i < won.length; i++) {
			Circle won2 = new Circle();
			int num = (int)(Math.random()*16+5);
			won[i] = setWon(won2, num);
		}		
		//setWon(won);
		
		result(won);
	}
	
	public Circle setWon(Circle won, int num) {
		
		won.setRad(num);
		won.setAround();
		won.setArea();
		
		return won;
	}

	public void result(Circle[] won) {
		for (int i = 0; i < won.length; i++) {
			System.out.println(won[i].getRad());
			System.out.println(won[i].getAround());
			System.out.println(won[i].getArea());
		}
	}
	
	
	/*
	public Circle[] setWon(Circle[] won) {
		for (int i = 0; i < won.length; i++) {
			Circle won2 = new Circle();
			int num = (int)(Math.random()*16+5);
			won2.setRad(num);
			won2.setAround();
			won2.setArea();
			won[i] = won2;
		}
		return won;
	}
	*/
	
	public static void main(String[] args) {
		new Ex02();
	}
}
