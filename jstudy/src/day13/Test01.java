package day13;

public class Test01 {

	public Test01() {
		Nemo sagak = new Nemo();
		Circle circle = new Circle();

		sagak.setGaro((int)(Math.random()*16+5)); //가로세팅
		sagak.setSero((int)(Math.random()*16+5)); //세로세팅
		//면적세팅
		sagak.setArea();
		System.out.println(sagak.getArea());

		circle.setRad((int)(Math.random()*16+5));
		circle.setAround();
		circle.setArea();
		System.out.println(circle.getArea());
	}

	public static void main(String[] args) {
		new Test01();
	}

}
