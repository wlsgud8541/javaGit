package class15B.controller;

import class15B.dao.*;
import class15B.vo.*;

import java.util.*;

import javax.swing.*;

public class EmpController {

	//사원들의 데이터베이스 작업을 컨트롤 할 컨트롤러 클래스
	/*
	 * 숙제 ] 
		4번 기능을 
			1. 이름을 입력하면 이름에 해당하는 사원들의
				[사원번호, 사원이름, 급여, 입사일, 부서번호]
			   를 출력해주는 기능을 추가
			 
			2. 출력된 사원의 사원번호와 급여를 입력해서
			   사원의 급여를 수정해주는 기능을 구현.   	
	 * 
	 * 
	 * */
	private EmpDao eDao;
	private boolean check = true;
	public EmpController() {
		eDao = new EmpDao();
		mainWin();
		
	}
	
	public void mainWin() {
		while (check) {
			String sno = JOptionPane.showInputDialog("(1) - 사원이름으로 조회\n(2) - 부서번호로 조회\n(3) - 사원추가\n(4) - 사원급여수정\n(Q) - 종료");
			sno = sno.toUpperCase();
			if (sno.equals("Q")) {
				check = false;
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break;
			}
			switch(sno) {
				case "1":
					while (true) {
						// 사원 이름 리스트 조회
						printNameList();
						// 이름으로 사원정보 조회
						// 조회할 사원이름 입력받기
						String name = JOptionPane.showInputDialog("조회할 사원이름 입력\n(UP) - 전 단계로 돌아가기\n(EXIT) - 프로그램종료").toUpperCase();
						if (name.equals("UP")) {
							break;
						}else if (name.equals("EXIT")) {
							check = false;
							JOptionPane.showMessageDialog(null, "프로그램 종료");
							break;
						}else {
							printNameInfo(name);
						}
					}
					break;
					
				case "2":
					while (true) {
						// 부서 번호 리스트 조회
						printDeptList();
						// 부서번호로 사원 정보 조회
						String strNo = JOptionPane.showInputDialog("조회할 부서번호 입력\n(UP) - 전 단계로 돌아가기\n(EXIT) - 프로그램종료").toUpperCase();
						if (strNo.equals("UP")) {
							break;
						}else if (strNo.equals("EXIT")) {
							check = false;
							JOptionPane.showMessageDialog(null, "프로그램 종료");
							break;
						}else {
							int deptno = Integer.parseInt(strNo);
							printDeptInfo(deptno);
						}
					}
					break;
				case "3":
					addEmp();
					break;
				case "4":
					editNameSal();
					break;
			}
		}
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
		ArrayList<Integer> deptList = eDao.getDeptNoList();
		System.out.println();
		for (int i = 0; i < deptList.size(); i++) {
			System.out.print(deptList.get(i) + " | ");
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
	
	// 사원 추가 작업 처리 함수
	public void addEmp() {
		// 사용할 데이터 만들기
		EmpVO eVO = new EmpVO();
		eVO.setName("WOOYOUNG");
		eVO.setJob("MANAGER");
		eVO.setSname("SMITH");
		eVO.setSal(500);
		eVO.setComm(-500);
		eVO.setMail("wooyoung@githrd.com");
		
		// DB작업
		int result = eDao.addEmp(eVO);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "[" + eVO.getName()+"] 사원을 추가했습니다.");
		}else {
			JOptionPane.showMessageDialog(null, "사원 추가에 실패했습니다.");
		}
	}

	// 사원 추가 작업 처리 함수
	public void addEmp(String name, String job, String sName) {
		// 사용할 데이터 만들기
		EmpVO eVO = new EmpVO();
		eVO.setName(name);
		eVO.setJob(job);
		eVO.setSname(sName);
		eVO.setSal(500);
		eVO.setComm(-500);
		eVO.setMail(sName+"@githrd.com");
		
		// DB작업
		int result = eDao.addEmp(eVO);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "[" + eVO.getName()+"] 사원 추가");
		}else {
			JOptionPane.showMessageDialog(null, "사원 추가 실패");
		}
	}
	
	// 사원 이름과 급여 입력받아서 해당 사원의 급여를 수정해주는 작업
	public void editNameSal() {
		String name = JOptionPane.showInputDialog("이름입력").toUpperCase();
		int sal = Integer.parseInt(JOptionPane.showInputDialog("수정급여"));
		
		int result = eDao.editNameSal(name, sal);
		
		if (result == 0) {
			JOptionPane.showMessageDialog(null, "수정 실패");
		}else {
			JOptionPane.showMessageDialog(null, "수정 성공");
		}
		
	}
	
	public static void main(String[] args) {
		new EmpController();
	}
}
