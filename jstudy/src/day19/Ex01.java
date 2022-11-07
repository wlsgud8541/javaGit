package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex01 {
/*
 * 사각형 한 개의 정보를 기억할 Nemo 클래스를 만들고
 * 랜덤하게 가로와 세로를 입력해서 10개의 사각형을
 * ArrayList에 기억하고
 * 1. 가로길이 오름차순 정렬
 * 2. 면적 내림 차순 정렬
 * 해서 출력하세요.
 * 
 * */
	public Ex01() {
		ArrayList list = new ArrayList();
		Nemo nemo; 
		
		//데이터 채우기
		for (int i = 0; i < 10; i++) {
			int num1 = (int)(Math.random()*16+5);
			int num2 = (int)(Math.random()*16+5);
			nemo = new Nemo(num1, num2);
			
			list.add(nemo);
		}
		
		//정렬
		System.out.println("######## 가로 기준 오름차순 정렬 ########");
		Collections.sort(list, new WidthSort());
		for (Object o : list) {
			int width = ((Nemo) o).getWidth();
			int height = ((Nemo) o).getHeight();
			int area = ((Nemo) o).getArea();
			
			System.out.printf("width : %3d | height : %3d | area : %3d\n",width,height,area);
		}

		System.out.println();
		System.out.println("######## 넓이 기준 내림차순 정렬 ########");
		Collections.sort(list, new AreaSort());
		
		for (Object o : list) {
			int width = ((Nemo) o).getWidth();
			int height = ((Nemo) o).getHeight();
			int area = ((Nemo) o).getArea();
			
			System.out.printf("width : %3d | height : %3d | area : %3d\n",width,height,area);
		}
	}

	
	
	public static void main(String[] args) {
		new Ex01();
	}
}

class WidthSort implements Comparator{
	int result = 0;
	@Override
	public int compare(Object o1, Object o2) {
		result = ((Nemo)o1).getWidth() - ((Nemo)o2).getWidth(); 
		
		return result;
	}
}

class AreaSort implements Comparator{
	int result = 0;
	@Override
	public int compare(Object o1, Object o2) {
		result = ((Nemo)o1).getArea() - ((Nemo)o2).getArea();
		
		return -result;
	}
}
