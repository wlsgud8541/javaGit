package oday01;

public class Ex12 {

/*

1. 

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

2. 

1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

 */
	public static void main(String[] args) {
		
		System.out.println("===========================1번 문제===============================");
		/*
		 * 1번 문제 																			모든 수에 1씩뺀다면?   
		 * i = 0 , j = 0              /1번  0					=> 1						=>  0
		 * i = 1 , j = 0 ,1			  /2번  1, 2				=> 2, 3						=>  1, 2
		 * i = 2 , j = 0, 1, 2    	  /3번  2, 3, 4				=> 4, 5, 6					=>  3, 4, 5
		 * i = 3 , j = 0, 1, 2, 3     /4번  3, 4, 5, 6			=> 7, 8, 9, 10				=>  6, 7, 8, 9
		 * i = 4 , j = 0, 1, 2, 3, 4  /5번  4, 5, 6, 7, 8	    => 11, 12, 13, 14, 15		=>  10, 11, 12, 13, 14
		 *																						여기에 공식을 대입하면? (공식 : n*(n+1)/2 )
		 * 
		 * 중첩된 덧셈결과 구하는 공식 : n*(n+1) / 2
		 * n = 0 => 0*(0+1)/2 = 0
		 * n = 1 => 1*(1+1)/2 = 1
		 * n = 2 => 2*(2+1)/2 = 3
		 * n = 3 => 3*(3+1)/2 = 6
		 * n = 4 => 4*(4+1)/2 = 10
		 * 
		 * 0,1,3,6,10 이라는 첫 자리 값을 구할 수 있다.
		 * 
		 * */    
		
		/*
		int temp = 0;
		for (int i = 1; i < 6; i++) {			// i = 1				=> i = 2 					=> i = 3
			for (int j = 1; j <= i ; j++) {     // j = 1				=> j = 1, 2					=> j = 1, 2, 3
				System.out.print(temp+j+" ");	// temp = 0 / 출력값 : 1  => temp = 1 / 출력값 : 2, 3 	=> temp = 3 / 출력값 : 4, 5, 6  
			}
			temp += i; // 
			System.out.println();
		}
		
		System.out.println();
		*/
		
		
		for (int i = 1; i < 5; i++) {
			
		}
		
		for (int i = 0; i < 5; i++) {
			int temp = i; 
			int tempNum = 0;
			
			for (int k = 0; k <= temp; k++) {
				tempNum += k;
			}
			
			for (int j = 0; j <= i ; j++) {  
				System.out.print((j+1)+tempNum+" ");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("===========================2번 문제===============================");
		// 2번 문제
		/*
		1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				int num = i * 5;
				System.out.print(j+num+" "); 
			}
			System.out.println();
		}
		
	}

}
