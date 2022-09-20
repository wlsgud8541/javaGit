package oday01;

public class Test02 {
	
	public static void main(String[] args) {
		/* 
		 * 10~99사이의 랜덤한 숫자 다섯개를 발생시켜서
		 *  각 숫자가 홀수인지 짝수인지를 판별해서 출력
		 *  */
		
		for (int i = 0; i <5; i++) {
			int num = (int)(Math.random()*(90)+10) ;	
			
			if(num % 2 == 1) {
				System.out.println(num + "는 홀수입니다.");
			}else {
				System.out.println(num + "는 짝수입니다.");
			}
		}
	
	}
	
	/*
	 * void abc() { System.out.println("start!!!"); }
	 */
/*	
	void getPerson() {
		Person p1 = new Person();
		p1.name = "jennie";
		p1.age = 27;
		
		Person na = new Person();
		na.name = "전진형";
		na.age = 30;
	}
*/	
}
