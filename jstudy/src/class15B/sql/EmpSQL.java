package class15B.sql;

public class EmpSQL {
	public final int SEL_NAME_LIST = 1001;
	public final int SEL_NAME_INFO = 1002;
	public final int SEL_DEPT_LIST = 1003;
	public final int SEL_DEPT_INFO = 1004;
	public final int SEL_EMP_LIST = 1005;
	public final int SEL_TOTAL = 1006;
	
	
	
	public final int SEL_FIND_NAME_LIST = 1100; // 사원 이름으로 [사원번호, 사원이름, 급여, 입사일, 부서번호] 리스트 조회
	
	
	
	public final int EDIT_ENO_SAL  = 2001;
	public final int ADD_EMP 	   = 3001;
	public final int DEL_EMP 	   = 4001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();

		switch (code) {
			case SEL_NAME_LIST:
				buff.append("SELECT ENAME ename ");
				buff.append("FROM EMP1 ");
				break;
			case SEL_NAME_INFO:
				//사원번호, 사원이름, 직급, 상사이름, 입사일, 급여, 급여등급, 커미션, 부서이름 조회
				buff.append("SELECT e1.EMPNO mno ");
				buff.append(", e1.ENAME name ");
				buff.append(", e1.JOB job ");
				buff.append(", e2.ENAME sname ");
				buff.append(", e1.HIREDATE hdate ");
				buff.append(", e1.SAL sal ");
				buff.append(", NVL(s.GRADE, -1) grade ");
				buff.append(", e1.COMM comm ");
				buff.append(", d.DNAME dname ");
				buff.append("FROM EMP1 e1 ");
			    buff.append(", EMP1 e2 ");
				buff.append(", SALGRADE s ");
				buff.append(", DEPT d ");
				buff.append("WHERE e1.DEPTNO = d.DEPTNO ");
				buff.append("AND e1.MGR = e2.EMPNO(+) ");
				buff.append("AND e1.SAL BETWEEN s.LOSAL(+) AND s.HISAL(+) ");	
				buff.append("AND e1.ENAME = ? ");
				break;
			
			case SEL_DEPT_LIST:
				buff.append("SELECT deptno ");
				buff.append("FROM DEPT ");
				break;
				
			case SEL_DEPT_INFO:
				buff.append("SELECT deptno ");
				buff.append(", empno ");
				buff.append(", ename ");
				buff.append(", job ");
				buff.append(", sal ");
				buff.append("FROM EMP1 ");
				buff.append("WHERE DEPTNO = ? ");
				break;
				
			case ADD_EMP :
				buff.append("INSERT INTO EMP1 ");
				buff.append("VALUES( ");
				buff.append("(SELECT NVL(MAX(EMPNO)+1, 1001) FROM EMP1) ");
				buff.append(", ? ");
				buff.append(", ? ");
				buff.append(", (SELECT EMPNO FROM EMP1 WHERE ENAME = ?) ");
				buff.append(", TO_DATE(TO_CHAR(SYSDATE, 'YYYY/MM/DD'), 'YYYY/MM/DD') ");
				buff.append(", ? ");
				buff.append(", ? ");
				buff.append(", (SELECT DEPTNO FROM EMP1 WHERE ENAME = ?) ");
				buff.append(", ?) ");
				break;
				
			case EDIT_ENO_SAL:
				buff.append("UPDATE EMP1 ");
				buff.append("SET SAL = ? ");
				buff.append("WHERE ENAME = ? ");
				break;
				
			case SEL_FIND_NAME_LIST:
				buff.append("SELECT empno ");
				buff.append(",ename ");
				buff.append(",sal ");
				buff.append(",hiredate ");
				buff.append(",deptno ");
				buff.append("FROM emp1 ");
				buff.append("WHERE ENAME = ? ");
				break;
		
			case SEL_EMP_LIST:
				buff.append("SELECT rno, mno, name, hdate, dno ");
				buff.append("FROM( ");
				buff.append("	SELECT ROWNUM rno, mno, name, hdate, dno ");
				buff.append("	FROM(SELECT empno mno, ename name, hiredate hdate, deptno dno ");
				buff.append("		FROM emp1 ");
				buff.append("		ORDER BY empno)) ");
				buff.append("WHERE rno BETWEEN ? AND ? ");
				break;
				
			case SEL_TOTAL:
				buff.append("SELECT COUNT(*)cnt "); 
				buff.append("FROM EMP1 ");
				break;
		}
		
		// 질의명령 반환
		return buff.toString();
	}
}
