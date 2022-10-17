package day04;

public class Ex03 {
	/*
	 * 54232원을 물건 값으로 지불해야 할 때 
	 * 우리나라 화폐단위로 각각 몇개씩 필요한지 계산해서 출력하세요.
	 * 		화폐단위 ] 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1
	 * 
	 * */
	
	public static void main(String[] args) {
		//원래 금액 저장 변수
		int pay = 54232;
		
		//화폐단위 배열
		int[] money = {50000,10000,5000,1000,500,100,50,10,1};
		
		//결과값 저장 변수
		int result = 0; 
		
		for (int i = 0; i < money.length; i++) {
			//화폐가 필요한 갯수 구하기 
			result = pay/money[i];
			//필요한 화폐를 제외한 잔돈 구하기
			pay %= money[i];
			//결과 출력
			System.out.println(money[i]+"원 "+result+"개");
		}
	}
}
