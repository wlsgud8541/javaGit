package day18;

import java.util.*;

public class Test01 {

	public Test01() {

		//StringBuffer 객체 만들기
		StringBuffer buff = new StringBuffer("neme=");
		
		//데이터 덧붙이기
		buff.append("jennie");
		buff.append("&id=jennie");
		buff.append("&pw=12345");
		buff.append("&mail=jennie@githrd.com");
		
		String param = buff.toString();
		//문자열로 변환해서 출력하기
		System.out.println(param);
		
		//데이터 분리 : StringTokenizer로 처리
		//분리문자 : &
		StringTokenizer token = new StringTokenizer(param, "&"); 
		//StringTokenizer token = new StringTokenizer(param, "&", true); 
		
		//잘린 갯수
		int len = token.countTokens();
		
		//배열 만들기
		String[] arr =  new String[len];
		
		/*
		int k = 0;
		while (token.hasMoreElements()) {
			
			//Object o = token.nextElement();
			//arr[i++] = (String)o;
			arr[k++] = token.nextToken();
		}
		
		// 출력
		System.out.println(Arrays.toString(arr));
		*/
		
		System.out.println("============================================================");
		// 배열 안의 결과를 다시 길이가 2인 배열로 만드세요. 구분 문자는 = 를 기준으로 자르세요.
		String[][] arr2 = new String[len][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = token.nextToken();
			StringTokenizer token2 = new StringTokenizer(arr[i],"=");
			int len2 = token2.countTokens();
			String[] temp = new String[len2];
			for (int j = 0; j < len2; j++) {
				temp[j] = token2.nextToken();
			}
			arr2[i] = temp;
		}
		
		for (String[] s : arr2) {
			System.out.println(Arrays.toString(s));
		}
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}
}
