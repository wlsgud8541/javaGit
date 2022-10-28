package day12;

public class Ex01 {
	
	/* 
	 * 2차원 배열을 만들고
	 * 데이터를 넣어서 출력
	 * 
	 * 1]
	 * 1	2	3	4	5
	 * 3	4	5	6	7
	 * 5	6	7	8	9
	 * 7	8	9	10	11
	 * 9	10	11	12	13
	 * 
	 * 2]
	 * 
	 *1		3	5	7	9
	 *4		6	8	10	12
	 *7		9	11	13	15
	 *10	12	14	16	18
	 *13	15	17	19	21
	 * 
	 * 
	 * */
	
	public Ex01() {
		int[][] arr = new int[5][5];
		int temp = 0;
		
		//배열에 담기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = (i*2+1)+j;
			}
		}
		
		//출력 1
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("==================================================");
		System.out.println();
		
		//배열에 담기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = (i*3+1)+j;
			}
		}
		
		//출력 1
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
