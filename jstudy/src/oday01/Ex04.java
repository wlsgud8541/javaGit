package oday01;

public class Ex04 {
	/*
	 * 문제 4] 1 - 2 + 3 - 4 + 5 - 6 ...했을 경우 어디까지 계산하면 언제 그 결과가 100을 넘기게되는지 출력하세요. 
	 * */
	
	public static void main(String[] args) {
		int num = 1;
		int result = 0;
		while (true) {
			if (num % 2 == 1) {
				result += num;
				//System.out.println("홀수 : "+ num + "결과 : " + result);
			}else {
				result -= num;
				//System.out.println("짝수 : "+ num + "결과 : " + result);
			}
			num++;
			if (result > 100) {
				System.out.println("마지막 계산 숫자 : "+num);
				break;
			}
		}
	}
}
