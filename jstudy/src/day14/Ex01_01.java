package day14;

public class Ex01_01 {
	/*
	 * 3 ~ 7 사이의 랜던함 정수 생성
	 * 정수만큼의 Semo 객체를 만들기
	 * 정보 출력
	 * */
	public Ex01_01() {
		int cnt = (int)(Math.random()*5+3);
		
		for (int i = 0; i < cnt; i++) {
			Semo s = new Semo();
			setWidth(s);
			setHeight(s);
			setArea(s);
			toPrint(s);
		}
	}
	
	// 삼각형의 밑변 셋팅해주는 함수
	public void setWidth(Semo semo) {
		semo.width = (int)(Math.random()*16+5);
	}
	
	public void setHeight(Semo semo) {
		semo.height = (int)(Math.random()*16+5);
	}
	
	public void setArea(Semo semo) {
		semo.area = semo.width * semo.height * 0.5;
	}
	
	public void toPrint(Semo semo) {
		System.out.println("세모 밑변 : "+ semo.width + "\n세모 높이 : " + semo.height + "\n세모 넓이 : " + (semo.width*semo.height*0.5));
		System.out.println("======================");
	}
	
	
	public static void main(String[] args) {
		new Ex01_01();
	}
}
