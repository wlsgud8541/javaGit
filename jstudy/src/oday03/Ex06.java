package oday03;

/*
 *  문제 6]
 *  	1년은 365.2426일이다.
 * 		이것은 몇 일 몇 시간 몇 분 몇 초인지를 계산해서 출력.
 * 		
 * 		-연산자 문제
 * 		 힌트 0.1일은 0.1 * 24 * 60 * 60 초이다.
 * */


public class Ex06 {
	public static void main(String[] args) {
		double rYear = 365.2426;
		int year = (int)rYear;
		int hour = 0;
		int min = 0;
		int second = (int)((rYear - year) * 24 * 60 * 60);
		
		
		hour = second/60/60;
		second = second % (60*60);
		min = second/60;
		second = second%60;		
		System.out.println(hour+"시간 "+ min+"분 "+second+"초");
		
		
	}
}
