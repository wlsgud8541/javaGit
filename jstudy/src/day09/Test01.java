package day09;

public class Test01 {
	int no = 5;
	
	public Test01() {
		// 생성자는 클래스 이름과 동일하게 이름이 만들어 져야한다.
		// 생성자는 반환값타입이 존재하면 안된다.
		// 반환값을 가지게 되는 순간 생성자가 아닌 일반함수가 된다.
		// 이 곳에서는 static 멤버도 사용가능하고 일반 멤버도 사용이 가능하다.
		
		// 앞으로는 이곳에서 필요한 코딩을 할 예정이다.
	}
	
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		System.out.println("t1.no : "+t1.no);
		System.out.println("t1.no : "+t2.no);
		System.out.println();
		t1.no = 10;
		t2.no = 100;
	}
}
