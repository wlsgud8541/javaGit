package day06;

public class Ex02 {
	public static void main(String[] args) {
		String id = "hong";
		String pw = "12345";
		String name = "홍길동";
		int age = 23;
		String mail = "hong@gamil.com";
		String tel = "010-1111-1111";
		boolean show = true;
		
		String showView = (show == true) ? "활동 중" : "활동 안하는 중";
		
		System.out.printf("아이디 : %s\n패스워드 : %s\n이름 : %s\n나이 : %d\n이메일 : %s\n전화번호 : %s\n활동여부 : %s",id,pw,name,age,mail,tel,showView);
		
	}
}
