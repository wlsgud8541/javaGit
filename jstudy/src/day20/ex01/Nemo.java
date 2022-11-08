package day20.ex01;

public class Nemo implements Figure{
	public int width, height;
	public double area;
	
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

	public void setArea(double area) {
		this.area = area;
	}

	public void setArea() {
		this.area = width * height;
	}

	@Override
	public double getArea() {
		return area;
	}

	@Override
	public void figurePrint() {
		System.out.printf("[■] 가  로 : %2d | 세로 : %5d | 넓이 : %.2f\n",width,height,area);
	}
}
