package day21;

public class Test01 {
	public int no = 100;
	{
		// 초기화 블럭을 이용한 초기화
		no = 10;
	}
	
	public Test01() {
		//Comparator comp = new Comparator(); //Comparator는 인터페이스이기 때문에 new 시킬 수 없다.
		T01 t1 = new T01();
		t1.xyz();
		//abc();
	}

	public static void main(String[] args) {
		new Test01();
	}
	
	public void abc() {}
	
	public class T01{
		// 전역 내부 클래스
		int num = no;
		public void xyz() {
			abc();
		}
	}
	
	public static class TopClass {
		// Top Level 내부 클래스
	}
	
}

class ExtnClass {
	// 이 클래스는 외부 클래스
	Test01 t0  = new Test01();
	int num = t0.no;
	public void a1(){
		Test01.T01 t1 = t0.new T01();
		t1.xyz();
		
		t0.new T01().xyz();
	}
}