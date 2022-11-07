package day18;

import java.util.ArrayList;

/* Test03 +추가 문제

1. 멤버 이름들만 기억하는 ArrayList, names 만들고 데이터 추가
2.       id 만 기억하는 ArrayList, ids 만들고 데이터 추가
3.       메일만 기억하는 ArrayList, mails 만들고 데이터 추가.
4. 위 문항에서 완성한 ArrayList에서 데이터를 추출해서 각 멤버별 ArrayList를 완성
5. 위 문항에서 완성한 ArrayList를 기억할 ArrayList, blackPink를 완성
------------------------------------------------------------------------------------
6. 멤버 한명의 데이터를 기억할 VO BlackPink를 말들고
   1번 문항에서 완성한 ArrayList에서 데이터를 추출해서 채워넣어서
   네 명의 데이터를 기억할 ArrayList에 기억시키세요
   
   결과도 출력하세요.
   
*/
public class Ex00 {

	public Ex00() {
		ArrayList names = new ArrayList();
		ArrayList ids = new ArrayList();
		ArrayList mails = new ArrayList();
		
		names.add("제니");
		names.add("리사");
		names.add("로제");
		names.add("지수");

		ids.add("jennie");
		ids.add("lisa");
		ids.add("rose");
		ids.add("jisoo");
		
		mails.add("jennie@naver.com");
		mails.add("lisa@naver.com");
		mails.add("rose@naver.com");
		mails.add("jisoo@naver.com");
		
		
		
		ArrayList jennie = new ArrayList();
		ArrayList lisa = new ArrayList();
		ArrayList rose = new ArrayList();
		ArrayList jisoo = new ArrayList();
		
		jennie.add(names.get(0));
		jennie.add(ids.get(0));
		jennie.add(mails.get(0));
		
		for (int i = 0; i < jennie.size(); i++) {
			System.out.print(jennie.get(i) + ", ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		lisa.add(names.get(1));
		lisa.add(ids.get(1));
		lisa.add(mails.get(1));
		
		for (int i = 0; i < lisa.size(); i++) {
			System.out.print(lisa.get(i) + ", ");
		}
		System.out.println();
		System.out.println("=====================================");

		rose.add(names.get(2));
		rose.add(ids.get(2));
		rose.add(mails.get(2));
		
		for (int i = 0; i < rose.size(); i++) {
			System.out.print(rose.get(i) + ", ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		jisoo.add(names.get(3));
		jisoo.add(ids.get(3));
		jisoo.add(mails.get(3));
		
		for (int i = 0; i < jisoo.size(); i++) {
			System.out.print(jisoo.get(i) + ", ");
		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
		
		
		ArrayList blackPink = new ArrayList();
		blackPink.add(jennie);
		blackPink.add(lisa);
		blackPink.add(rose);
		blackPink.add(jisoo);
		
		for (int i = 0; i < blackPink.size(); i++) {
			System.out.println(blackPink.get(i));
			System.out.println("=====================================");
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < blackPink.size(); i++) {
			ArrayList temp = (ArrayList)blackPink.get(i);
			for (int j = 0; j < temp.size(); j++) {
				System.out.println(temp.get(j));
			}
			System.out.println("=====================================");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("==================VO=================");
		
		ArrayList blackPink2 = new ArrayList();
		
		for (int i = 0; i < names.size(); i++) {
			BlackPink bp = new BlackPink();
			bp.setId((String)ids.get(i));
			bp.setName((String)names.get(i));
			bp.setMail((String)mails.get(i));
			bp.setMember();
			
			blackPink2.add(bp.getMember());
		}
		
		for (int i = 0; i < blackPink2.size(); i++) {
			ArrayList temp = (ArrayList)blackPink2.get(i);
			for (int j = 0; j < temp.size(); j++) {
				System.out.println(temp.get(j));
			}
			System.out.println("=====================================");
		}
	
	}
	
	public static void main(String[] args) {
		new Ex00();
	}
}
