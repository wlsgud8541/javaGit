package day13;

import static java.lang.Math.*;
public class Circle {
	private int rad;
	private double around, area;
	
	public void setRad(int rad) {
		this.rad = rad;
		return;
	}
	
	public int getRad() {
		return rad;
	}

	public void setAround() {
		around = rad * 2 * PI; 
	}
	
	public void setAround(double around) {
		this.around = around;
	}
	
	public double getAround() {
		return around;
	}
	
	public void setArea() {
		area = rad * rad * PI;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
}
