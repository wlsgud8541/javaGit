package day14;

public class Samgak {
	public int width, height;
	public double area;
	public Samgak() {//기본 생성자. 생성자가 하나도 정의되지 않으면 자바가상머신이 만들어준다.
		this(1, 1);
	}
	
	public Samgak(int width, int height) { // 생성자 오버로딩
		// 밑변과 높이를 셋팅주면서 객체를 만들어주는 생성자
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = width * height * 0.5;
	}

	/*public void setArea(double area) { // setArea 오버로딩
		this.area = area;
	}
	*/
	@Override
	public String toString() {
		return "세모 밑변 : "+ width + "\n세모 높이 : " + height + "\n세모 넓이 : " + (width*height*0.5) + "\n======================";
	}
}
