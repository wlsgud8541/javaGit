package day04;

public class Ex04 {
	/*
	 * 1년은 365.2426일이다.
	 * 이 시간은 몇일 몇시간 몇분 몇초로 이루어져있는지 계산해서 출력하세요.
	 *
	 * 참고] 0.1 일은 0.1 * 24시간
	 * 
	 * */
	public static void main(String[] args) {
		//원본 데이터 저장
		double rYear = 365.2426;

		//나머지 연도 값
		int year = (int) rYear;
		
		//0.2426 * 24(시간) * 60(분) * 60(초) ==> 0.2426에 대한 시간을 초로 환산
		int total = (int)((rYear - year) * 24 * 60 * 60);

		//시간
		int hour = total / 60 / 60;
		//분 
		int min = total / 60 % 60;
		//초
		int sec = total % 60;

		//결과 출력
		System.out.println("hour : "+hour + " / min : "+min + " / sec : "+sec);
	}
}
