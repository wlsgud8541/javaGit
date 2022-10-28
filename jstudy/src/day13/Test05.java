package day13;

public class Test05 {

	public Test05() {
		int[] no = getLength();
		int area = getArea(no);
		toPrint(no, area);
	}
	
	public static void main(String[] args) {
		new Test05();
	}
	
	public int[] getLength() {
		int[] nums = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*16+5);
		}
		
		return nums;
	}
	
	public int getArea(int[] l) {
		int result = 0;
		result = l[0] * l[1];
		
		return result;
	}
	
	public void toPrint(int[] size, int area){
		System.out.printf("가로가 %3d이고 세로가 %3d 인 사각형의 넓이는 %4d 입니다.",size[0],size[1],area);
	}
}
