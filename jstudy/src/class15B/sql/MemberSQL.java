package class15B.sql;

public class MemberSQL {
	// 질의명령들 코드 정의
	public final int SEL_ID_LIST = 1001;
	public final int SEL_ID_INFO = 1002;
	// 수정질의명령
	public final int EDIT_MAIL_ID = 2001;
	
	// 질의명령의 코드값을 입력받아서 해당 질의명령을 반환해주는 함수
	public String getSQL(int code) {
		// 반환값 변수
		StringBuffer buff = new StringBuffer();
		/*
		 * StringBuffer 사용방법
		 * 1. new 시키고
		 * 2. 변수.append(문자열);
		 * 3. 변수.toString() 문자열로 반환 후 반환
		 * */
		
		switch (code) {
		// 현재 활동 중인 회원의 아이디를 조회
		case SEL_ID_LIST:
			buff.append("SELECT ID ");
			buff.append("FROM MEMBER ");
			buff.append("WHERE ISSHOW = 'Y' ");
			break;
		
		// 회원 아이디를 조회하면 해당 회원의 모든 정보 조회
		case SEL_ID_INFO:
			buff.append("SELECT MNO ");
			buff.append("	  , ID ");
			buff.append("	  , NAME ");
			buff.append("	  , MAIL ");
			buff.append("	  , TEL ");
			buff.append("	  , BIRTH ");
			buff.append("	  , GEN ");
			buff.append("	  , AVT ");
			buff.append("	  , JOINDATE ");
			buff.append("	  , ISSHOW ");
			buff.append("FROM MEMBER ");
			buff.append("WHHERE ID = ? ");
		// 아이디를 알려주고 메일주소를 알려주면 해당 아이디의 메일을 변경해주는 질의명령
		case EDIT_MAIL_ID:
			buff.append("UPDATE MEMBER "); 
			buff.append("SET MAIL = ? ");
			buff.append("WHERE ID = ? ");
			buff.append("AND MAIL = ? ");
			break;
		}
		return buff.toString();
	}
}
