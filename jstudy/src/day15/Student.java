package day15;

public class Student {
	private String name;
	private int java;
	private int db;
	private int web;
	private int totalScore;
	private double avgScore;
	private int rank;
	
	public Student() {
	}

	public Student(String name, int java, int db, int web) {
		this.name = name;
		this.java = java;
		this.db = db;
		this.web = web;
		this.rank = 1;
		setTotalScore();
		setAvgScore();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int wdb) {
		this.web = wdb;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore() {
		this.totalScore = java+db+web;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}

	public void setAvgScore() {
		this.avgScore = totalScore / (double)3;
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void setRank(Student stu) {
		if (totalScore < stu.getTotalScore()) {
			rank +=1;
		}
	}
}
