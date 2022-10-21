package day08;

public class Test06 {
	public static void main(String[] args) {
		// 만들어 지는 순간 힙 영역에 5개의 공간만 확보한 상태이다.
		// 힙영역은 기본데이터 타입 8개를 제외한 타입은 0으로 변수초기화를 하지 않는다.
		// nemo의 경우 class타입이기 때문에 null로 채워져있다.
		Nemo[] nemo = new Nemo[5];
		
		for (int i = 0; i < nemo.length; i++) {
			//각 방에 Nemo 인스턴스를 채워준다.
			nemo[i] = new Nemo();
			
			//가로,세로 변수세팅
			//i번째 방에는 인스턴스가 채워져 있으므로 가로와 세로를 세팅 할 수 있게된다.
			nemo[i].width = (int)(Math.random()*16+5);
			nemo[i].height = (int)(Math.random()*16+5);
			
			//면적 세팅
			//인스턴스가 채워져 있으므로 해당 함수를 호출 할 수 있게된다.
			//위의 과정에서 가로,세로 변수의 세팅을 완료 했으므로 해당 함수의 연산이 가능해진다.
			nemo[i].setArea();
		}
		
		//출력
		//각 방에 인스턴스를 채우고 변수까지 세팅을 완료 했으므로 향상된 for문 (forEach문)을 사용 할 수 있다.
		//배열0번 nemo class / 1번 방(class) : 가로,세로,높이
		//배열1번 nemo class / 2번 방(class) : 가로,세로,높이
		//배열2번 nemo class / 3번 방(class) : 가로,세로,높이
		//배열3번 nemo class / 4번 방(class) : 가로,세로,높이
		//배열4번 nemo class / 5번 방(class) : 가로,세로,높이
		for(Nemo nm : nemo) {
			System.out.println("가로 : "+nm.width);
			System.out.println("세로 : "+nm.height);
			System.out.println("넓이 : "+nm.area);
			System.out.println("===========================================");
		}
		
		
		//String 타입은 Class타입이지만 리터럴풀을 바로 참조할 수 있기 때문에 바로 데이터를 넣을 수 있다. 
		String[] str = new String[3];
		str[0] = "jennie1";
		str[1] = "jennie2";
		str[2] = "jennie3";
		System.out.println(str[0]);
	}	
}
