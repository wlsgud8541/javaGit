package oday02;

public class Ex05 {
	/*
	 * 문제3 ] 
	 * 		1. 0~255 사이의 랜덤한 아스키 코드를 만들기
	 * 		2. 이 코드값에 해당하는 문자가 알파벳인지 아닌지 판별
	 * 		(a<= ? <=z)||(A<= ? <=Z)
	 * 
	 * */
	public static void main(String[] args) {
		int num = (int)(Math.random()*255+1);
		char ch = (char)num;
		if (( ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z')) {
			System.out.println("'"+ch+"' 값은 알파벳입니다.");
		}else {
			System.out.println("'"+ch+"' 값은 알파벳이 아닙니다.");
		}
	}
}
