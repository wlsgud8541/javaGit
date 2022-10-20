package day07;

public class Test02 {
	public static void main(String[] args) {
		String name1 = "jennie"; // 리터럴풀의 데이터 자체의 주소를 기억
		String name2 = new String("jennie"); // heap에 만들어진 인스턴스의 주소를 기억
		
		// 출력
		System.out.println("name1 : "+ name1);
		System.out.println("name2 : "+ name2);
		System.out.println(name1 == name2);

		System.out.println(name1.equals(name2));
	}
}
