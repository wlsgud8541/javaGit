package day08;

public class Won {
	int radius; //반지름
	double round; //둘레
	double area; //넓이
	
	//둘레 함수
	public void setRound() {
		round = 2 * 3.14 * radius;
		//System.out.println(round);
	}
	
	//면적 함수
	public void setArea() {
		area = radius * radius * 3.14;
		//System.out.println(area);
	}
	
}
