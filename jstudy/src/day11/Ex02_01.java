package day11;

public class Ex02_01 {
	/*
	 * 
	 * Student 클래스를 이용해서 학생들 10명의 점수를 기억할 배열 생성 
	 * 총점 입력
	 * 평균 계산
	 * ------------------------------(1)
	 * 순위 계산
	 * ------------------------------(2)
	 * 정렬(총점기준 내림차순 정렬)
	 * ------------------------------(3)
	 * 
	 * 
	 * 60점 ~ 100점 랜덤
	 * */
	
	String[] names = {"제니", "리사", "로제", "지수", "아이유", "경욱", "태윤", "우영", "경민", "혁주"};
	public Ex02_01() {
		Student[] st = new Student[10];
		for (int i = 0; i < st.length; i++) {
			Student student = new Student();
			student.name = names[i];
			student.kor = (int)(Math.random()*61+40);
			student.eng = (int)(Math.random()*61+40); 
			student.math = (int)(Math.random()*61+40);
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total/3;
			st[i] = student;
		}
		
		//정렬
		for (int i = 0; i < st.length; i++) {
			int tempTotal1 = st[i].total;
			for (int j = i+1; j < st.length; j++) {
				int tempTotal2 = st[j].total;
				if (tempTotal1 < tempTotal2) {
					Student tempSt = st[i];
					st[i] = st[j];
					st[j] = tempSt;
					tempTotal1 = tempTotal2;
				}
			}
			st[i].rank = i+1;
		}
		for (Student s : st) {
			System.out.println("이름 : "+s.name+" / 국어성적 : "+s.kor+" / 영어성적 : "+s.eng+" / 수학성적 : "+s.math+" / 총점 : "+s.total+" / 평균 : "+s.avg+ " / 등수 : "+s.rank+"등");
		}
	}
	
	public static void main(String[] args) {
		Ex02_01 ex02 = new Ex02_01();
	}
}
