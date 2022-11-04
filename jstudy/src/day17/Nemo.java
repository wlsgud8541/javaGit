package day17;

public class Nemo extends Figure{
	private int width, height;
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

	@Override
	public void setArea() {
		this.area = width * height;
	}

	@Override
	public void toPrint() {
		System.out.printf("\n[■]\t가  로 : %2d\n\t세  로 : %2d\n\t넓  이 : %5.2f\n\n",width,height,area);
		System.out.println("-------------------------");
	}

}
