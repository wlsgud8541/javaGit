package day17;

public class Test03 {

	public Test03() {
		NoColor nc = new Block();
		String color = nc.getColor();
		System.out.println("color : "+color);
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
