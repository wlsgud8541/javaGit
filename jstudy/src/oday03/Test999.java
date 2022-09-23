package oday03;

public class Test999 {
	private int no1, no2, no3;
	
	public Test999() {}
	
	public Test999(int no1, int no2, int no3) {
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
	}

	public static void main(String[] args) {
		Test999 test01 = new Test999();
		Test999 test02 = new Test999(1,2,3);
		Test999 test03 = new Test999();
		Test999 test04 = new Test999();
		Test999 test05 = new Test999();
	
		System.out.println(test02.no1);
		System.out.println(test02.no2);
		System.out.println(test02.no3);
	}
	
	
}
