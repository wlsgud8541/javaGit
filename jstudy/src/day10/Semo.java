package day10;

public class Semo extends Figure{
	public int width;
	public int height;
	
	//밑변과 높이가 결정된 후 호출되면 면적을 계산해서 세팅해주는 함수
	public void setAria() {
		area = width * height * 0.5;
		//area = width * height / 2.;
	}
	
	public void toPrint() {
		System.out.println("[ ▲ ] 반지름 : " + width + " / 둘레 : " + height + " / 넓이 : " + area);
	}
}
