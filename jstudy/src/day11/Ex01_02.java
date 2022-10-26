package day11;
import day10.*;

public class Ex01_02 {
/*
 *	도형 10개를 기억할 배열을 만들고 
 *  랜덤하게 숫자를 0 ~ 2 사이로 발생시켜서
 *  0 이면 원으로
 *  1 이면 삼각형으로
 *  2 이면 사각형으로
 *  배열에 모두 채워주고 내용을 출력해주는 프로그램을 작성하세요. 
 * */	
	
	public Ex01_02() {
		int num = (int)(Math.random()*3);
		Figure[] figure = new Figure[10];
		/*Won won = null; 
		Semo semo = null;
		Nemo nemo = null;*/
		
		
		//도형 채우기
		switch (num) {
			case 0:
				for (int i = 0; i < figure.length; i++) {
					figure[i] = new Won();
				}
				break;
				
			case 1:
				for (int i = 0; i < figure.length; i++) {
					figure[i] = new Semo();
				}
				break;
				
			case 2:
				for (int i = 0; i < figure.length; i++) {
					figure[i] = new Nemo();
				}
				break;
		}
		
		//각 도형 사이즈 작업
		for (int i = 0; i < figure.length; i++) {
			Figure f = figure[i];
			int no1 = (int)(Math.random()*16+5); //반지름,가로
			int no2 = (int)(Math.random()*16+5); //세로
			
			switch (num) {
				case 0:
					Won w = (Won) f;
					w.radius = no1; //반지름
					w.setRound(); //둘레
					w.setArea(); //면적
					break;
					
				case 1:
					Semo s = (Semo) f;
					s.width = no1; //밑변
					s.height = no2; //높이
					s.setAria();	//면적
					break;
					
				case 2:
					Nemo n = (Nemo) f;
					n.width = no1;	//가로
					n.height = no2; //세로
					n.setArea(); //면적
					break;
			}
		}
		
		
		//정렬
		double num1 = 0;
		double num2 = 0;
		for (int i = 0; i < figure.length-1; i++) {
			if (figure[i] instanceof Won) {
				num1 = ((Won)figure[i]).area; 
			}else if (figure[i] instanceof Semo) {
				num1 = ((Semo)figure[i]).area;
			}else if (figure[i] instanceof Nemo) {
				num1 = ((Nemo)figure[i]).area;
			}
			
			for (int j = i+1; j < figure.length; j++) {
				if (figure[j] instanceof Won) {
					num2 = ((Won)figure[j]).area; 
				}else if (figure[j] instanceof Semo) {
					num2 = ((Semo)figure[j]).area;
				}else if (figure[j] instanceof Nemo) {
					num2 = ((Nemo)figure[j]).area;
				}
				
				if (num1 > num2) {
					Figure tempFi = figure[i];
					figure[i] = figure[j];
					figure[j] = tempFi;
					num1 = num2;
				}
			}
		}
		
		for (Figure f : figure) {
			f.toPrint();
		}
		
	}
	
	
	public static void main(String[] args) {
		Ex01_02 ex01_02 = new Ex01_02();
	}
}
