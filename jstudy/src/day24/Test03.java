package day24;

import java.util.regex.*;

public class Test03 {
/*
 * 특정 문자열을 입력한 후
 * 그 문자열 중에서 원하는 규칙에 맞는 부분만 골라서 출력
 * */
	public Test03() {
		String tel = "전화번호 : 010-1111-1111";
		
		// 문자열에서 전화번호만 꺼내기
		// 1. 정규식 패턴 생성
		Pattern form = Pattern.compile("0[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}");
		
		// 2. 검사결과 객체(Mather)를 생성
		Matcher matcher = form.matcher(tel);
		
		// 3. find() 함수를 이용해서 규칙에 맞는 부분이 있는지 확인.
		String result0;
		String result1 = null;
		String result = "";
		if (matcher.find()) {
			// 4. 맞는 부분이 있으며 꺼낸다.
			result = matcher.group();
		}
		
		System.out.println("result : "+result);
		//System.out.println("result0 : "+result0); // ==> 초기화도 안된 상태이므로 에러발생
		//System.out.println("result1 : "+result1);
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
