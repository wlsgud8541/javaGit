package day08;

public class Test05 {
	/*
	 * 
	 * 원 5개를 기억할 배열을 만들고
	 * 배열에 랜덤하게 반지름을 입력해서
	 * 정보를 출력해주는 프로그램을 작성해보자.
	 * 
	 * */
	public static void main(String[] args) {
		Won[] won = new Won[5];
		/*
		 * 클래스 타입의 배열의 경우
		 * 배열 변수를 만들게 되면
		 * 배열의 각 방에 데이터를 바로 채울 수 있는 상태가 아니고
		 * 배열의 각 방에 해당 클래스의 인스턴스를 채울 공간만 확보한 상태가 된다.
		 * 따라서 변수를 반든 후 반드시 인스턴스를 채우는 작업이 필요하다.
		 * */
		
		// 아직 배열의 각 방에 인스턴스는 채워져 있지 않으므로 먼저 인스턴스를 채워넣는다
		for (int i = 0; i < won.length; i++) {
			//인스턴스 채우고
			won[i] = new Won(); 
		}
		
		//반지름 셋팅
		for (int i = 0; i < won.length; i++) {
			won[i].radius = (int)(Math.random()*16+5);
			won[i].setRound();
			won[i].setArea();
		}
		
		for(Won result : won) {
			System.out.println("반지름 : "+result.radius);
			System.out.println("둘레 : "+result.round);
			System.out.println("면적 : "+result.area);
			System.out.println("------------------------------------");
		}
		
	}
}
