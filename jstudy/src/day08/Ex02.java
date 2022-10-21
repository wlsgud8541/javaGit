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
			int num1 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
			int num2 = (int)(Math.random()*16+5); //도형 가로 세로 반지름
			
			switch (temp) {
			case 0:
				won.radius = num1; //반지름
				won.setRound(); //둘레
				won.setArea();  //넓이
				moyang[i] = won; //object 타입 배열에 won넣기
				break;
			
			case 1:
				semo.height = num1; //높이
				semo.width = num2;	//가로
				semo.setAria();     //넓이
				moyang[i] = semo; //object 타입 배열에 semo넣기
				break;
			case 2:
				nemo.height = num1; //세로
				nemo.width = num2;	//가로
				nemo.setArea();	    //넓이
				moyang[i] = nemo; //object 타입 배열에 nemo넣기
				break;
			}
		
		}
		
		
		for (Object obj : moyang) {
			if (obj instanceof Won) {
				System.out.println("원"+ ((Won)obj).area);
			}else if (obj instanceof Semo) {
				System.out.println("삼각형"+ ((Semo)obj).area);
			}else if (obj instanceof Nemo) {
				System.out.println("사각형"+ ((Nemo)obj).area);
			}
		}
		
		
		/*
		Object o = new Nemo(); 
		if(o instanceof Nemo ) {
			System.out.println(((Nemo)o).width);
		}
		// Object 타입으로 변환된 객체는 사용할 때 반드시 원래 타입으로 강제 형변환 해줘야한다.`
		*/
	}
}
