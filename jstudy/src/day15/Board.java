package day15;

public class Board {
	
	int no;
	String writer;
	String title;
	String insertDate;
	int view;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int no, String writer, String title, String insertDate, int view) {
		this.no = no;
		this.writer = writer;
		this.title = title;
		this.insertDate = insertDate;
		this.view = view;
	}

	public Board[] getList() {
		
		Board[] bList = new Board[5];
		
		for (int i = 0; i < bList.length; i++) {
			Board board = new Board();
			board.no = i+6;
			board.writer = "작성자"+(i+6);
			board.title = "제목"+(i+6);
			board.insertDate = "2022-11-02";
			board.view = i+6;
			
			bList[i] = board;
		}
		return bList;
	}
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}
	
	
}
