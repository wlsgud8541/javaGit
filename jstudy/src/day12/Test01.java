package day12;

public class Test01 {
	public Test01() {
int[][] arr = new int[5][];
		
		arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{1,2,3,4,5};
		arr[2] = new int[]{10};
		arr[3] = new int[]{11,12,13,14};
		arr[4] = new int[]{21,22};
		
		for (int[]a : arr) {
			for(int no : a) {
				System.out.printf("%-3d",no);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}
