package oday02;

public class Test01 {
	public static void main(String[] args) {
		// 숫자 형태의 문자 4개를 만들어서 순서대로 나열하고
		// 그 숫자를 24로 나눈 몫과 나머지를 계산하세요.
		
		String str = "";
		for (int i = 0; i < 4; i++) {
			char ch = (char)(Math.random() * ('9' - '0' + 1) + '0');
			if (i == 0 && ch == '0') {
				//카운트 1감소
				--i;
				continue;
			}
			str += ch;		
		}
		int num = Integer.parseInt(str);
		int mok = num / 24;
		int namuji = num % 24;
		
		System.out.printf("만든 숫자 : %s \n24로 나눈 몫 : %d \n24로 나눈 나머지 : %d", str, mok, namuji);
	}
}
