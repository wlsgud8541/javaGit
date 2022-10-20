package day07;

public class Test04 {
	public static void main(String[] args) {
		
		// 8단 구구단을 출력하세요.
		
		//단 변수
		int dan = 8;
		
		//곱 변수
		int gop = 1;
		
		do {
			//결과값 변수
			int result = dan * gop;
			
			System.out.println(dan + "x" + gop + "=" + result);
			
			gop++;
		} while (gop < 10);
		
	
	}
	
}
