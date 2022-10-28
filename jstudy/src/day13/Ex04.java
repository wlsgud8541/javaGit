package day13;

public class Ex04 {

	/*
	 * nums 배열에 정수 10개를 기억시키고
	 * 합을 구하고
	 * 평균을 구해서
	 * 출력해주는 프로그램
	 * 
	 * 단, 배열세팅
	 * 	   합 계산
	 *	   평균 계산
	 *	   출력 기능
	 *은 함수로구현
	 * 
	 * */	
	public Ex04() {
		int[] nums = null;
		int[] no = setNums(nums);
		int plusNum = plusNum(no);
		int avgNum = avgNum(plusNum);
		toPrint(no,plusNum,avgNum);
	}
	
	public int[] setNums(int[] no) {
		no = new int[10];
		for (int i = 0; i < no.length; i++) {
			int tempNum = (int)(Math.random()*91+10);
			no[i] = tempNum;
		}
		return no;
	}
	
	public int plusNum(int[] no) {
		int result = 0;
		for (int i = 0; i < no.length; i++) {
			result += no[i]; 
		}
		return result;
	}
	
	public int avgNum(int no) {
		int result = no / 10;
		return result;
	}
	
	public void toPrint(int[] no, int result1, int result2) {
		System.out.print("배열 nums [");
		for (int i = 0; i < no.length; i++) {
			System.out.print(no[i]+",");
		}
		System.out.println("] 의 총 합은 " + result1 + "이며, 평균은 " + result2 + "입니다.");
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
