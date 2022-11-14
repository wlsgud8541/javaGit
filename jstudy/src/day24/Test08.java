package day24;

import java.text.*;

public class Test08 {

	public Test08() {
		/*
		 * 문자열을
		 * 		"이름 : 제니, Teml : 010-1111-1111, age : 27"
		 * 의 형식으로 만들어서 사용하고 싶다.
		 * */
		String pattern = "이름 : {0}\n전화 : {1}\n나이 : {2}";
		MessageFormat form = new MessageFormat(pattern);
		/*
		 * ==>
		 * 		형식 작성방법]
		 * 			동일한 부분을 그대로 쓰고
		 * 			변경되는 부분만 {0}, {1}, {2}, ... 로 기록한다.
		 * 			이 때 {} 안의 숫자는 입력되는 데이터의 순서를 의미한다.
		 * */
		
		// 입력순서대로 배열에 채워준다.
		Object[] data = {"제니", "010-1111-1111", 27};
		String result = form.format(data);
		System.out.println(result);

		
		// 변화되는 데이터들만 배열로 꺼낼 수 있다.
		// 이때 사용되는 함수가 parse()
		Object[] obj = null;
		
		try {
			obj = form.parse(result);
			
			for (Object o : obj) {
				System.out.println(o);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}
