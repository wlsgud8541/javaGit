package day17;

public class Semo extends Figure{
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void setArea() {
		this.area = width * height * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf("\n[▲]\t밑  변 : %2d\n\t높  이 : %2d\n\t넓  이 : %5.2f\n\n",width,height,area);
		System.out.println("-------------------------");
	}


}
