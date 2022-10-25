package day10;

public class Ex01 {
	// 랜덤하게 도형을 만들어서 Figure배열에 10개를 채워 넣고 면적을 출력하세요.
	public Ex01() {

		//각 타입의 객체 생성
		Figure fig1 = new Won();
		Figure fig2 = new Semo();
		Figure fig3 = new Nemo();
		
		//Figure 타입의 배열 객체 생성
		Figure[] figure = new Figure[10];
		
		// 각 도형들을 배열에 넣기 위한 for문
		for (int i = 0; i < figure.length; i++) {
			int rNum = (int)(Math.random()*3); // 도형을의 케이스를 뽑아내기 위한 변수
			
			// *주의* 
			//for문을 실행할 때 객체를 새로 생성해 주지 않으면 
			//기존 객체를 저장하고 있는 변수가 
			//기존 객체의 주소값을 가지고 있기 때문에 모든 값이 동일하게 변경된다.
			//그러므로 for문 실행 시 새로운 주소를 할당 받기 위해 새로운 객체를 만들어줘야한다.
			switch(rNum) {
			case 0 : 
				fig1 = new Won(); //원 객체 생성
				((Won)fig1).radius = (int)(Math.random()*16+5);
				((Won)fig1).setRound();
				((Won)fig1).setArea();
				/*
				Won won = new Won();
				won.radius = (int)(Math.random()*16+5);
				won.setRound();
				won.setArea();
				*/
				figure[i] = fig1;
				break;
			case 1 :
				fig2 = new Semo(); //세모 객체 생성
				((Semo)fig2).width = (int)(Math.random()*16+5);
				((Semo)fig2).height = (int)(Math.random()*16+5);
				((Semo)fig2).setAria();
				/*
				Semo semo = new Semo();
				semo.width = (int)(Math.random()*16+5);
				semo.height = (int)(Math.random()*16+5);
				semo.setAria();
				*/
				figure[i] = fig2;
				break;
			case 2 :
				fig3 = new Nemo(); //네모 객체 생성
				((Nemo)fig3).width = (int)(Math.random()*16+5);
				((Nemo)fig3).height = (int)(Math.random()*16+5);
				((Nemo)fig3).setArea();
				/*
				Nemo nemo = new Nemo();
				nemo.width = (int)(Math.random()*16+5);
				nemo.height = (int)(Math.random()*16+5);
				nemo.setArea();
				*/
				figure[i] = fig3;
				break;
			}
		}
		//비교값 저장 변수
		double tempNum1 = 0;
		double tempNum2 = 0;
		
		//오름차순 정렬
		for (int i = 0; i < figure.length-1; i++) {
			//비교할 넓이 값을 tempNum1에 저장
			if (figure[i] instanceof Won) { //Won 타입의 객체인지 확인
				tempNum1 = ((Won)figure[i]).area;
			}else if(figure[i] instanceof Semo) { //Semo 타입의 객체인지 확인
				tempNum1 = ((Semo)figure[i]).area;
			}else if(figure[i] instanceof Nemo) { //Nemo 타입의 객체인지 확인
				tempNum1 = ((Nemo)figure[i]).area;
			}
			for (int j = i+1; j < figure.length; j++) {
				//비교할 넓이 값을 tempNum2에 저장
				if (figure[j] instanceof Won) {
					tempNum2 = ((Won)figure[j]).area;
				}else if(figure[j] instanceof Semo) {
					tempNum2 = ((Semo)figure[j]).area;
				}else if(figure[j] instanceof Nemo) {
					tempNum2 = ((Nemo)figure[j]).area;
				}
				
				//오름차순 정렬
				if (tempNum1 > tempNum2) {
					Figure tempFig = new Figure();
					tempFig = figure[i];
					figure[i] = figure[j];
					figure[j] = tempFig;	
					tempNum1 = tempNum2;
				}
			}
		}
		
		//출력
		int num = 1; // 카운트를 위한 변수
		for(Figure f : figure) {
			System.out.print(num+". ");
			f.toPrint(); // Figure 클래스에 있는 toPrint()함수를 각 클래스에서 오버라이드(재정의)한 값 출력
			System.out.println("================================================================");
			num++;
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
