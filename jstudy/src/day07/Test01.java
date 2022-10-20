package day07;

public class Test01 {
	/*
	 * 잘못된 switch case 예
	 * 
	 * */
	public static void main(String[] args) {
		
		// 랜덤정수 값
		int num = (int)(Math.random()*10);
		
		//결과값 변수
		String result = "";
		
		//switch ~ case 처리
		switch (num) {
		case 0:
			result = "영";
			System.out.println(num);
		case 1:
			result = "하나";
			System.out.println(num);
		case 2:
			result = "둘";
			System.out.println(num);
		case 3:
			result = "셋";
			System.out.println(num);
		case 4:
			result = "넷";
			System.out.println(num);
		case 5:
			result = "다섯";
			System.out.println(num);
		case 6:
			result = "여섯";
			System.out.println(num);
		case 7:
			result = "일곱";
			System.out.println(num);
		case 8:
			result = "여덟";
			System.out.println(num);
		case 9:
			result = "아홉";
			System.out.println(num);
		}
		System.out.println("입력된 정수는 [ "+ num +" ]이고 [ " + result + " ]입니다.");
	}
}
