package oday02;

public class Ex11 {
	// 문제 9] 
	/*
	 * 게시판에 게시글을 게시할 예정이다.
	 * 한페이지에 15개의 게시글을 게시 할 수있다.
	 * 게시글의 갯수를 랜덤하게 발생시켜서 //게시글 수는 0부터 100개까지
	 * 필요한 게시판 페이지가 몇 페이지 인지 출력해주는 프로그램을 작성
	 * 
	 * */
	public static void main(String[] args) {
		int num;
		int temp;
		
		num = (int)(Math.random()*101);
		
		temp = num;
		num = (num/15)+1;
		
		if (temp%15==0) {
			num = num-1;
		}
		if (num == 0) {
			num = num+1;
		}
		System.out.println("발생한 게시글 수 : "+ temp);
		System.out.println("페이지 수 : "+ num);
	}
}
