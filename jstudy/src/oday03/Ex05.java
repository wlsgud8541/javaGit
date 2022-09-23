package oday03;
/*
 * 문제5] 
 * 		1. 두 사람이 등산을 하는데 한 사람은 이제 등산을 시작하려고 하고 다른 사람은 정상에서 하산을 시작하려고 한다.
 * 		올라가는 속도는 0.54 m/s 이고 하산하는 사람의 속도는 1.07m/s 이다. 산의 높이는 7564m이다.
 * 		7564/0.54 + 7564/1.07 = 7564
 * 		두 사람이 만나는 시점은 몇분 몇초 뒤인지 출력하는 프로그램을 작성.
 * 
 * 
 * */

public class Ex05 {
	public static void main(String[] args) {
		double a = 0.54;
		double b = 1.07;
		int mt = 7564;
		int hour = 0;
		int min = 0;
		int second = 0;
		/*
		for (int i = 0;; i++) {
			if ((a*i) + (b*i) >= mt) {
				hour = i/60/60;
				min = i/60%60;
				second = i%60%60;
				System.out.println(hour+"시간 "+ min+"분 "+second+"초");
				break;
			}
		}
		*/
		
		for (;;second++) {
			if (a*second >= (mt - b*second)) {
				break;
			}
		}
		hour = second/60/60;
		second = second % (60*60);
		min = second/60;
		second = second%60;		
		System.out.println(hour+"시간 "+ min+"분 "+second+"초");
	}
}
