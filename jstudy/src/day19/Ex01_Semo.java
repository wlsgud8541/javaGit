package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex01_Semo {
/*
 * 삼각형 한 개의 정보를 기억할 Nemo 클래스를 만들고
 * 랜덤하게 가로와 세로를 입력해서 10개의 삼각형을
 * ArrayList에 기억하고
 * 1. 가로길이 오름차순 정렬
 * 2. 면적 내림 차순 정렬
 * 해서 출력하세요.
 * 
 * */
	public Ex01_Semo() {
		ArrayList list = new ArrayList();
		Semo semo; 
		
		//데이터 채우기
		for (int i = 0; i < 10; i++) {
			int num1 = (int)(Math.random()*16+5);
			int num2 = (int)(Math.random()*16+5);
			semo = new Semo(num1, num2);
			
			list.add(semo);
		}
		
		//정렬
		System.out.println("######## 밑변 기준 오름차순 정렬 ########");
		Collections.sort(list, new SemoWidthSort());
		for (Object o : list) {
			int width = ((Semo) o).getWidth();
			int height = ((Semo) o).getHeight();
			double area = ((Semo) o).getArea();
			
			System.out.printf("width : %3d | height : %3d | area : %.2f\n",width,height,area);
		}

		System.out.println();
		System.out.println("######## 넓이 기준 내림차순 정렬 ########");
		Collections.sort(list, new SemoAreaSort());
		
		for (Object o : list) {
			int width = ((Semo) o).getWidth();
			int height = ((Semo) o).getHeight();
			double area = ((Semo) o).getArea();
			
			System.out.printf("width : %3d | height : %3d | area : %.2f\n",width,height,area);
		}
	}
	
	public static void main(String[] args) {
		new Ex01_Semo();
	}
}

class SemoWidthSort implements Comparator{
	int result = 0;
	@Override
	public int compare(Object o1, Object o2) {
		result = ((Semo)o1).getWidth() - ((Semo)o2).getWidth(); 
		
		return result;
	}
}

class SemoAreaSort implements Comparator{
	double temp = 0;
	int result = 0;
	@Override
	public int compare(Object o1, Object o2) {
		temp = ((Semo)o1).getArea() - ((Semo)o2).getArea();
		result = temp < 0 ? 1 : -1 ;
		
		return result;
	}
}
