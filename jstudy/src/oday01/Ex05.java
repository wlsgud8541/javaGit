package oday01;

public class Ex05 {
	/*
	 * 문제 5] 21 부터 99 사이의 랜덤한 숫자 10개를 만들어서 그 숫자들을 더한 합을 출력해주는 프로그램을 작성
	 * */
	public static void main(String[] args) {

		int result = 0; //결과값 저장 변수
		System.out.print("발생한 난수 : ");
		
		//랜덤한 숫자 10개를 만들어야 하므로 10번 반복하는 for문 생성
		for (int i = 0; i < 10; i++) {
			// 21부터 99사이의 랜덤한 숫자를 뽑아내야하므로 (최대값 - 최소값 +1) + 최소값을 난수 생성 범위로 지정
			// Math.random() 함수는 0~1사이의 실수를 반환하기 때문에 뽑으려는 값 보다 1 높은 값을 최대값으로 설정해야함. 
			// ex) 10이 최댓값일 경우 9.9999999999... 까지 밖에 반환못한다.
			int num = (int)(Math.random()*79+21); 
			result += num; // 결과값 저장 변수에 저장 
			System.out.print(num+", ");
		}
		System.out.println();
		System.out.println("결과값 : " + result);
	}
}
