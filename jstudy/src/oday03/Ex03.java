package oday03;
/*
 *  문제 3]
 * 	1. 2x + 4y = 10의 방정식을 충족시키는 x, y 의 조합을 출력하세요. 
 *  단, x, y는 모두 0보다 크거나 같아야하고 10보다는 작거나 같아야한다. 두 수 모두 정수
 * 
 * */
public class Ex03 {
	public static void main(String[] args) {
		
		/*
		//내가 한거
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if ((i*2)+(j*4) == 10 ){
					System.out.println("x : "+i+", y: "+j);
				}
			}
		}
		*/
	
		//교수님 방법
		int x, y;
		for (x = 0; x < 10; x++) {
			for (y = 0; y < 10; y++) {
				if (2*x + 4*y == 10) {
					System.out.println("[x : "+x+"],[y : "+y + "] 일 때 [2x+4y=10]을 만족");
				}
			}
		}

		
	}
}
