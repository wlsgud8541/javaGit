package day16.ex;

public class Dongle extends Dohyung{
	private int rad;
	private double arround, area;
	
	public Dongle() {
		/*
		int num1 = (int)(Math.random()*16+5);
		this.rad = num1;
		setArround();
		setArea();
		*/
	}

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
		this.arround = 2 * rad * 3.14;
	}
	@Override
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		this.area = rad * rad * 3.14;
	}

	@Override
	public void toPrint() {
		System.out.printf("[●] 반지름 : %2d | 둘레 : %.2f | 넓이 : %.2f\n",rad,arround,area);
		System.out.println("-----------------------------------------------");
	}
}
