package day15;

public class Ex04 {
/*
 * 게시글 하나의 정보를 기억 할 수 있는 Board 클래스를 제작
 * 
 * 데이터 셋팅
 * 
 * 꺼내서 출력
 * 
 * 배열에 5개의 글을 담아서 출력
 * 
 * */
	
	
	public Ex04() {
		Board[] boardList = new Board[5];

		boardList[0] = new Board(1,"작성자1","제목1","2022-11-02",1);
		boardList[1] = new Board(2,"작성자2","제목2","2022-11-02",2);
		boardList[2] = new Board(3,"작성자3","제목3","2022-11-02",3);
		boardList[3] = new Board(4,"작성자4","제목4","2022-11-02",4);
		boardList[4] = new Board(5,"작성자5","제목5","2022-11-02",5);
		
		for (int i = 0; i < boardList.length; i++) {
			System.out.println(" | " + boardList[i].no + " | " + boardList[i].title + " | " + boardList[i].writer + " | " + boardList[i].insertDate + " | " + boardList[i].view + " | ");
			System.out.println(" ----------------------------------------");
			
		}
		
		Board board = new Board();
		boardList = board.getList();
		
		for (int i = 0; i < boardList.length; i++) {
			System.out.println(" | " + boardList[i].no + " | " + boardList[i].title + " | " + boardList[i].writer + " | " + boardList[i].insertDate + " | " + boardList[i].view + " | ");
			System.out.println(" ----------------------------------------");
			
		}
		
	}

	public static void main(String[] args) {
		new Ex04();
	}
}
