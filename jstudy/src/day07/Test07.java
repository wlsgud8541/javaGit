package day07;

public class Test07 {
	public static void main(String[] args) {
		MyInfo mi = new MyInfo();
		System.out.println("name : " + mi.name);
		System.out.println("height : " + mi.height);
		System.out.println("gen : " + mi.gen);

		System.out.println("============================================================");
		mi.name = "jennie";
		mi.height = 165.5;
		mi.gen = 'F';
		System.out.println("name : " + mi.name);
		System.out.println("height : " + mi.height);
		System.out.println("gen : " + mi.gen);

		System.out.println("============================================================");
		MyInfo mi2 = new MyInfo();
		mi2.name = "전진형";
		System.out.println("name : " + mi2.name);
	}
}
