package oday01;

public class Ex7_1 {
/*
 	문제 7-1 ]
 		*****
 		****
		***
		**
		*
 	문제 7-2 ]
 		    *
 		   **
		  ***
		 ****
		*****
	문제 7-2 ]
 		    *
 		   ***
		  *****
		 *******
		*********	
 */
	public static void main(String[] args) {
		System.out.println("==================문제 7-1===================");
		//문제 7-1
		/*
		 * i = 5 / j =  1,2,3,4,5
		 * i = 4 / j =  1,2,3,4
		 * i = 3 / j =  1,2,3
		 * i = 2 / j =  1,2
		 * i = 1 / j =  1
		 * */
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println();
		System.out.println("==================문제 7-2===================");
		//문제 7-2
		/*
		 * i = 0 / j =  -,-,-,-,1
		 * i = 1 / j =  -,-,-,1,2
		 * i = 2 / j =  -,-,1,2,3
		 * i = 3 / j =  -,1,2,3,4
		 * i = 4 / j =  1,2,3,4,5
		 * */
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("==================문제 7-3===================");
		//문제 7-3
		/*
		 * i = 0 / j =  -,-,-,-,1
		 * i = 1 / j =  -,-,-,1,2,3
		 * i = 2 / j =  -,-,1,2,3,4,5
		 * i = 3 / j =  -,1,2,3,4,5,6,7
		 * i = 4 / j =  1,2,3,4,5,6,7,8,9
		 * */
		int temp = 1;
		//System.out.println("temp : "+temp);
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= temp ; j++) {
				System.out.print("*");
			}
			temp += 2;
			System.out.println();
		}
		
	}

}
