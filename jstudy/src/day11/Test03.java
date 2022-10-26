package day11;

public class Test03 {

	public Test03() {
		String[] names = {"제니", "리사", "로제", "지수", "아이유", "경욱", "태윤", "우영", "경민", "혁주"};
		
		String[] blackpink = new String[4];
		
		//names 배열의 데이터 중 블랙핑크 멤버만 blackpink 배열에 복사하자.
		System.arraycopy(names, 0, blackpink, 0, 4);
		
		//출력
		for (String pink : blackpink) {
			System.out.print(pink + ", ");
		}
		System.out.println();
		
		names[0] = "jennie";

		//출력
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		//출력
		for (String pink : blackpink) {
			System.out.print(pink + ", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		new Test03();
	}
}
