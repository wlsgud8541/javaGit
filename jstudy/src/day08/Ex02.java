package day08;

public class Ex02 {
	/*
	 * 원, 삼각형, 사각형을 기억할 Object 타입 배열을 만들어서
	 * 10개를 랜덤하게 채워넣고 넓이 기준 오름차순 정렬해서 정보를 출력해주는 프로그램을 작성하세요.
	 * 
	 * 
	 * 참고 ] 객체의 타입을 확인해주는 연산자
	 * 			instanceof
	 * 			
	 * 		  형식]
	 * 			변수 instanceof 클래스이름 
	 * 
	 * 의미 ] 변수의 타입이 클래스 이름타입인가? / 반환값은 논리값(true/false)
	 * 
	 * 	
		Object o = new Nemo(); 
			if(o instanceof Nemo ) {
				System.out.println(((Nemo)o).width);
			}
			// Object 타입으로 변환된 객체는 사용할 때 반드시 원래 타입으로 강제 형변환 해줘야한다.`
		
	 * */
	public static void main(String[] args) {
		//object 타입 배열 생성
		Object[] moyang = new Object[10];
		
		//클래스 타입 객체생성
		Won won = new Won();
		Semo semo = new Semo();
		Nemo nemo = new Nemo();
		
		//moyang 배열에 10개를 랜덤하게 넣기
		for (int i = 0; i < moyang.length; i++) {
			//랜덤변수생성
			int temp = (int)(Math.random()*3); //도형 랜덤 추출용
			//int num1 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
			//int num2 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
			switch (temp) {
			case 0:
				//won.radius = num1; //반지름
				//won.setRound(); //둘레
				//won.setArea();  //넓이
				moyang[i] = won; //object 타입 배열에 won넣기
				break;
			
			case 1:
				//semo.height = num1; //높이
				//semo.width = num2;	//가로
				//semo.setAria();     //넓이
				moyang[i] = semo; //object 타입 배열에 semo넣기
				break;
				
			case 2:
				//nemo.height = num1; //세로
				//nemo.width = num2;	//가로
				//nemo.setArea();	    //넓이
				moyang[i] = nemo; //object 타입 배열에 nemo넣기
				break;
			}
		
		}
		
		double[][] temp2 = new double[10][4];
		int tempNum = 0;
		for (Object obj : moyang) {
			int num1 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
			int num2 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
			
			if (obj instanceof Won) {
				won.radius = num1; //반지름
				won.setRound(); //둘레
				won.setArea();  //넓이
				
				temp2[tempNum][0] = (int)won.radius; 
				temp2[tempNum][1] = won.round; 
				temp2[tempNum][2] = won.area;
				temp2[tempNum][3] = 0;
				
			}else if (obj instanceof Semo) {
				semo.height = num1; //높이
				semo.width = num2;	//가로
				semo.setAria();     //넓이
				
				temp2[tempNum][0] = (int)semo.height; 
				temp2[tempNum][1] = (int)semo.width; 
				temp2[tempNum][2] = semo.area;
				temp2[tempNum][3] = 1;
				
			}else if (obj instanceof Nemo) {
				nemo.height = num1; //세로
				nemo.width = num2;	//가로
				nemo.setArea();	    //넓이
				
				temp2[tempNum][0] = (int)nemo.height; 
				temp2[tempNum][1] = (int)nemo.width; 
				temp2[tempNum][2] = nemo.area;
				temp2[tempNum][3] = 2;
			}
			tempNum++;
		}
		
		double[][] temp3 = new double[1][4];//임시배열
		for (int i = 0; i < temp2.length-1; i++) {
			for (int j = i+1; j < temp2.length; j++) {
				if (temp2[i][2]>temp2[j][2]) {
					
					
					temp3[0][0] = temp2[i][0];
					temp3[0][1] = temp2[i][1];
					temp3[0][2] = temp2[i][2];
					temp3[0][3] = temp2[i][3];
					
					temp2[i][0] = temp2[j][0];
					temp2[i][1] = temp2[j][1];
					temp2[i][2] = temp2[j][2];
					temp2[i][3] = temp2[j][3];
					
					temp2[j][0] = temp3[0][0];
					temp2[j][1] = temp3[0][1];
					temp2[j][2] = temp3[0][2];
					temp2[j][3] = temp3[0][3];
					
				}
			}
		}
		
		
		
		
		//출력
		for (int i = 0; i < temp2.length; i++) {
			System.out.println("==================정렬"+i+"번째==================");
			for (int j = 0; j < 3; j++) {
				if (temp2[i][3] == 0) {
					System.out.println("원의 반지름 : "+temp2[i][0]);
					System.out.println("원의 반지름 : "+temp2[i][1]);
					System.out.println("원의 반지름 : "+temp2[i][2]);
				}else if (temp2[i][3] == 1) {
					
				}else if (temp2[i][3] == 2) {
					
				}
				
			}
		}
		
	}
	
	
}
