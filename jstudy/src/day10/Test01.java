package day10;

import day08.*;

public class Test01 {
	
	//생성자 ==> 생성자 중에서 매개변수가 없는 형태의 생성자를 기본 생성자라 한다.
	//			 기본 생성자는 생성자를 하나라도 만들지 않으면 자바가상머신이 만들어 준다.
	public Test01() {
		/*
		 * 랜덤하게 원, 세모, 네모를 만들어서
		 * 내용을 출력해보자.
		 * 단, 랜덤하게 만들어질 도형의 변수는 모든 도형을 입력 할 수 있는 타입(Object)으로 한다.
		 * */
		/*
		Object obj1 = new Won();
		Object obj2 = new Semo();
		Object obj3 = new Nemo();		
		
		// 이렇게 작성한 클래스를 Object 타입 변수에 담게되면
		// 작성할 때 만들어둔 함수와 변수는 사용 할 수 없게된다.
		// 왜??
		// 왜냐하면 Object 클래스에는 그 함수와 변수가 없기 때문이다.
		// 따라서 원래 작성한 함수와 변수를 사용하려면
		// 작성한 클래스 타입으로 강제 형변환 해줘야 사용 할 수 있게된다.
		*/
		
		//Object obj = null;
		
		// 여러개의 도형을 기억해야 되므로
		// 배열이어야 하고 형태가 여러가지여야 하므로 타입은 Object 로 모아서 관리해야 한다.
		
		// ==> Object 데이터 10개를 관리할 배열을 만든다.
		Object[] arr = new Object[10]; // ==> 각 방에는 NULL로 채워져있다.
		
		//반복해서 랜덤하게 도형 만들어서 각방에 채워준다.
		for (int i = 0; i < arr.length; i++) {
			
			//랜덤하게 0 ~ 2 까지의 숫자를 만든다. 0 : 원, 1 : 삼각형, 2 : 사각형
			int num = (int)(Math.random()*3);
			
			switch (num) {
			case 0:
				/*
				Won won = new Won();
				//반지름 셋팅
				won.radius = (int)(Math.random()*16+5);
				//둘레 셋팅
				won.setRound();
				//넓이 셋팅
				won.setArea();
				
				arr[i] = won;
				*/
				
				arr[i] = new Won();
				//반지름 셋팅
				((Won)arr[i]).radius = (int)(Math.random()*16+5);
				//둘래 셋팅
				((Won)arr[i]).setRound();
				//면적
				((Won)arr[i]).setArea();
				
				break;
			case 1:
				Semo semo = new Semo();
				//가로 셋팅
				semo.width = (int)(Math.random()*16+5);
				//세로 셋팅
				semo.height = (int)(Math.random()*16+5);
				//넓이 셋팅
				semo.setAria();
				
				arr[i] = semo;
				break;
			case 2:
				Nemo nemo = new Nemo();
				//가로 셋팅
				nemo.width = (int)(Math.random()*16+5);
				//세로 셋팅
				nemo.height = (int)(Math.random()*16+5);
				//넓이 셋팅
				nemo.setArea();
				
				arr[i] = nemo;
				break;
			}
		}
		
		
		// 정렬하기
		for (int i = 0; i < arr.length-1; i++) {
			//원본 면적 꺼내기
			double area1 = 0;
			if (arr[i] instanceof Won) {
				area1 = ((Won)arr[i]).area;
			}else if (arr[i] instanceof Semo) {
				area1 = ((Semo)arr[i]).area;
			}else if (arr[i] instanceof Nemo) {
				area1 = ((Nemo)arr[i]).area;
			}
			
			for (int j = i+1; j < arr.length; j++) {
				//비교본 면적 꺼내기
				double area2 = 0;
				if (arr[j] instanceof Won) {
					area2 = ((Won)arr[j]).area;
				}else if (arr[j] instanceof Semo) {
					area2 = ((Semo)arr[j]).area;
				}else if (arr[j] instanceof Nemo) {
					area2 = ((Nemo)arr[j]).area;
				}
				
				if (area1 > area2) {
					// ==> j번재 꺼낸 데이터가 면적이 더 작은 경우이므로 위치를 서로 바꿔준다.
					Object tmp = arr[i]; //임시 변수에 기억시켜놓기
					arr[i] = arr[j]; // i번째와 j번째가 같은 데이터를 기억하게된다.
					arr[j] = tmp; 
					area1 = area2;
				}
			}
		}
		
		//출력
		//반복해서 하나씩 꺼내서 처리해준다.
		for (int i = 0; i < arr.length; i++) {
			/*
			 * arr 배열에는 Object 타입으로 데이터를 채웠으니
			 * 하나식 꺼내면 Object 타입의 데이터가 된다.
			 * Object 타입의 데이터를 실제 heap에 만든 인스턴스의 형태로 만들어 줘야 면적, 반지름 등을 사용 할 수 있게 된다.
			 * 왜? Object 에는 반지름이나 면적등이 없으므로
			 * */
			Object obj = arr[i];
			if (obj instanceof Won) { // ==> 변수 obj가 가르키는 것이 Won의 인스턴스인가?
				System.out.println("[ ● ] 의 면적은 : "+((Won)obj).area); // obj를 Won타입으로 강제형변환해서 면적 꺼내서 출력
			}else if(obj instanceof Semo) {
				System.out.println("[ ▲ ] 의 면적은 : "+((Semo)obj).area); //obj를 Semo 타입으로 강제형변환해서 면적 꺼내서 출력
			}else if (obj instanceof Nemo) {
				System.out.println("[ ■ ] 의 면적은 : "+((Nemo)obj).area); //obj를 Nemo 타입으로 강제형변환해서 면적 꺼내서 출력
			}
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
