package day17;

public class Dongle extends Figure{
	private int rad;
	private double area, arround;
	
	public Dongle() {}

	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
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

	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("\n[●]\t반지름 : %2d\n\t원둘레 : %5.2f\n\t원넓이 : %5.2f\n\n",rad, arround, area);
		System.out.println("-------------------------");
	}
	
}
