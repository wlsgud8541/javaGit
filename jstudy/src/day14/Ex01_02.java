package day14;

public class Ex01_02 {
	/*
	 * 3 ~ 7 사이의 랜던함 정수 생성
	 * 정수만큼의 Semo 객체를 만들기
	 * 정보 출력
	 * */
	public Ex01_02() {
		int cnt = (int)(Math.random()*5+3);
		
		for (int i = 0; i < cnt; i++) {
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			Samgak s = new Samgak(width, height);
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01_02();
	}
}
