package day10;

import java.util.Arrays;

public class Test03 {
	public Test03() {
		int[] arr1 = {1,2,3,4,5}; // arr1 은 heap 영역에 주소를 기억하고 있음
		//int[] arr1 = new int[]{1,2,3,4,5};
		
		int[] tmp = arr1; // tmp 또한 heap 영역에있는 arr 주소를 기억하고 있음
		
		tmp[0] = 3; // 즉, tmp의 값을 바꾸게 되면 tmp와 arr1이 보고있는 주소가 같기 때문에 두 배열의 값이 동일하게 변경됨
		
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("tmp : "+Arrays.toString(tmp));
		
	}
	
	public static void main(String[] args) {
		Test03 t3 = new Test03();
	}
}
