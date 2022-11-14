package day24;

public class Nemo {
	private int width,height;
	private double area;
	
	public Nemo() {}

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

	public void setArea(double area) {
		this.area = area;
	}

	public void setArea() {
		this.area = width * height;
	}
	
	@Override
	public boolean equals(Object o) {
		/*
		 * 이 함수는 Object 클래스에서 상속 받음 함수로
		 * 원래 주소를 비교하는 기능이었지만
		 * 여기서는 넓이가 같으면 같은 사각형으로 처리하기로 해보자
		 * */
		Nemo n = ((Nemo)o);
		boolean bool = this.area == n.getArea();
		return bool;
	}
	
	@Override
	public String toString() {
		return "[■] 가로 : " + width + " | 세로 : " + height + " | 면적 : " + area;
	}
	
}