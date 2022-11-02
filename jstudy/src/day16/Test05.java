package day16;

import day10.*;

public class Test05 {

	public Test05() {
		int no = (int)abc(10) + (int)abc(20);
		
		Semo s = new Semo();
		((Semo)xyz(s)).width = 20; 
		/*
		 * xyz(s) 의 반환 값은 Figure 타입이고 Figure 클래스는 width를 멤버로 가지고 있지 않으므로
		 * 만약 width를 수정하려면 원래 Semo 타입으로 강제 형변환 해서 수정해줘야한다.
		 * */
		
		
	}
	
	public Object abc(int a) {
		return a;
	}
	
	public Figure xyz(Figure f) {
		return f;
	}
	
	public static void main(String[] args) {
		new Test05();
	}
}
