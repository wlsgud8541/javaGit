package day11;
import day10.*;

public class Ex01_01 {
/*
 *	도형 10개를 기억할 배열을 만들고 
 *  랜덤하게 숫자를 0 ~ 2 사이로 발생시켜서
 *  0 이면 원으로
 *  1 이면 삼각형으로
 *  2 이면 사각형으로
 *  배열에 모두 채워주고 내용을 출력해주는 프로그램을 작성하세요. 
 * */	
	
	public Ex01_01() {
		int num = (int)(Math.random()*3);
		Figure[] figure = new Figure[10];
		Won won = null; 
		Semo semo = null;
		Nemo nemo = null;
		
		for (int i = 0; i < figure.length; i++) {
			int num1 = (int)(Math.random()*16+5); //반지름,가로
			int num2 = (int)(Math.random()*16+5); //세로
			
			switch (num) {
			case 0:
				won = new Won();
				won.radius = num1;
				won.setRound();
				won.setArea();
				figure[i] = won;
				break;
				
			case 1:
				semo = new Semo();
				semo.width = num1;
				semo.height = num2;
				semo.setAria();
				figure[i] = semo;
				break;
				
			case 2:
				nemo = new Nemo();
				nemo.width = num1;
				nemo.height = num2;
				nemo.setArea();
				figure[i] = nemo;
				break;
			}
		}
		
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
		Ex01_01 ex01_01 = new Ex01_01();
	}
}
