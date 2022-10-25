package day10;

public class Won extends Figure{
	public int radius; //반지름
	public double round; //둘레
	
	//둘레 함수
	public void setRound() {
		this.round = 2 * 3.14 * this.radius;
	}
	
	//면적 함수
	public void setArea() {
		area = radius * radius * 3.14;
	}
	
	//toPrint 함수를 고쳐서 정의해보자
	public void toPrint() {
		System.out.println("[ ● ] 반지름 : " + radius + " / 둘레 : " + round + " / 넓이 : " + area);
	}
	
}
