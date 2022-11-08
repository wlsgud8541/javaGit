package day20;

import java.util.*;

public class Test02 {
/*
 * Semo 객체 5개를 만들어서
 * TreeSet에서 관리
 * 
 * */
	String[] name = {"가학생","나학생","다학생","라학생","마학생","바학생","사학생","아학생","자학생","차학생"};
	TreeSet set;

	public Test02() {
		//addMember();
		//setLotto();
		//addSemo();
		addSamgak();
	}
	
	// 멤버로 채우기
	public void addMember() {
		set = new TreeSet();
		
		for (int i = 0; i < name.length; i++) {
			set.add(name[i]);
		}
		
		ArrayList<String> list = new ArrayList<String>(set);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void setLotto() {
		set = new TreeSet();
		
		int cnt = 1;
		while (set.size() < 6) {
			System.out.print(cnt++ + " | ");
			set.add((int)(Math.random()*45)+1);
		}
		
		System.out.println();
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	// 세모 클래스 채우기
	public void addSemo() {
		set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Semo s1 = (Semo)o1;
				Semo s2 = (Semo)o2;
				
				// 면적 기준 내림차순 정렬
				int result = s1.getArea() == s2.getArea() ? 0 : (s1.getArea() < s2.getArea() ? 1 : -1);
				
				return result;
			}
		});
		
		Semo s1 = new Semo((int)(Math.random()*16+5), (int)(Math.random()*16+5));
		Semo s2 = new Semo((int)(Math.random()*16+5), (int)(Math.random()*16+5));
		Semo s3 = new Semo((int)(Math.random()*16+5), (int)(Math.random()*16+5));
		Semo s4 = new Semo((int)(Math.random()*16+5), (int)(Math.random()*16+5));
		Semo s5 = new Semo((int)(Math.random()*16+5), (int)(Math.random()*16+5));
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		// 출력
		/*
		// 1. Iterator
		Iterator<Semo> itor = set.iterator();
		while (itor.hasNext()) {
			Semo s = itor.next();
			System.out.printf("밑변 : %3d | 높이 : %3d | 면적 : %5.2f\n",s.getWidth(),s.getHeight(),s.getArea());
		}
		*/
		
		// 2. ArrayList
		ArrayList<Semo> list = new ArrayList<Semo>(set);
		for (int i = 0; i < list.size(); i++) {
			Semo s = list.get(i);
			System.out.printf("밑변 : %3d | 높이 : %3d | 면적 : %5.2f\n",s.getWidth(),s.getHeight(),s.getArea());
		}
	}
	
	// 삼각 클래스 5개 추가
	public void addSamgak() {
		set = new TreeSet();
		while(set.size() < 5) {
			set.add(new Samgak((int)(Math.random()*16+5), (int)(Math.random()*16+5)));
		}
		
		// 출력
		ArrayList<Samgak> list = new ArrayList<Samgak>(set);
		
		for (Samgak s : list) {
			System.out.printf("밑변 : %3d | 높이 : %3d | 면적 : %5.2f\n",s.getWidth(),s.getHeight(),s.getArea());
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
