package day14;

public class Ex02 {
	Circle[] won;
	Samgak[] semo;
	Nemo[] nemo;
	
	/*
	 * 랜덤하게 0~2 사이의 숫자를 발생
	 * 0 - 원
	 * 1 - 삼각
	 * 2 - 사각
	 * 
	 * 배열을 만드는데 5 ~ 10 사이의 데이터를 랜덤하게 가지는 배열로 만들기
	 * 
	 * 생성자를 통해서 도형이 객체가 되는 순간 기본셋팅이 완료되도록하고
	 * 결과출력
	 * 
	 * */
	
	public Ex02() {
		int num = (int)(Math.random()*3);
		int len = (int)(Math.random()*6+5);
		switch (num) {
		case 0:
			won = getCircle(len);
			/*
			for (int i = 0; i < won.length; i++) {
				System.out.printf("반지름 : %3d \n둘레 : %.3f\n넓이 : %.3f",won[i].getRad(), won[i].getArround(), won[i].getArea());
				System.out.println();
				System.out.println("==============================");
			}
			*/
			break;
		case 1:
			semo = getSamgak(len);
			toPrint(1, semo);
			/*
			for (int i = 0; i < semo.length; i++) {
				System.out.printf("밑변 : %3d \n높이 : %3d\n넓이 : %.3f",semo[i].width, semo[i].height, semo[i].area);
				System.out.println();
				System.out.println("==============================");
			}
			*/
			break;
		case 2:
			nemo = getNemo(len);
			/*
			for (int i = 0; i < nemo.length; i++) {
				System.out.printf("가로 : %3d \n세로 : %3d\n넓이 : %.3f",nemo[i].getWidth(), nemo[i].getHeight(), nemo[i].getArea());
				System.out.println();
				System.out.println("==============================");
			}
			*/
			break;	
		}
	}
	
	public void toPrint(int rno, Object obj) {
		switch (rno) {
		case 0:
			Circle[] c = (Circle[]) obj;
			break;
		case 1:
			Samgak[] s = (Samgak[]) obj;
			for (Samgak sam : s) {
				sam.toString();
			}
			break;
		case 2:
			Nemo[] n = (Nemo[]) obj;
			break;
		}
	}
	
	
	//입력된 길이만큼의 Circle 배열을 만들어서 반환해주는 함수;
	public Circle[] getCircle(int len) {
		Circle[] c = new Circle[len];
		
		for (int i = 0; i < len; i++) {
			int rad = (int)(Math.random()*16+5);
			c[i] = new Circle(rad);
		}
		return c;
	}
	
	public Samgak[] getSamgak(int len) {
		Samgak[] s = new Samgak[len];
		
		for (int i = 0; i < len; i++) {
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			s[i] = new Samgak(width,height);
		}
		return s;
	}
	
	public Nemo[] getNemo(int len) {
		Nemo[] n = new Nemo[len];
		
		for (int i = 0; i < len; i++) {
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			n[i] = new Nemo(width,height);
		}
		return n;
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
