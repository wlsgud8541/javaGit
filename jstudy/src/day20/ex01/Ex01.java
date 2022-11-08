package day20.ex01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Ex01 {
/*
 * Figure 인터페이스를 만들고 그것을 구현하는 클래스
 * 	Semo, Nemo, Dongle
 * 클래스를 만드세요. 
 *
 * 단, Comparable 인터페이스를 구현하지 않는 클래스로 제작
 * 
 * 0 ~ 2 사이의 숫자를 랜덤하게 발생시켜서
 * 		0 - Dongle
 * 		1 - Semo
 * 		2 - Nemo
 *를 채워넣을 TreeSet 을 만들어서 채우고
 *
 * 면적기준으로 내림차순 정렬해서 출력
 *
 * 1. Comparator 로 해결하는 방법
 * 2. Comparalbe 로 해결하는 방법
 * 
 * */
	TreeSet set;
	
	public Ex01() {
		System.out.println("패키지 01");
		setFigure();
		setPrint();
	}
	
	public void setFigure(){
		set = new TreeSet(new Comparator() {

			int result = 0;
			@Override
			public int compare(Object o1, Object o2) {
				Figure figure1 = (Figure)o1;
				Figure figure2 = (Figure)o2;
				
				int result = figure1.getArea() == figure2.getArea() ? 0 : (figure1.getArea() < figure2.getArea() ? 1 : -1); 
				
				return result;
			}
		});
		
		while (set.size() < 10) {
			int temp = (int)(Math.random()*3);
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
