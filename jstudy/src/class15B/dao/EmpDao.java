package class15B.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import class15B.sql.EmpSQL;
import class15B.vo.EmpVO;
import db.SmartJDBC;

/**
 * 이 클래스는 사원 정보 데이터베이스 작업 전담 처리 클래서
 * @author 전진형
 * @since 2022/11/07
 * */


public class EmpDao {

	/*
	 * 이 클래스가 new 되는 경우는
	 * emp 테이블에 접근해서 데이터베이스 작업이 필요한 경우이다.
	 * 따라서 이 클래스가 new 되는 순간 오라클을 사용할 준비가 끝나 있어야 한다.
	 * */
	
	private SmartJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private EmpSQL eSQL;
	
	public EmpDao() {
		db = new SmartJDBC();
		eSQL = new EmpSQL();
	}

	/*
	 * 참고 ]
	 * 
	 * -- 한개의 타입, 1개의 데이터
	 * SELECT COUNT(*) FROM EMP; ==> 해당타입으로 반환
	 * 
	 * -- 한개의 타입으로 여러데이터(여러행)
	 * SELECT EMPNO FROM EMP; ==> 데이터들을 ArrayList 담아서 반환
	 * 
	 * -- 여러타입의 한행의 데이터
	 * SELECT * FROM EMP WHERE ENAME = 'SMITH'; ==> VO에 담아서 반환
	 * 
	 * -- 여러타입이 여러행으로 조회된 결과
	 * SELECT * FROM EMP; ==> VO 를 ArrayList 담아서 반환
	 * 
	 * 
	 * 
	 * */
	
	
	//사원이름리스트 조회 전담 처리 함수
	public ArrayList getNameList() {
		//0. 반환값 변수 반들기
			ArrayList list = new ArrayList();
		
		//1. 커넥션 꺼내오기
			con = db.getCon("scott", "tiger");
		
		//2. 질의명령 가져오기			
			String sql = eSQL.getSQL(eSQL.SEL_NAME_LIST);
		
		//3. 명령전달도구 준비하기	
		// 필요한 질의명령이 채워야 할 데이터가 없는 완성된 질의명령이므로 질의명령 완성작업은 필요없다.
		// 이미 완성된 질의명령(? 가 없는 질의명령)이므로 Statement로 처리한다.
			
			stmt = db.getStmt(con);
			//pstmt = db.getPstmt(con, sql);
			
		//4. 질의명령 보내고 결과받기
		try {
			rs = stmt.executeQuery(sql); //stmt : 질의명령 실어서 보내는 명령 전달 도구
			//rs = pstmt.executeQuery(); //stmt : 질의명령 실어서 보내는 명령 전달 도구
			
		//5. 조회결과에서 데이터꺼내기
			//만들어진 inline 테이블이 여러행이므로 반복처리하면 된다.
			while (rs.next()) {
				/*rs.next() : ResultSet이 기억하고 있는 인라인테이블의 가상레코드포인터를 한 행 밑으로 내려주는 명령
				 			  반환값은 꺼낼 데이터가 있으면 true, 없으면 false 즉, EOF로 이동하는 순간 false 를 반환*/
				
				//조건식에서 rs.next() 레코드포인터를 데이터를 꺼내올 행으로 이동시켰으니 데이터를 꺼내서 처리해주면 된다.
				
				// 지금의 경우 사원들의 이름들만 조회를 하고 있으니 한 가지 타입의 한 개의 데이터가 여러행 조회된다.
				// 따라서 문자열을 꺼낸 후 리스트에 채워주면 된다.
				String name = rs.getString("ename");

				//6. 꺼낸데이터 ArrayList에 채우기
				list.add(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		//7. ArrayList 반환
			return list;
	}
	
	// 사원이름을 전달받아서 사원 정보 조회 전담 처리 함수
	public EmpVO getNameInfo(String name) {
		// 0. 반환값 변수 만들기
		EmpVO eVO = new EmpVO();
		
		// 1. 커넥션 얻어오기
		con = db.getCon("scott", "tiger");
		
		// 2. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_NAME_INFO);
		
		// 3. 명령전달도구 꺼내오기
		pstmt = db.getPstmt(con, sql);
		
		try {
		// 4. 질의명령 완성하기
		pstmt.setString(1, name);
		
		// 5. 질의 명령 보내기
		rs = pstmt.executeQuery();
		
		// 6. 결과 꺼내서 VO에 담기
		rs.next(); // 레코드포인터 한 행 내리기
		int mno = rs.getInt("mno");
		String eName = rs.getString("name");
		String job = rs.getString("job");
		String sName = rs.getString("sname");
		int sal = rs.getInt("sal");
		int grade = rs.getInt("grade");
		int comm = rs.getInt("comm");
		String dName = rs.getString("dname");
		Date hdate = rs.getDate("hdate");
		
		eVO.setMno(mno);
		eVO.setName(eName);
		eVO.setJob(job);
		eVO.setSname(sName);
		eVO.setSal(sal);
		eVO.setGrade(grade);
		eVO.setComm(comm);
		eVO.setDname(dName);
		eVO.setHdate(hdate);
		
		eVO.setSdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
			
		// 7. VO 반환해주기
		return eVO;
	}
	
	public ArrayList<Integer> getDeptNoList() {
		ArrayList<Integer> list = new ArrayList<Integer>(); //반환값 변수
		con = db.getCon("scott","tiger");					//커넥션
		String sql = eSQL.getSQL(eSQL.SEL_DEPT_LIST);		//질의명령 가져오기
		stmt = db.getStmt(con);								//명령전달도구
		try {
			rs = stmt.executeQuery(sql);					//질의명령 보내기
			while (rs.next()) {								//한줄씩 내리면서 꺼내서 리스트에 담기
				int deptNo = rs.getInt("deptNo");
				list.add(deptNo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;										//리스트 반환
	}
	
	public ArrayList<EmpVO> getDeptInfo(int dept) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		con = db.getCon("scott","tiger");
		String sql = eSQL.getSQL(eSQL.SEL_DEPT_INFO);
		pstmt = db.getPstmt(con, sql);
		try {
			pstmt.setInt(1, dept);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				EmpVO eVO = new EmpVO();
				int deptno = rs.getInt("deptno");
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				
				eVO.setDno(deptno);
				eVO.setMno(empno);
				eVO.setName(ename);
				eVO.setJob(job);
				eVO.setSal(sal);
				
				list.add(eVO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return list;
	}
	
	public int addEmp(EmpVO eVO) {
		//0. 반환값 변수
		int result = 0;
		
		//1. 커넥션 꺼내오기
		con = db.getCon("scott","tiger");
		System.out.println(eVO.getName());
		System.out.println(eVO.getJob());
		System.out.println(eVO.getSname());
		System.out.println(eVO.getSal());
		System.out.println(eVO.getComm());
		System.out.println(eVO.getMail());
		//2. 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.ADD_EMP);
		
		//3. 명령전달도구 가져오기
		pstmt = db.getPstmt(con, sql);
		//4. 질의명령 완성하기
		try {
			pstmt.setString(1, eVO.getName());
			pstmt.setString(2, eVO.getJob());
			pstmt.setString(3, eVO.getSname());
			pstmt.setInt(4, eVO.getSal());
			pstmt.setInt(5, eVO.getComm());
			pstmt.setString(6, eVO.getSname());
			pstmt.setString(7, eVO.getMail());
			
			//5. 질의명령 보내고 결과받기
			/*
			 * 삽입, 수정, 삭제 질의명령의 경우
			 * 인라인테이블이 만들어지지 않기 때문에
			 * 처리결과를 알아보려면
			 * 	 executeUpdate()
			 * 함수를 사용하는 것이 편리하다.
			 * 이 함수의 반환값은 int인데
			 * 의미는 처리결과 변경된 행의 수를 반환해준다.
			 * 따라서 삽입 질의명령의 결과는
			 *	 성공했을 경우 1
			 *	 실패했을 경우 0
			 * 으로 반환해준다.
			 * 
			 * */
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(pstmt);
			db.close(con);
		}
		
		//6. 반환값 내보내기
		return result;
	}
	
	// 사원이름과 급여를 입력받아서 수정해주는 작업 전담 처리함수
	public int editNameSal(String name, int sal) {
		//1.반환값 변수 만들기
		int result = 0;
		//2.커넥션 연결
		con = db.getCon("scott","tiger");
		//3.질의명령 생성
		String sql = eSQL.getSQL(eSQL.EDIT_ENO_SAL);
		//4.명령전달도구생성
		pstmt = db.getPstmt(con, sql);
		try {
			pstmt.setInt(1, sal);
			pstmt.setString(2, name);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		//5.질의명령 완성
		
		//6.질의명령 보내고 결과박기
		
		
		//7.결과 반환해주기
		return result;
		
	}
	
	
	
	
	
	
	
	
	
}
