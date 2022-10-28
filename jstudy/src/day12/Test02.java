package day12;

public class Test02 {
	public Test02() {
		String[] blackpink = new String[4];
		
		blackpink[0] = "제니";
		blackpink[1] = "로제";
		blackpink[2] = "리사";
		blackpink[3] = "지수";
		
		System.out.println(blackpink[0]);
		
		//float[] num = new int[5]; //==> Heap 타입이 다르기때문에 절대로 안된다.
	}
	public static void main(String[] args) {
		new Test02();
	}
}
