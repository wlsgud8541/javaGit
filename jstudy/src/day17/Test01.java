package day17;

public class Test01 {

	public Test01() {
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}


final class Father01{
	public int abc;
	public final int num = 100; // final 변수는 생성되는 순간 초기화가 되어야 한다.
	
	public void abc() {
		System.out.println("Father01.abc()");
	}
	
	public final void xyz() {
		// num = 200; // final 변수의 데이터는 수정 못한다. 
		System.out.println("Father01.xyz()");
	}
}

//class Son01 extends Father01 {} // final class로 선언된 클래스는 더 이상 수정, 추가가 불가능 하기 때문에 상속을 받지 못한다.
class Son01{
	public void abc() {
		System.out.println("Son01.abc()");
	}
	
	public final void xyz() {
		// num = 200; // final 변수의 데이터는 수정 못한다. 
	}
} 

class GrandSon01 extends Son01{
	@Override
	public void abc() {
		System.out.println("GrandSon01.abc()");
	}
	
	/*
	// final 함수는 더 이상 오버라이딩이 불가능한 함수
	@Override
	public void xyz() {
		System.out.println("GrandSon01.xyz()");
	}
	*/
}








