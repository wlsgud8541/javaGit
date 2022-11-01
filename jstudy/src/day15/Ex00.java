package day15;

public class Ex00 {
	/*
	 * - 학생의 이름,java, db, web, 총점, 평균 점수, 순위를 기억할 Student 클래스를 제작
	 * - 이 클래스가 객체가 될 때 필요한 데이터를 입력 받아서 객체가 될 수 있도록 하기. 단, 변수는 은닉화
	 * 
	 * 1. 다섯명의 학생의 점수를 기억할 배열을 만들고 학생을 입력
	 * 
	 * 2. 1번문항의 학생들의 순위를 계산해서 셋팅
	 * 
	 * 3. 총점 기준 내림차순 정렬
	 * 
	 * extra] 랜덤하개 3~7명의 학생을 기억할 배열을 만들고 학생의 정보를 입력해서 위 문항의 1~3내용으로 해결
	 * 
	 * */
	public Ex00() {
		Student[] stu = new Student[5];
		String[] name = {"가 학생","나 학생","다 학생","라 학생","마 학생"};
		/*
		for (int i = 0; i < stu.length; i++) {
			int java = (int)(Math.random()*41+60);
			int db = (int)(Math.random()*41+60);
			int web = (int)(Math.random()*41+60);
			
			Student s = new Student(name[i], java, db, web);
			stu[i] = s;
		}
		*/

		//데이터 넣기
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student(name[i], (int)(Math.random()*41+60), (int)(Math.random()*41+60), (int)(Math.random()*41+60));
		}

		//정렬
		for (int i = 0; i < stu.length-1; i++) {
			for (int j = i+1; j < stu.length; j++) {
				if (stu[i].getTotalScore() < stu[j].getTotalScore()) {
					Student tmp = stu[i];
					stu[i] = stu[j];
					stu[j] = tmp;
				}
			}
		}
		
		//석차
		/*
		for (int i = 0; i < stu.length; i++) {
			Student s = stu[i];
			s.setRank(i+1);
		}
		*/
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length; j++) {
				stu[i].setRank(stu[j]);
			}
		}

		//출력
		for (int i = 0; i < stu.length; i++) {
			System.out.printf("이름 : %3s\n자바 : %2d\n디비 : %2d\n  웹 : %2d\n총점 : %3d\n평균 : %5.2f\n석차 : %d\n",
					stu[i].getName(),stu[i].getJava(),stu[i].getDb(),stu[i].getWeb(),stu[i].getTotalScore(),stu[i].getAvgScore(),stu[i].getRank());
			System.out.println("=============================");
		}
	}
	
	public static void main(String[] args) {
		new Ex00();
	}

}
