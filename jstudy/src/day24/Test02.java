package day24;

import java.util.regex.*;

import javax.swing.JOptionPane;

public class Test02 {
/*
 * 전화번호를 입력받아서
 * 형식이 맞는지 검사
 * */
	public Test02() {
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		// 1. 패턴 생성 
		// 	  ==> 생성자가 감춰진 경우이므로 소속 함수 중 반환값이 자기 자신이고 속성이 static인 함수를 호출해서 사용
		Pattern form = Pattern.compile("0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}");
		
		// 2. 정규식 문법을 검사
		// 	  ==> Matcher matcher() 함수를 사용해서 검사
		Matcher matcher = form.matcher(tel);

		// 3. 검사
		// Matcher 클래스안에 검사 결과가 기억됨, 검사 결과가 맞는지 틀린지를 알려주는 함수
		//	  ==> matches();
		
		boolean bool = matcher.matches();
		
		// 결과 변수
		String result = "올바른 형식입니다.";
		if (!bool) {
			result = "올바르지 않은 형식입니다.";
		}
		
		JOptionPane.showMessageDialog(null, "입력받은 번호 ["+tel+"]는(은) "+result);
	}
	public static void main(String[] args) {
		new Test02();
	}
}
