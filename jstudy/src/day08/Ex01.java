package day08;

public class Ex01 {
	/*
		won 10개의 정보를 기억할 배열을 만들고
		원을 채워넣어서(5~20)
		반지름 기준 내림차순 정렬해 출력하세요
	 * */
	public static void main(String[] args) {
		Won[] won = new Won[10];
		
		for (int i = 0; i < won.length; i++) {
			//인스턴스 생성
			won[i] = new Won();
			
			//값 넣어주기
			won[i].radius = (int)(Math.random()*16+5); //반지름
			won[i].setRound(); //둘레
			won[i].setArea();  //넓이
		}
		
		for (int i = 1; i < won.length; i++) {
			for (int j = 0; j < won.length; j++) {
				if (won[i].radius > won[j].radius) {
					Won temp = won[i];
					won[i] = won[j];
					won[j] = temp;
				}
			}
		}
		
		/*
		//확인용
		for(Won w : won){
			System.out.print(w.radius+",");
			System.out.println("");
		}
		*/
		
		//출력
		for(Won w : won){
			System.out.println("===================================================");
			System.out.println("원의 반지름 : "+ w.radius);
			System.out.println("원의 둘래 : "+ w.round);
			System.out.println("원의 넓이 : "+ w.area);
		}
		
		
	}
}
