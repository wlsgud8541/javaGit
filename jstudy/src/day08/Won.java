package day08;

public class Won {
	public int radius; //반지름
	public double round; //둘레
	public double area; //넓이
	
	//둘레 함수
	public void setRound() {
		this.round = 2 * 3.14 * this.radius;
		//System.out.println(round);
	}
	
	//면적 함수
	public void setArea() {
		area = radius * radius * 3.14;
		//System.out.println(area);
	}
	
}
