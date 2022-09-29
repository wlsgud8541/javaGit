package oday03;

import javax.swing.JOptionPane;

/*
 * 문제 1 ]
 * 		1. 5자리 숫자를 랜덤하게 발생
 * 		2. 각 자리수의 합을 구해주는 프로그램을 작성
 * */
public class Ex01 {
	public static void main(String[] args) {
		/*
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
		*/
		
		//숫자 입력 받기
		String sno = JOptionPane.showInputDialog("다섯자리 숫자를 입력");
		//문자열 정수로 변환
		int no = Integer.parseInt(sno);
		//임시변수에 데이터 기억
		int tmp = no;
		//결과값 변수
		int result = 0;
		//각자리 수 꺼내서 더하기
	
		//방법 1. 뒷자리수 부터 꺼내기
		/*
		while (tmp > 0) {
			//맨 뒷자리 꺼내기
			int num = tmp % 10;
			result += num;
			tmp /= 10;
		}
		*/
		
		//방법 2. 앞자리 수부터 꺼내기
		/*
		int gop = 10000;
		while (tmp > 0) {
			// 맨 앞자리 숫자 꺼내기
			int num = tmp / gop;
			result += num;
			tmp %= gop;
			gop /= 10;
		}
		*/
		
		//방법 3. 문자열에서 문자 추출
		for (int i = 0; i < sno.length(); i++) {
			// 맨 앞자리부터 문자 하나씩 꺼내고
			char ch = sno.charAt(i);
			
			//1. char를 숫자로 바꾸는 방법 - 문자를 숫자로 만들기 char의 경우 - '0'을 하면 원래 숫자가 나온다.
			//int num = ch - '0';
			
			//2. char를 문자열로 바꿔서 숫자로 바꾸는 방법
			int num = Integer.parseInt(ch+"");
			
			result += num;
		}

		//결과출력
		JOptionPane.showMessageDialog(null, "[ "+no+" ] 의 각 자리 수의 합은 [ "+result+" ] 입니다." );
	}
}
