package day08;

public class Semo {
	int width;
	int height;
	double area;
	
	//밑변과 높이가 결정된 후 호출되면 면적을 계산해서 세팅해주는 함수
	public void setAria() {
		area = width * height * 0.5;
		//area = width * height / 2.;
	}
	
	
}
