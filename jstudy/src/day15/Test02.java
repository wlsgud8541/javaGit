package day15;

public class Test02 {

	/*
	 * 다양한 갯수의 정수를 입력받아서
	 * 그 합을 구해주는 함수 getSum() 을 만드세요
	 * 
	 * */
	
	public Test02() {
		
		int result1 = getSum(1,6,5,5,4,9,7,2,4,6,2);
		System.out.println(result1);
		int result2 = getSum(1,6,6,2);
		System.out.println(result2);
		
		int[] arr = {1,2,3};
		System.out.println("getSum(new int[]{1,2,3}) : " + getSum(arr)); // ==> int[] 길이에 상관없이 호출 할 수 있다.
	}
	
	public int getSum(int ... num) { // 가변인수는 자동적으로 배열변수가되므로 배열처럼 다뤄야함
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			result += num[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
