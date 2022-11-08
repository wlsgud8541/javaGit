package day20.ex02;

public class Semo implements Figure{

	private int width, height;
	private double area;
	
	public Semo() {}

	public Semo(int width, int height) {
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
		this.area = width * height * 0.5;
	}

	@Override
	public double getArea() {
		return area;
	}

	@Override
	public void figurePrint() {
		System.out.printf("[▲] 밑  변 : %2d | 높이 : %5d | 넓이 : %.2f\n",width,height,area);
	}

	@Override
	public int compareTo(Object o) {
		int result = 0;
		
		Figure f = (Figure)o;
		
		result = getArea() == f.getArea() ? 0 : (getArea() < f.getArea() ? 1 : -1);
		return result;
	}
}
