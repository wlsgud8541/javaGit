package day17.sub;

public class Samgak implements Figure{
	private int width, height;
	private double area;
	
	public Samgak() {}

	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf("[▲] 밑  변 : %2d | 높  이 : %2d     | 면적 %7.2f\n",width,height,area);
		System.out.println("-------------------------------------------------");
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
		this.area = width * height * 0.5;
	}
	
}
