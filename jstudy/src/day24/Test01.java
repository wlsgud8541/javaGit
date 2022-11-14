package day24;

public class Test01 {

	public Test01() {
		Nemo n1 = new Nemo(5,10);
		Nemo n2 = new Nemo(10,5);
		
		if (n1.equals(n2)) {
			// 같은 네모인(면적이 같은) 경우 실행되는 블럭
			System.out.println("n1 : "+n1);
			System.out.println("n1 과 n2 는 같은 네모");
		}else {
			// 다른 네모인(면적이 다른) 경우 실행되는 블럭
			System.out.println("n1 과 n2 는 다른 네모");
		}
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
