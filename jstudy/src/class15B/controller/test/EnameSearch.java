package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class15B.dao.*;
import class15B.vo.EmpVO;

/*
 * 사원 이름으로 정보를 조회하는 기능의 클래스
 * 
 * */

public class EnameSearch implements Father{
	private EmpDao eDao;
	private Test01 main;
	
	public EnameSearch() {
	//	eDao = new EmpDao();
	}

	public EnameSearch(EmpDao eDao) {
		this.eDao = eDao;
	}
	
	public EnameSearch(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
	
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
	
	public void printNameList() {
		// 회원 이름 리스트 조회
		ArrayList nameList = eDao.getNameList();
		System.out.println();
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print((String)nameList.get(i) + " | ");
		}
		System.out.println();
	}
/*	
	public void seteDao() {
		eDao = new EmpDao();
	}
*/	
	@Override
	public void satang() {
		while (true) {
			// 사원 이름 리스트 조회
			printNameList();
			// 이름으로 사원정보 조회
			// 조회할 사원이름 입력받기
			String name = JOptionPane.showInputDialog("조회할 사원이름 입력\n(UP) - 전 단계로 돌아가기\n(EXIT) - 프로그램종료").toUpperCase();
			if (name.equals("UP")) {
				break;
			}else if (name.equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break;
			}else {
				printNameInfo(name);
			}
		}
	}
}
