package day07;

public class Test05 {
	/*
	 * 
	 * 10개의 정수를 기억할 배열에 랜덤하게 0 ~ 20까지 숫자를 만들어서 채워 넣고
	 * 합을 구하는데 만약 0이 발생했으면 합을 구하는 작업을 중지하세요
	 * 
	 * */
	
	public static void main(String[] args) {
		//배열 만들기
		int[] nums = new int[10];
		
		//랜덤하게 데이터 채우기
		for (int i = 0; i < 10; i++) {
			nums[i]=(int)(Math.random()*21);
		}
		
		int sum = 0;
		
		//flag 변수 생성
		boolean flag = false;
		
		for (int i = 0; i < nums.length; i++) {
			int no = nums[i];
			if (no == 0) {
				flag = true;
				break;
			}
			sum += nums[i];
		}
		
		if (flag == true) { // if(flag == true) ==> if(flag) <== flag에 담긴 데이터는 true아니면 false이기 때문에 사용가능
			System.out.println("0이 출력됨");
		}else {
			System.out.println("sum : " + sum);
		}
		
		//System.out.println("sum : " + sum);
		//System.out.println("flag : " + (flag ? "비정상종료" : "정상종료"));
	}
}
