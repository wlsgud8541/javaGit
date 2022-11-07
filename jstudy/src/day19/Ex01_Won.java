package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex01_Won {
/*
 * 삼각형 한 개의 정보를 기억할 Nemo 클래스를 만들고
 * 랜덤하게 가로와 세로를 입력해서 10개의 삼각형을
 * ArrayList에 기억하고
 * 1. 가로길이 오름차순 정렬
 * 2. 면적 내림 차순 정렬
 * 해서 출력하세요.
 * 
 * */
	public Ex01_Won() {
		ArrayList list = new ArrayList();
		Won won; 
		
		//데이터 채우기
		for (int i = 0; i < 10; i++) {
			int num1 = (int)(Math.random()*16+5);
			won = new Won(num1);
			
			list.add(won);
		}
		
		//정렬
		System.out.println("######## 둘레 기준 오름차순 정렬 ########");
		Collections.sort(list, new WonArroundSort());
		for (Object o : list) {
			int rad = ((Won) o).getRad();
			double arround = ((Won) o).getArround();
			double area = ((Won) o).getArea();
			
			System.out.printf("rad : %3d | arround : %.2f | area : %.2f\n",rad,arround,area);
		}

		System.out.println();
		System.out.println("######## 넓이 기준 내림차순 정렬 ########");
		Collections.sort(list, new WonAreaSort());
		
		for (Object o : list) {
			int rad = ((Won) o).getRad();
			double arround = ((Won) o).getArround();
			double area = ((Won) o).getArea();
			
			System.out.printf("rad : %3d | arround : %.2f | area : %.2f\n",rad,arround,area);
		}
	}
	
	public static void main(String[] args) {
		new Ex01_Won();
	}
}

class WonArroundSort implements Comparator{
	double temp = 0;
	int result = 0;
	@Override
	public int compare(Object o1, Object o2) {
		temp = ((Won)o1).getArround() - ((Won)o2).getArround(); 
		result = temp < 0 ? -1 : 1;
		
		return result;
	}
}

class WonAreaSort implements Comparator{
	double temp = 0;
	int result = 0;
	@Override
	public int compare(Object o1, Object o2) {
		temp = ((Won)o1).getArea() - ((Won)o2).getArea();
		result = temp < 0 ? 1 : -1 ;
		
		return result;
	}
}
