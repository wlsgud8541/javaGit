package class15B.controller;

import class15B.dao.MemberDao;

public class MemberController {
	private MemberDao mDao;
	
	
	public MemberController() {
		mDao = new MemberDao();
		printIdList();
	}
	
	// 회원아이디 리스트 질의명령 출력
	public void printIdList() {
		// 질의명령 꺼내오기
		String sql = mDao.getIdList();
		
		// 출력
		System.out.println("회원 아이디 리스트 조회 질의 명령");
		System.out.println(sql);
		System.out.println("---------------------------------------");
		
		sql = mDao.getIdInfo();
		System.out.println("아이디를 통한 회원 정보 리스트 조회 질의 명령");
		System.out.println(sql);
		
	}
	
	public static void main(String[] args) {
		new MemberController();
	}
}
