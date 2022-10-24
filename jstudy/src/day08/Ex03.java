package day08;

public class Ex03 {
	public static void main(String[] args) {
		//object 타입 배열 생성
		Object[] moyang = new Object[10];
		
		//moyang 배열에 10개를 랜덤하게 넣기
		for (int i = 0; i < moyang.length; i++) {
			//랜덤변수생성
			int temp = (int)(Math.random()*3); 	  //도형 랜덤 추출용
			int num1 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
			int num2 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
		
			switch (temp) {
			case 0:
				Won won = new Won();
				((Won)won).radius = num1; //반지름
				((Won)won).setRound(); //둘레
				((Won)won).setArea();  //넓이
				moyang[i] = won; //object 타입 배열에 won넣기
				break;
			
			case 1:
				Semo semo = new Semo();
				((Semo)semo).height = num1; //높이
				((Semo)semo).width = num2;	//가로
				((Semo)semo).setAria();     //넓이
				moyang[i] = semo; //object 타입 배열에 semo넣기
				break;
				
			case 2:
				Nemo nemo = new Nemo();
				((Nemo)nemo).height = num1; //세로
				((Nemo)nemo).width = num2;	//가로
				((Nemo)nemo).setArea();	    //넓이
				moyang[i] = nemo; //object 타입 배열에 nemo넣기
				break;
			}
		}
		
		//정렬
		Object tempObj = new Object();
		for (int i = 0; i < moyang.length-1; i++) {
			double tempNum1 = 0.0;
			if (moyang[i] instanceof Won) {
				tempNum1 = ((Won)moyang[i]).area;
			}else if (moyang[i] instanceof Semo) {
				tempNum1 = ((Semo)moyang[i]).area;
			}else if (moyang[i] instanceof Nemo) {
				tempNum1 = ((Nemo)moyang[i]).area;
			}
			
			for (int j = i+1; j < moyang.length; j++) {
				double tempNum2 = 0.0;
				if (moyang[j] instanceof Won) {
					tempNum2 = ((Won)moyang[j]).area;
				}else if (moyang[j] instanceof Semo) {
					tempNum2 = ((Semo)moyang[j]).area;
				}else if (moyang[j] instanceof Nemo) {
					tempNum2 = ((Nemo)moyang[j]).area;
				}

				if (tempNum1>tempNum2) {
					tempObj = moyang[i];
					moyang[i] = moyang[j];
					moyang[j] = tempObj;
					tempNum1 = tempNum2;
				}
			}
		}
		
		//출력
		for (Object obj : moyang) {
			if (obj instanceof Won) {
				System.out.print("원 / 반지름 : "+((Won)obj).radius + " / 둘레 : "+((Won)obj).round + " / 넓이 : "+((Won)obj).area);
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------");
			}else if (obj instanceof Semo) {
				System.out.print("삼각형 / 가로 : "+((Semo)obj).width + " / 세로 : "+ ((Semo)obj).height + " / 넓이 : "+((Semo)obj).area);
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------");
			}else if (obj instanceof Nemo) {
				System.out.print("사각형 / 가로 : "+((Nemo)obj).width + " / 세로 : "+ ((Nemo)obj).height + " / 넓이 : "+((Nemo)obj).area);
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------");
			}
		}
	}
}
