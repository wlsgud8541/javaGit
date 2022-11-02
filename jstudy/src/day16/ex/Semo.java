package day16.ex;

public class Semo extends Dohyung{
	private int width, height;
	private double area;
	
	public Semo() {
		/*
		int num1 = (int)(Math.random()*16+5);
		int num2 = (int)(Math.random()*16+5);
		this.width = num1;
		this.height = num2;
		setArea();
		*/
	}
	
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
	@Override
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
	public void toPrint() {
		System.out.printf("[▲]   밑변 : %2d | 높이 : %2d    | 넓이 : %.2f\n",width,height,area);
		System.out.println("-----------------------------------------------");
	}
}
