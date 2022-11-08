package day20.ex02;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ex01 {

	TreeSet set;
	
	public Ex01() {
		System.out.println("패키지 02");
		setFigure();
		setPrint();
	}
	public void setFigure(){
		set = new TreeSet();
		
		while (set.size() < 10) {
			int temp = (int)(Math.random()*3);
			//int temp = 0;
			int rad = (int)(Math.random()*16+5);
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			switch (temp) {
			case 0:
				Dongle dongle = new Dongle(rad);
				set.add(dongle);
				break;
			case 1:
				Semo semo = new Semo(width, height);
				set.add(semo);
				break;
			case 2:
				Nemo nemo = new Nemo(width, height);
				set.add(nemo);
				break;
			}
		}
	}
	
	public void setPrint() {
		ArrayList<Figure> list = new ArrayList<Figure>(set);
		
		for (Figure f : list) {
			f.figurePrint();
		}
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
	
}
