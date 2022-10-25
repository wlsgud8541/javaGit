package day10;

public class Nemo extends Figure{ // Figure 라는 클래스를 상속받아서 Nemo 클래스를 만든다.
	public int width;
	public int height;
	
	public void setArea() {
		area = width*height;
	}

	public void toPrint() {
		System.out.println("[ ■ ] 반지름 : " + width + " / 둘레 : " + height + " / 넓이 : " + area);
	}
}
