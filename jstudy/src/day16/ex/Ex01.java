package day16.ex;

public class Ex01{
/*
 * "여기는 도형 클래스" 를 출력하는 기능을 가진 Dohyung 클래스를 제작하고
 * Dohyung 클래스를 상속 받아서 Semo, Nemo, Dongle 클래스를 제작하고
 * 0 ~ 2 랜덤하게 숫자를 5개를 발생시켜서
 * 	0 - Dongle
 * 	1 - Semo
 * 	2 - Nemo
 * 의 인스턴스를 배열의 각방에 채워 넣어서 
 * 내용을 출력해주는 프로그램을 작성
 * */
	public Ex01() {
		int arrLength = (int)(Math.random()*10+1); 

		Dohyung[] dhArr = new Dohyung[arrLength];
		ExSort sort =  new ExSort();
		
		for (int i = 0; i < dhArr.length; i++) {
			int num = (int)(Math.random()*3);
			int rad = (int)(Math.random()*16+5);
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
		
			switch (num) {
			case 0:	
				//dhArr[i] = new Dongle();
				dhArr[i] = new Dongle(rad);
				break;
		
			case 1:
				//dhArr[i] = new Semo();
				dhArr[i] = new Semo(width,height);
				break;
			
			case 2:
				//dhArr[i] = new Nemo();
				dhArr[i] = new Nemo(width,height);
				break;				
			}
		}
		
		dhArr =	sort.arrSort(dhArr);
		
		for (Dohyung d : dhArr) {
			d.toPrint();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
