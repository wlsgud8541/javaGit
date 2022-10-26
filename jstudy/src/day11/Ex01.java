package day11;
import day10.*;

public class Ex01 {
/*
 *	도형 10개를 기억할 배열을 만들고 
 *  랜덤하게 숫자를 0 ~ 2 사이로 발생시켜서
 *  0 이면 원으로
 *  1 이면 삼각형으로
 *  2 이면 사각형으로
 *  배열에 모두 채워주고 내용을 출력해주는 프로그램을 작성하세요. 
 * */	
	
	public Ex01() {
		int num = (int)(Math.random()*3);
		Figure[] resultFi = null;
		
		switch (num) {
		case 0:
			Figure won = new Won();
			resultFi =reFigure(won);
			break;
		case 1:
			Figure semo = new Semo();
			resultFi =reFigure(semo);
			break;
		case 2:
			Figure nemo = new Nemo();
			resultFi = reFigure(nemo);
			break;
		}
		
		for (Figure f : resultFi) {
			f.toPrint();
		}
	}

	//배열 저장 함수
	Figure[] reFigure(Figure moyang) {
		Figure[] figure = new Figure[10];
		for (int i = 0; i < figure.length; i++) {
			int num1 = (int)(Math.random()*16+5); //반지름,가로
			int num2 = (int)(Math.random()*16+5); //세로
			
			if (moyang instanceof Won) {
				moyang = new Won();
				((Won)moyang).radius = num1;
				((Won)moyang).setRound();
				((Won)moyang).setArea();
				figure[i] = moyang;
				
			}else if(moyang instanceof Semo) {
				moyang = new Semo();
				((Semo)moyang).width = num1;
				((Semo)moyang).height = num2;
				((Semo)moyang).setAria();
				figure[i] = moyang;
				
			}else if(moyang instanceof Nemo) {
				moyang = new Nemo();
				((Nemo)moyang).width = num1;
				((Nemo)moyang).height = num2;
				((Nemo)moyang).setArea();
				figure[i] = moyang;
			}
		}
		
		sotrFigure(figure);
		return figure;
	}
	
	// 정렬 함수
	void sotrFigure(Figure[] f) {
		double num1 = 0;
		double num2 = 0;
		for (int i = 0; i < f.length-1; i++) {
			if (f[i] instanceof Won) {
				num1 = ((Won)f[i]).area; 
			}else if (f[i] instanceof Semo) {
				num1 = ((Semo)f[i]).area;
			}else if (f[i] instanceof Nemo) {
				num1 = ((Nemo)f[i]).area;
			}
			for (int j = i+1; j < f.length; j++) {
				if (f[j] instanceof Won) {
					num2 = ((Won)f[j]).area; 
				}else if (f[j] instanceof Semo) {
					num2 = ((Semo)f[j]).area;
				}else if (f[j] instanceof Nemo) {
					num2 = ((Nemo)f[j]).area;
				}
				if (num1 > num2) {
					Figure tempFi = f[i];
					f[i] = f[j];
					f[j] = tempFi;
					num1 = num2;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
	}
}
