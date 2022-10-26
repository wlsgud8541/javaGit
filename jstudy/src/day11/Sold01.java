package day11;

public class Sold01 {
	
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
	
	public Sold01() {
		// 각 문자의 발생 카운트를 기억할 배열
		int[] cnt = new int[10];
		
		// 배열에 만들어진 문자의 카운트를 100번 누적 작업처리
		/*
		 * 		참고]
		 * 			'A' 라는 문자가 랜덤하게 만들어 진 경우
		 * 			처리내용 ]
		 * 					cnt[0] += 1
		 * 					<==  0 : 'A' - 'A'
		 * 					
		 * 					'D' 가 발생한 경우
		 * 					cnt[3] += 1;
		 *					<== 3 : 'D' - 'A'
	 	 * 
	 	 *					따라서 발생한 문자의 카운트를 기억하는 배열 cnt의 인덱스는
	 	 * 
	 	 * 						발생한문자 - 'A'
	 	 * 					로 계산하면된다.
		 * */
			for (int i = 0; i < 100; i++) {
				char ch = (char)(Math.random()*('J'-'A' +1) + 'A');
				
				// 위치값 만들고
				int idx = ch - 'A';
				
				cnt[idx] += 1;
			}
			
			// 내용 출력
			for (int i = 0; i < cnt.length; i++) {
				//예 ] A : ******* 에서 [A : ] 부분부터 출력해준다.
				/*
				 * A : 'A' + 0
				 * B : 'A' + 1
				 * ..
				 * J : 'A' + 9
				 * */
				// 문자 만들고
				char ch = (char)('A'+i);
				System.out.print(ch + " : ");
				// 횟수 꺼내고
				int count = cnt[i];
				// 출력
				for (int j = 0; j < count; j++) {
					System.out.print("*");
				}
				//별을 모두 출력했으면 다음 문자 출력을 위해서 줄바꿈해준다.
				System.out.println();
			}
		
	}
	
	public static void main(String[] args) {
		new Sold01();
	}
}
