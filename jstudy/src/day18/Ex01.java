package day18;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex01 {
	/*
	 * param을 분리해서 
	 * ArrayList에 담아서 출력하세요
	 * ArrayList에 ArrayList가 들어 있는 형태
	 * 
	 * */
	public Ex01() {
		//StringBuffer 객체 만들기
		StringBuffer buff = new StringBuffer("neme=");
		
		//데이터 덧붙이기
		buff.append("jennie");
		buff.append("&id=jennie");
		buff.append("&pw=12345");
		buff.append("&mail=jennie@githrd.com");
		
		String param = buff.toString();
		
		ArrayList list = new ArrayList();
		StringTokenizer token1 = new StringTokenizer(param, "&");
		
		while(token1.hasMoreElements()) {
			ArrayList tempList = new ArrayList();
			String tmpStr = token1.nextToken();
			StringTokenizer token2 = new StringTokenizer(tmpStr, "=");
			while (token2.hasMoreElements()) {
				tempList.add(token2.nextToken());
			}
			list.add(tempList);
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
