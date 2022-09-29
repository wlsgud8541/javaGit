package oday07;

public class Ex01 {
	/*
	 * 79456원을 샌드위치 값으로 지불하려고 한다.
	 * 이 금액은 우리나라 화ㅠㅖ가 각각 몇개로 지불해야하는지 계산해서 출력하세요.
	 */
	public static void main(String[] args) {
		int price = 79456;
		int result = 0;
		
		/*
		//하드코딩 버전***********************************************************************************************
		int num50000 = 0;
		int num10000 = 0;
		int num5000 = 0;
		int num1000 = 0;
		int num500 = 0;
		int num100 = 0;
		int num50 = 0;
		int num10 = 0;
		int num1 = 0;
		
		num50000 = 79456 / 50000;
		num10000 = (79456 % 50000) / 10000;
		num5000 = ((79456 % 50000) % 10000) / 5000;
		num1000 = (((79456 % 50000) % 10000) % 5000) / 1000;
		num500 = ((((79456 % 50000) % 10000) % 5000) % 1000) / 500;
		num100 = (((((79456 % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		num50 = ((((((79456 % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		num10 = (((((((79456 % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		num1 = (((((((79456 % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10 ;
		result = (num50000 * 50000) + (num10000 * 10000) + (num5000 * 5000) + (num1000 * 1000) + (num500 * 500) + (num100 * 100) + (num50 * 50) + (num10 * 10) + num1;
		
		System.out.println("5만원권 갯수 : "+ num50000);
		System.out.println("1만원권 갯수 : "+ num10000);
		System.out.println("5천원권 갯수 : "+ num5000);
		System.out.println("1천원권 갯수 : "+ num1000);
		System.out.println("500원 동전 갯수 : "+ num500);
		System.out.println("100원 동전 갯수 : "+ num100);
		System.out.println("50원 동전 갯수 : "+ num50);
		System.out.println("10원 동전 갯수 : "+ num10);
		System.out.println("1원 동전 갯수 : "+ num1);
		System.out.println("총합 : "+result);
		*/
		
		
		//for문 버전***********************************************************************************************
		int []money = {50000,10000,5000,1000,500,100,50,10,1};
		int priceResult = 0;
		/*
		for (int i = 0; i < money.length; i++) {
			result = price / money[i];
			price = price % money[i];
			priceResult += result*money[i];
			System.out.println("["+money[i]+"] 원 갯수 : "+ result);
		}
		System.out.println("총 합 : " + priceResult+"원");
		*/
		
		
		/*
		//forEach문 버전***********************************************************************************************
		for (int mon : money) {
			result = price / mon;
			price = price % mon;
			priceResult += result*mon;
			System.out.println("["+mon+"] 원 갯수 : "+ result);
		}
		System.out.println("총 합 : " + priceResult+"원");
		*/
		
		
		//while문 버전***********************************************************************************************
		int count = 0;
		while (price > 0) {
			result = price / money[count];
			price = price % money[count];
			priceResult += result*money[count];
			System.out.println("["+money[count]+"] 원 갯수 : "+ result);
			count++;
		}
		System.out.println("총 합 : " + priceResult+"원");
		
		
		
	}
}
