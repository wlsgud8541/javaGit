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
public class Ex00_01 {

	public Ex00_01() {
		ArrayList names = new ArrayList();
		ArrayList ids = new ArrayList();
		ArrayList mails = new ArrayList();
		
		names.add("제니");
		names.add("리사");
		names.add("로제");
		names.add("지수");
	
		System.out.print(" | ");
		for (int i = 0; i < names.size(); i++) {
			String name = (String)names.get(i);
			System.out.print(name+ " | ");
		}
		
		System.out.println();
		
		ids.add("jennie");
		ids.add("lisa");
		ids.add("rose");
		ids.add("jisoo");
		
		System.out.print(" | ");
		for (int i = 0; i < ids.size(); i++) {
			String id = (String)ids.get(i);
			System.out.print(ids.get(i)+ " | ");
		}

		System.out.println();
		
		for (int i = 0; i < ids.size(); i++) {
			String mail = (String)ids.get(i) + "@gethrd.com";
			mails.add(mail);
		}
		
		System.out.print(" | ");
		for (int i = 0; i < mails.size(); i++) {
			String mail = (String)mails.get(i);
			System.out.print(mails.get(i)+ " | ");
		}
		
		// 모든 멤버 기억할 ArrayList
		ArrayList blackPink = new ArrayList();
		// 임시 ArrayList
		ArrayList tmp = new ArrayList();
		tmp.add(names);
		tmp.add(ids);
		tmp.add(mails);
		
		for (int i = 0; i < 4; i++) {
			ArrayList l = new ArrayList();
			l.add(names.get(i));
			l.add(ids.get(i));
			l.add(mails.get(i));
			blackPink.add(l);
		}

		System.out.println();
		System.out.println("=============================================");
		System.out.println();
		
		System.out.println("-------------------------------------");
		for (Object o : blackPink) {
			System.out.print("| ");
			ArrayList l = (ArrayList) o;
			for (Object obj : l) {
				String s = (String) obj;
				System.out.print(s + " | ");
			}
			System.out.println();
			System.out.println("-------------------------------------");
		}
		
		System.out.println();
		System.out.println("---------------------VO TEST---------------------");
		
		ArrayList jennie = (ArrayList)blackPink.get(0);
		ArrayList lisa = (ArrayList)blackPink.get(1);
		ArrayList lose = (ArrayList)blackPink.get(2);
		ArrayList jisoo = (ArrayList)blackPink.get(3);
		
		/*
		for (int i = 0; i < blackPink.size(); i++) {
			ArrayList tmp2 = (ArrayList)blackPink.get(0);
			for (int j = 0; j < tmp2.size(); j++) {
				tmp2.set(0, "데이터 변경 테스트");
			}
		}
		*/
		
		ArrayList blackPink02 = new ArrayList(); //VO가 채워질 ArrayList
		for (int i = 0; i < blackPink.size(); i++) {
			//데이터 꺼내기
			String name = (String)((ArrayList)blackPink.get(i)).get(0); // 이름
			String id = (String)((ArrayList)blackPink.get(i)).get(1); // 아이디
			String mail = (String)((ArrayList)blackPink.get(i)).get(2); // 메일
			
			//VO에 데이터 채우기
			BlackPink00_01 vo = new BlackPink00_01();
			vo.setName(name);
			vo.setId(id);
			vo.setMail(mail);

			//채워진 VO를 ArrayList에 채우기
			blackPink02.add(vo);
		}
		
		for (int i = 0; i < blackPink02.size(); i++) {
			Object o = blackPink02.get(i);
			BlackPink00_01 vo = (BlackPink00_01)o;
			
			String name = vo.getName();
			String id = vo.getId();
			String mail = vo.getMail();
			
			System.out.printf("%-6s - %-8s - %-20s\n",name,id,mail);
		}
	}
	
	public static void main(String[] args) {
		new Ex00_01();
	}
}
