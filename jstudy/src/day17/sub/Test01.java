package day17.sub;

public class Test01 {

	Figure[] arr;
	public Test01() {
		setArr();
		arrPrint();
	}
	
	public void setArr() {
		arr = new Figure[20];
		
		for (int i = 0; i < arr.length; i++) {
			int rNum = (int)(Math.random()*3);
			int num1 = (int)(Math.random()*16+5);
			int num2 = (int)(Math.random()*16+5);
			int num3 = (int)(Math.random()*16+5);
			
			
			switch(rNum) {
				case 0 :
					arr[i] = new Circle(num1);
					break;
				case 1 :
					arr[i] = new Samgak(num2,num3);
					break;
				case 2 :
					arr[i] = new Sagak(num2,num3);
					break;
			}
		}
	}
	
	public void arrPrint() {
		for (Figure f : arr) {
			f.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
