package day16.sub;

public class Semo extends Figure{
	private int width, height;
	private double area;
	
	public Semo() {
	}

	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		no = 70;
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

	@Override
	public void toPrint() {
		System.out.printf("밑변이 %3d 이고 높이가 %3d 이고 넓이가 %5.2f 인 삼각형\n",width, height, area);
	}
	
	
}
