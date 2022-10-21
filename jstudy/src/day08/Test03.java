package day08;

public class Test03 {
	/*
	 * Semo 클래스를 가져다 삼각형을 만들어보자
	 * 밑변과 높이는 랜덤하게 5~20사이의 정수로 만든다.
	 * */
	 public static void main(String[] args) {
		 //세모 만들기
		 Semo s1 = new Semo();
		 /*
		  * 참고 ]
		  * 	위 명령에서
		  * 		Semo()
		  * 	는 생성자 함수를 호출하는 것이다.
		  * 	위처럼 매개변수에 데이터가 아무것도 입력되지 않는 형태의 생성자를
		  * 	기본생성자 라고 부르고
		  * 	이 생성자는 제작한 클래스에 생성자가 정의되지 않았으면
		  * 	자바가상머신이 만들어서 호출해준다.
		  * */
		 
		 //System.out.println("밑변 : " + s1.width);

		 //밑변과 높이 셋팅하기
		 s1.width = (int)(Math.random()*16+5);
		 s1.height = (int)(Math.random()*16+5);
		 
		 // 밑변과 높이 출력
		 System.out.println("밑변 : "+s1.width);
		 System.out.println("높이 : "+s1.height);
		 
		 System.out.println("============================================================");
		 
		 // 밑변과 높이가 셋팅이 됬으므로 면적도 셋팅
		 // s1이 가지고 있는 면적 셋팅함수 호출
		 s1.setAria();
		 
		 System.out.println("밑변 : "+s1.width);
		 System.out.println("높이 : "+s1.height);
		 System.out.println("면적 : "+s1.area);
		 
	}
}
