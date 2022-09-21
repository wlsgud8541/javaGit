package oday02;

public class EX06 {
	/*
	 * 문제4] 화씨(fahreheit) 온도 100도는 섭씨(celcius)  온도 몇도인지 출력
	 * 		  -형변환필요
	 * 
	 * 참고 ] 
	 * 		물리공식)
	 * 		섭씨온도 = 5 / 9 * (화씨온도 - 32)
	 * */
	
	public static void main(String[] args) {
		int fahreheit = 100;
		double celcius = 0;
		
		celcius = (double)5/9*(fahreheit-32);
		celcius = (int)(celcius*100+0.5)/100.0;
			
		/* 반올림처리
		 * 37.7778 * 100 = 3777.78
		 * 3777.78+0.5 = 3778.28
		 * int로 형변환 하면 3778
		 * 3778/100 = 37.78
		 * */
		
		System.out.println("화씨 온도 화씨 '"+fahreheit+"'도의 섭씨 온도는 약 섭씨 '"+celcius+"'도 입니다.");
	}
}
