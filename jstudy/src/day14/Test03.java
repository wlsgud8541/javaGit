package day14;

public class Test03 {

	public Test03() {
		Member jennie = new Member();
		Member dooly = new Member();
		
		jennie.setName("jennie");
		jennie.setMail("jennie@githrd.com");
		jennie.setTel("010-1111-1111");
		
		dooly.setName("dooly");
		dooly.setMail("dooly@githrd.com");
		dooly.setTel("010-2222-2222");
		
		// 각 멤버의 이름 출력
		System.out.println("jennie name : "+jennie.getName());
		System.out.println("dooly name : "+dooly.getName());
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
