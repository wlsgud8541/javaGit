package day09;

public class Ex01 {
	
	/*
	 * 문제 1 ]
	 * 	'A' ~ 'J'까지의 문자를 랜덤하게 100개를 만든 후 
	 *  각각의 문자가 몇개씩 만들어 졌는지를 그래프 형태로 출력하는 프로그램을 작성해서 실행.
	 *  
	 *  예]
	 *  	'A' : ■■■■■■■■■■
	 *  	'B' : ■■■■
	 *  	...
	 *  	'J' : ■■■■■■■
	 *  
	 * */
	
	public Ex01() {
		//A~J까지 나온 값저장하는 배열
		int[] cnt = new int[10];
		
		for (int i = 0; i < 100; i++) {
			char ch = (char)(Math.random()*('J'-'A'+1)+'A');
			cnt[ch - 'A'] += 1;
		}
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.print((char)('A'+i)+" : ");
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
