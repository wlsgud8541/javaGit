package day20.ex02;

public class Dongle implements Figure{

	private int rad;
	private double arround, area;
	
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

	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}

	public void setArround() {
		this.arround = 2 * rad * Math.PI;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setArea() {
		this.area = rad * rad * Math.PI;
	}

	@Override
	public double getArea() {
		return area;
	}

	@Override
	public void figurePrint() {
		System.out.printf("[●] 반지름 : %2d | 둘레 : %.2f | 넓이 : %.2f\n",rad,arround,area);
	}

	@Override
	public int compareTo(Object o) {
		int result = 0;
		
		Figure f = (Figure)o;
		result = getArea() == f.getArea() ? 0 : (getArea() < f.getArea() ? 1 : -1);
		return result;
	}
}
