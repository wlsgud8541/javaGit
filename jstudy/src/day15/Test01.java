package day15;

public class Test01 {
	
	String name;
	
	public Test01() {
		Student stu = new Student();
		stu.setName("jennie"); // stud 가 이거하는 주소의 인스턴스 내의 setName()호출
		setName("jennie"); //(1) 함수 호출
		
	}
	
	public void setName(String name) { // (1)
		this.name = name; // 이것처럼 변수는 찾을 때 제일 가까운 변수를 찾아가는데
		//소속 구분이 명확하게 필요한 경우는 this를 붙여서 구분처리해 줄 수 있다.
		System.out.println("이름" + name);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
