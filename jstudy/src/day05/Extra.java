package day05;

/*
 * 랜덤하게 0 ~ 100 사이의 정수를 발생시켜서
 * 그 정수를 점수로 갖는 학생의 학점을 출력해주는 프로그램을 장석하세요.
 * 학점은	
 * 
 * 		  F < 60
 * 	60 <= D < 70
 *  70 <= C < 80
 *  80 <= B < 90
 *  90 <= A <= 100
 *  
 *  으로 처리하는 것으로 하고
 *  3항 조건 연산자로 처리하세요.
 *  
 * */
public class Extra {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*101);
		
		String result = (num < 60) ? "F" : (
								(num < 70) ? "D" : (
										(num < 80) ? "C" : (
												(num < 90) ? "B" : "A"))); 
		
		//System.out.println("획득한 점수 :"+num+" / 학점 :"+result);
		System.out.printf("획득한 점수 : %d / 학점 : %s",num,result);
	}
}
