package day19;

public class Won {
	private int rad;
	private double arround, area;

	public Won() {}

	public Won(int rad) {
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
