package day17;

import java.util.Calendar;

public class Test02 {

	
	public Test02() {
		//Calendar cal = new Calendar(); // Calendar클래스는 추상클래스라서 new 시킬 수 없다.
		Calendar cal = Calendar.getInstance();

		String time = cal.getTime().toString();
		
		System.out.println("sTime : "+time);
	}

	public static void main(String[] args) {
		new Test02();
	}
}
