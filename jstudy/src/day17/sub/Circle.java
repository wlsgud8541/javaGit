package day17.sub;

public class Circle implements Figure{
	private int rad;
	private double arround, area;
	
	public Circle() {}

	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf("[●] 반지름 : %2d | 둘  레 : %2.2f  | 면적 %7.2f\n",rad,arround,area);
		System.out.println("-------------------------------------------------");
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}

	public void setArround() {
		this.arround = 2 * rad * Math.PI;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setArea() {
		this.area = rad * rad * Math.PI;
	}

}
