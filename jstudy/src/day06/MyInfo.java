package day06;

public class MyInfo {
	public static void main(String[] args) {
		String name = "전진형";
		int age = 30;
		String birth = "1993/09/28";
		String phone = "01027608541";
		String email = "wlsgud8541@naver.com";
		boolean marry = false;
		char gen = 'M';
		double height = 171.3;
		
		System.out.printf("이름 : %s\n"
						+ "나이 : %d\n"
						+ "생일 : %s\n"
						+ "전화번호 : %s\n"
						+ "이메일 : %s\n"
						+ "결혼여부 : %B\n"
						+ "성별 : %s\n"
						+ "키 : %.1f",name,age,birth,phone,email,marry,(gen=='M')?"남자":"여자",height);
		
	}
}
