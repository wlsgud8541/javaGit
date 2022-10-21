package day08;

public class Test01 {
	/*
	 * 구구단을 출력하는데
	 * 4 * 6 이되면 구구단 출력을 종료하세요
	 * 반복문으로 처리하세요
	 * 
	 * */
	
	public static void main(String[] args) {
		
		loop:
		for (int dan = 2; dan < 10; dan++) {
			for (int gop = 1; gop < 10; gop++) {
				if (dan == 4 && gop == 6) {
					break loop;
				}
				//출력
				System.out.println(dan + " x " + gop + " = " + (dan*gop));
			}
		}
		System.out.println("구구단 출력 종료");
	}
}
