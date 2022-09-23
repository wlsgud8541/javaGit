package oday03;
/*
 *  문제 3]
 * 	1. 2x + 4y = 10의 방정식을 충족시키는 x, y 의 조합을 출력하세요. 
 *  단, x, y는 모두 0보다 크거나 같아야하고 10보다는 작거나 같아야한다. 두 수 모두 정수
 * 
 * */
public class Ex03 {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if ((i*2)+(j*4) == 10 ){
					System.out.println("x : "+i+" ,y: "+j);
				}
			}
		}
	}
}
