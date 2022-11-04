package class15B.util;

public class PageUtil {
	private int nowPage;	// 현재 페이지 번호
	private int totalPage;	// 총 페이지 수
	private int totalCount; // 총 게시글 수
	
	private int pageRow;	// 한페이지에 보여질 게시글 수
	private int pageGroup;  // 이동가능한 페이지 수
	
	private int startPage;  // 현 페이지에서 시작할 페이지 번호
	private int endPage;	// 현 페이지에서 마지막 페이지 번호
	
	private int startRno;	// 현페이지에서 보여질 시작 게시글 row 번호
	private int endRno;		// 현페이지에서 보여질 마지막 게시글 row 번호

	public PageUtil() {
		
	}

	public PageUtil(int nowPage, int totalCount) {
		this(nowPage, totalCount, 3, 3);
		/*
		this.nowPage = nowPage;
		this.totalCount = totalCount;
		this.pageRow = 3;
		this.pageGroup = 3;
		setTotalPage();
		setRno();
		setPage();
		*/
	}
	
	public PageUtil(int totalCount, int pageRow, int pageGroup) {
		this(1, totalCount, pageRow, pageGroup);
		/*
		this.nowPage = 1;
		this.totalCount = totalCount;
		this.pageRow = pageRow;
		this.pageGroup = pageGroup;
		
		setTotalPage();
		setRno();
		setPage();
		*/
	}

	public PageUtil(int nowPage, int totalCount, int pageRow, int pageGroup) {
		this.nowPage = nowPage;
		this.totalCount = totalCount;
		this.pageRow = pageRow;
		this.pageGroup = pageGroup;
		
		setTotalPage();
		setRno();
		setPage();
	}
	
	public void setTotalPage() {
		totalPage = (totalCount == 0) ? 1 : (totalCount % pageRow == 0) ? (totalCount /pageRow) : (totalCount / pageRow +1);
	}

	public void setRno() {
		startRno = (nowPage - 1) * pageRow + 1; 
		endRno = (nowPage * pageRow > totalCount) ? totalCount : (nowPage * pageRow);
	}
	
	public void setPage() {
		// 시작 페이지
		// 현재 보는 페이지 그룹
		int tmpGroup = (nowPage - 1) / pageGroup;
		
		// 현재 보는 페이지 그룹의 시작 페이지 번호를 계산
		startPage = tmpGroup * pageGroup + 1;
		
		// 마지막 페이지
		// 현재 보는 페이지의 시작 페이지 번호를 기준으로 계산해주면 된다.
		endPage = (startPage - 1) + pageGroup > totalPage ? totalPage : (startPage - 1) + pageGroup; 
	}
	
	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageRow() {
		return pageRow;
	}

	public void setPageRow(int pageRow) {
		this.pageRow = pageRow;
	}

	public int getPageGroup() {
		return pageGroup;
	}

	public void setPageGroup(int pageGroup) {
		this.pageGroup = pageGroup;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRno() {
		return startRno;
	}

	public void setStartRno(int startRno) {
		this.startRno = startRno;
	}

	public int getEndRno() {
		return endRno;
	}

	public void setEndRno(int endRno) {
		this.endRno = endRno;
	}

}
