package day16;

public class Test02 {

	public Test02() {
		Son s = new Son();
		Grand g = s;
		g.abc();
		
		Father f = s;
		f.abc();
		f.xyz();
		System.out.println(f.money);
		
		//변수는 레퍼런스 쪽을 따른다.
		//함수는 인스턴스 쪽을 따른다.

	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
