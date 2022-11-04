package day17;

public class Test04 {
	private Figure[] fig;
	
	public Test04() {
		setArr();
		printFig();
		
		Figure f = new Sagak(10, 20);
		f.toPrint();
	}
	
	//배열 셋팅 전담 처리함수
	public void setArr() {
		int num = (int)(Math.random()*16+5);
		fig = new Figure[num];

		//길이만큼 반복해서 배열에 채우기
		for (int i = 0; i < fig.length; i++) {
			int temp = (int)(Math.random()*3);
			int rad = (int)(Math.random()*16+5);
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);

			switch(temp) {
				case 0 :
					fig[i] = new Dongle(rad);
					break;
				case 1 :
					fig[i] = new Semo(width, height);
					break;
				case 2 :
					fig[i] = new Nemo(width, height);
					break;
			}
		}
	}
	
	public void printFig() {
		for (Figure f : fig) {
			f.toPrint();
		}
	}
	
	
	public static void main(String[] args) {
		new Test04();
	}
}
