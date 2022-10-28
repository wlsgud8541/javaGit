package day12;

public class Ex00 {

	/*
	 * int[][] arr; 배열을 만들고
	 * 반복문을 이용해서 아래 처럼 숫자를 채워 넣고
	 * 꺼내서 출력
	 * 
	 * 1번] 
	 * 
	 * 1	2	3	4	5
	 * 6	7	8	9	10
	 * 11	12	13	14	15
	 * 16	17	18	19	20
	 * 21	22	23	24	25
	 * 
	 * 
	 * 
	 * 2번]
	 * int[][] nums; 배열을 만들고
	 * 1번에서 완성한 arr 배열에서 데이터를 꺼내서
	 * nums에 채워서 출력
	 * 
	 * 1	6	11	16	21
	 * 2	7	12	17	22
	 * 3	8	13	18	23
	 * 4	9	14	19	24
	 * 5	10	15	20	25
	 * 
	 * 
	 * 3번]
	 * 2 이상의 숫자중에서 소수를 10개 찾아서 배열에 담고 출력
	 * */
	public Ex00() {
		int[][] arr = new int[5][5];
		int temp = 0;
		
		//배열에 담기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = (i*5+1)+j;
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

		//출력 2
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d",arr[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		//2 이상의 숫자중에서 소수를 10개 찾아서 배열에 담고 출력
		//소수 배열에 담기
		/*
		for (int i = 2; i < 100; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (j!=1 && i%j==0 && i!=j) {
					cnt++;
				}
				if ((i==2) || (j!=1 && i%j!=0 && i!=j && cnt < 1)) {
					System.out.println(i);
					break;
				}
			}
		}
		*/
		
		int[] sosu = new int[10]; //소수를 저장할 배열
		int count = 0; // while 문 카운트 변수
		int num = 2; //시작 숫자
		
		//소수 배열에 저장
		while(count < 10) {
			int cnt = 0; //소수를 걸러내기위한 카운트 변수
			for (int j = 1; j <= num; j++) {
				if (j!=1 && num%j==0 && num!=j) {//이 부분을 타는 숫자는 소수가 아니다.
					cnt++; //cnt가 이상인 회차의 숫자는 소수가 아니다. 
				}
				if ((num==2) || (j!=1 && num%j!=0 && num!=j && cnt < 1)) { //소수만 뽑아내는 조건식
					sosu[count] = num;
					count++;
					break;
				}
			}
			num++;
		}
		
		//배열 출력
		for (int i = 0; i < sosu.length; i++) {
			System.out.println(sosu[i]);
		}
		
	}
	
	public static void main(String[] args) {
		new Ex00();
	}
}
