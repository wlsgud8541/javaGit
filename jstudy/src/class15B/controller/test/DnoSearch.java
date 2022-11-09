package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class15B.dao.EmpDao;
import class15B.vo.EmpVO;

public class DnoSearch implements Father{
	private EmpDao eDao;
	private Test01 main;

	public DnoSearch() {
	//	eDao = new EmpDao();
	}

	public DnoSearch(EmpDao eDao) {
		this.eDao = eDao;
	}

	public DnoSearch(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
	
	@Override
	public void satang() {
		while (true) {
			// 부서 번호 리스트 조회
			printDeptList();
			// 부서번호로 사원 정보 조회
			String strNo = JOptionPane.showInputDialog("조회할 부서번호 입력\n(UP) - 전 단계로 돌아가기\n(EXIT) - 프로그램종료").toUpperCase();
			if (strNo.equals("UP")) {
				break;
			}else if (strNo.equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break;
			}else {
				int deptno = Integer.parseInt(strNo);
				printDeptInfo(deptno);
			}
		}
	}
	
	public void printDeptList() {
		ArrayList<Integer> deptList = eDao.getDeptNoList();
		System.out.println();
		for (int i = 0; i < deptList.size(); i++) {
			System.out.print(deptList.get(i) + " | ");
		}
		System.out.println();
	}
	
	public void printDeptInfo(int dept) {
		ArrayList<EmpVO> deptList = eDao.getDeptInfo(dept);
		
		for (EmpVO evo : deptList) {
			int deptno = evo.getDno();
			int empno = evo.getMno();
			String ename = evo.getName();
			String job = evo.getJob();
			int sal = evo.getSal();
			System.out.printf("부서번호 : %2d | 사원이름 : %5s | 사원번호 : %2d | 직   급 : %2s | 급   여 : %2d\n",deptno,ename,empno,job,sal);
		}
	}
}
