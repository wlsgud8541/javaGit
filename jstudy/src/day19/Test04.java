package day19;

import java.util.*;

public class Test04 {
	private ArrayList<String> names;
	private ArrayList<PinkScore> blackPink;
	public Test04() {
		blackPink = new ArrayList<PinkScore>();
		names = new ArrayList<String>();
		names.add("jennie");
		names.add("lisa");
		names.add("rose");
		names.add("jisoo");

		for (int i = 0; i < names.size(); i++) {
			int kor = (int)(Math.random()*41+60);
			int eng = (int)(Math.random()*41+60);
			int math = (int)(Math.random()*41+60);
			String name = names.get(i);
			PinkScore score = new PinkScore(name, kor, eng, math);
			
			blackPink.add(score);
		}
		
		String str = "정렬전";
		printBlackPink(str);
		
		//총점 기준 정렬후(내림차순)
		Collections.sort(blackPink, new TotalDesc());
		str = "총점 기준 정렬후(내림차순)";
		printBlackPink(str);
		
		// 국어점수 기준 내림차순 정렬
		Collections.sort(blackPink, new KorDesc());
		str = "국어 기준 정렬후(내림차순)";
		printBlackPink(str);
		
		// 이름순 오름차순 정렬
		Collections.sort(blackPink, new NameAsc());
		str = "이름 기준 정렬후(오름차순)";
		printBlackPink(str);

		// 평균기준 내림차순 정렬
		Collections.sort(blackPink, new AvgDesc());
		str = "평균 기준 정렬후(내림차순)";
		printBlackPink(str);
	}
	
	
	public void printBlackPink(String str) {
		System.out.println("########################## " + str + " ##########################");
		for (PinkScore p : blackPink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t - %4d, avg - %5.2f\n",name, kor, eng, math, total, avg);
		}
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Test04();
	}
}


// 내림차순 정렬해주는 클래스
class TotalDesc implements Comparator{
	// 반환값 변수
	@Override
	public int compare(Object o1, Object o2) {
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		
		int result = 0;
		int no1 = p1.getTotal();
		int no2 = p2.getTotal();
		
		result = no1 - no2;
		
		return -result;
	}
}

// 국어점수 기준 내림차순 정렬해주는 클래스
class KorDesc implements Comparator{
	// 반환값 변수
	@Override
	public int compare(Object o1, Object o2) {
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		
		int result = 0;
		int no1 = p1.getTotal();
		int no2 = p2.getTotal();
		
		result = no1 - no2;
		
		return -result;
	}
}

//이름순 오름차순 정렬해주는 클래스
class NameAsc implements Comparator{
	// 반환값 변수
	@Override
	public int compare(Object o1, Object o2) {
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		
		int result = 0;
		result = p1.getName().compareTo(p2.getName());
		
		return result;
	}
}

//평균기준 내림차순 정렬해주는 클래스
class AvgDesc implements Comparator{
	// 반환값 변수
	@Override
	public int compare(Object o1, Object o2) {
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		
		double temp = p1.getAvg() - p2.getAvg();
		int result = temp < 0 ? +1 : -1;
		
		return result;
	}
}