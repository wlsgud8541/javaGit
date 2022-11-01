package day14;

public class Ex01 {
	/*
	 * 3 ~ 7 사이의 랜던함 정수 생성
	 * 정수만큼의 Semo 객체를 만들기
	 * 정보 출력
	 * 
	 * 참고 ] 배열 x
	 * 
	 * */
	public Ex01() {
		int num = (int)(Math.random()*5+3);
		Semo semo;
		for (int i = 0; i < num; i++) {
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			semo = new Semo();
			semo.width = width;
			semo.height = height;
			
			System.out.println("세모 밑변 : "+ semo.width + "\n세모 높이 : " + semo.height + "\n세모 넓이 : " + (semo.width*semo.height*0.5));
			System.out.println("======================");
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
