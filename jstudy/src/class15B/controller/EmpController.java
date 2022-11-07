package class15B.controller;

import class15B.dao.*;
import class15B.vo.*;

import java.util.*;

import javax.swing.*;

public class EmpController {

	//사원들의 데이터베이스 작업을 컨트롤 할 컨트롤러 클래스
	
	private EmpDao eDao;
	public EmpController() {
		eDao = new EmpDao();
		/*
		
		// 사원 이름 리스트 조회
		printNameList();

		// 이름으로 사원정보 조회
		// 조회할 사원이름 입력받기
		String name = JOptionPane.showInputDialog("조회할 사원이름").toUpperCase();
		printNameInfo(name);
		
		*/
		
		// 부서 번호 리스트 조회
		printDeptList();
		// 부서번호로 사원 정보 조회
		String strNo = JOptionPane.showInputDialog("조회할 부서번호");
		int deptno = Integer.parseInt(strNo);
		printDeptInfo(deptno);
	}
	
	// 회원 이름 리스트 조회해서 출력해주는 함수
	public void printNameList() {
		// 회원 이름 리스트 조회
		ArrayList nameList = eDao.getNameList();
		System.out.println();
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print((String)nameList.get(i) + " | ");
		}
		System.out.println();
	}
	
	// 부서번호 리스트 조회해서 출력해주는 함수
	public void printDeptList() {
		ArrayList deptList = eDao.getDeptNoList();
		System.out.println();
		for (int i = 0; i < deptList.size(); i++) {
			System.out.print((int)deptList.get(i) + " | ");
		}
		System.out.println();
	}
	
	// 사원이름을 입력 받아서 사원의 정보를 출력해주는 함수
	public void printNameInfo(String name) {
		EmpVO eVO = eDao.getNameInfo(name);
		
		int mno = eVO.getMno();
		String eName = eVO.getName();
		String job = eVO.getJob();
		String sName = eVO.getSname();
		int sal = eVO.getSal();
		int grade = eVO.getGrade();
		int comm = eVO.getComm();
		String dName = eVO.getDname();
		String sDate = eVO.getSdate();
		
		System.out.println();
		System.out.println("[" + name + "] 사원 정보 ");
		System.out.println("사원번호 : " + mno);
		System.out.println("사원이름 : " + eName);
		System.out.println("직    급 : " + job);
		System.out.println("상사이름 : " + sName);
		System.out.println("사원급여 : " + sal);
		System.out.println("급여등급 : " + grade);
		System.out.println("커 미 션 : " + comm);
		System.out.println("부서이름 : " + dName);
		System.out.println("입 사 일 : " + sDate);
	}
	
	// 부서번호를 알려주면 해당 부서에 포함된 사원정보(부서번호, 사원번호, 사원이름, 직급)을 알려주는 함수 작성
	public void printDeptInfo(int dept) {
		ArrayList deptList = eDao.getDeptInfo(dept);
		
		for (Object o : deptList) {
			int deptno = ((EmpVO)o).getDno();
			int empno = ((EmpVO)o).getMno();
			String ename = ((EmpVO)o).getName();
			String job = ((EmpVO)o).getJob();
			
			System.out.printf("부서번호 : %2d | 사원번호 : %2d | 사원이름 : %5s | 직   급 : %2s\n",deptno,empno,ename,job);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new EmpController();
	}
}
