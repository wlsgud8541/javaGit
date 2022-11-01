package day15;

public class Ex03 {
	/*
	 * 대문자 10개를 랜덤하게 발생 시켜서 배열로 저장 후
	 * 이 배열을 이용해서 String 객체를 만드세요
	 * 
	 * 단, 대문자 배열의타입은 정수배열 타입으로 처리
	 * 
	 * */
	int [] chs = new int[10];
	
	public Ex03() {
		String str = new String();
		for (int i = 0; i < chs.length; i++) {
			int num = (int)(Math.random()*('Z'-'A'+1)+'A');
			chs[i] = num;
			str += (char)chs[i]+" ";
		}
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
