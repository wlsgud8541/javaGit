package day14;

public class Nemo {
	private int width, height;
	private double area;
	
	public Nemo() {
		// 데이터가 아무것도 준비되어있지 않은 경우에는
		// 가로 세로 모두 1로 네모를 만들 예정
		/*
		this.width = 1;
		this.height = 1;
		setArea();
		*/
		//this(0 함수는 생성자의 첫줄 첫문장이어야 한다.
		this(1, 1); //아래에서 정의한 public Nemo(int width, int height){} 함수를 호출한다는 의미
	}

	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		area = width * height;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void test01() {
		new Nemo(); // 가로 세로 1로 셋팅되는 네모가 만들어진다.
	}

}
