package oday03;

/*
 * 문제 1 ]
 * 		1. 5자리 숫자를 랜덤하게 발생
 * 		2. 각 자리수의 합을 구해주는 프로그램을 작성
 * */
public class Ex01 {
	public static void main(String[] args) {
		String tNum = (int)(Math.random()*90000+10001)+"";
		String temp;
		int num = 0;
		int result = 0;
		for (int i = 0; i < tNum.length(); i++) {
			temp = tNum.charAt(i)+"";
			num = Integer.parseInt(temp);
			result += num;
		}
		System.out.println("발생한 숫자 : "+tNum ); 
		System.out.println("계산 결과 : "+result);
		 
	}
}
