package oday01;

public class Ex02 {
	/*
	 * 문제 2] 'A'부터 문자를 10개를 만들어서 출력하세요.
	 * */
	
	public static void main(String[] args) {
		/*
		char cText =  'A';
		String result = "";
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 26 + 1);
			result += (char)(cText+num);
		}
		System.out.println("문자열 : " + result);
		*/
		
		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*256);
			if (num >= 'A' && num <= 'Z') {
				char ch = (char)num;
				System.out.println(i+" 번째 문자 : "+ch);
			}else {
				i--;
				continue;
			}
		}
	}
}


