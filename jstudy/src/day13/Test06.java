package day13;

public class Test06 {
/*
 * 정수 10개를 기억할 배열을 만들고
 * 배열에 랜덤하게 숫자를 세팅하고
 * 정렬해서 출력해주는 프로그램을 작성
 * 모두 함수로 처리
 * 
 * */
	public Test06() {
		int[] arr = getArr(); // 정렬되지 않은 배열을 반환해주면 그것을 기억
		desc(arr);
		toPrint(arr);
		asc(arr);
		toPrint(arr);
	}
	
	public static void main(String[] args) {
		new Test06();
	}
	
	// 정수 10개 배열로 만들어주는 함수
	public int[] getArr() {
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*90+10);
		}
		
		return nums;
	}
	
	public void desc(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
	}

	public void asc(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
	}
	
	public void toPrint(int[] nums) {
		System.out.print("|");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d  |",nums[i]);
		}
		System.out.println();
	}
}
