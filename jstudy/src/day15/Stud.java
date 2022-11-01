package day15;

public class Stud {
	String name;
	int ban, no, kor, eng, math, total, rank;
	double avg;
	public Stud() {
	}
	
	public Stud(int ban, int no, String name) {
		this(ban,no,name,0,0,0);
		/*this.ban = ban;
		this.no = no;
		this.name = name;*/
		
		//toPrint();
	}

	public Stud(int ban, int no, String name, int kor, int eng, int math) {
		this.ban = ban;
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.rank = 1;
		setTotal();
		setAvg();
	}

	public Stud(int ban, int no, String name, int ... num) {
		this.rank = 1;
			this.ban = ban;
			this.no = no;
			this.name = name;
			for (int i = 0; i < num.length; i++) {
				this.kor = num[i];
				this.eng = num[i];
				this.math = num[i];
			}
			setTotal();
			setAvg();
	}
	
	
	public void toPrint() {
		System.out.printf("반 : %5d반 | 번호 : %3d번 | 이름 : %3s\n"
						+ "------------------------------------------------"
						+ "\n국어 : %3d점 | 영어 : %3d점 | 수학 : %3d점\n"
						+ "------------------------------------------------"
						+ "\n총점 : %3d점 | 평균 : %3f점 | 석차 : %3d등\n",ban,no,name,kor,eng,math,total,avg,rank);
		System.out.println("================================================");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	
	public void setTotal() {
		this.total = kor+eng+math;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(Stud stu) {
		if (total < stu.getTotal()) {
			this.rank += 1;
		}
	}
	
	public double getAvg() {
		return (avg + 0.05)*10/10.0;
	}
	public void setAvg() {
		this.avg = ((total/3.0) + 0.05)*10/10.0;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
