package day15;

public class Point {
	int x, y;

	public Point() {
	}
	
	public Point(int ... num) {
		this.x = num[0];
		this.y = num[1];
		
		toPrint();
	}
	
	public void toPrint() {
		System.out.printf("x값 : %d | y값 : %d\n",x,y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
