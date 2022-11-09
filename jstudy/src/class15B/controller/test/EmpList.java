package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class15B.dao.EmpDao;
import class15B.util.PageUtil;
import class15B.vo.EmpVO;

public class EmpList implements Father{
/*
 * EmpDao, boolean bool
 * 을 이곳에서도 사용해야 한다.
 * 따라서 두 개를 가지고 있는 Test01 객체를 전달 받아서 
 * 이 클래스가 new 되는 순간 접근 할 수 있어야 한다.
 * 
 * 즉, 이 클래스가 객체가 되는 순간 Test01의 멤버에 접근 할 수 있어야 한다.
 * 
 * */
	private Test01 main;
	private EmpDao eDao;
	
	public EmpList() {}
	public EmpList(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
	

	@Override
	public void satang() {
		// 총 사원수 조회
		int nowPage = 1;
		int pageRow = 4;
		int pageGroup = 5;
		int total = 0;
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		ArrayList<EmpVO> list = null;
		
		while (true) {
			// 총 사원 수 조회
			total = eDao.getTotal();
			// 페이지 정보 객체 셋팅
			page.setPageUtil(nowPage, total, pageRow, pageGroup);
			// 리스트 가져오기
			list = eDao.getEmpList(page);
			// 출력
			printEmpList(list, page);
			// 이동 페이지 번호 입력 받기
			// 1. 메세지 입력받기
			String msg = JOptionPane.showInputDialog("페이지 번호 입력\n상위메뉴 : UP\n프로그램 종료 : EXIT");
			// 2. 메세지 내용에 따라 조건처리
			if (msg.toUpperCase().equals("UP")) {
				break;
			}else if (msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break;
			}else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
	/*
	@Override
	public void satang() {
		// 총 사원수 조회
		int total = eDao.getTotal();
		int pageRow = 4;
		int pageGroup = 5;
		// PageUtil을 객체로 만들려면
		// 필수적으로 필요한 데이터는 nowPage, totalCount, pageRow, pageGroup이다.
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		boolean isNotStart = false;

		// 0. 기본페이지 출력
		ArrayList<EmpVO> list = eDao.getEmpList(page);
		// 출력 
		//printEmpList(list, page);
		
		while (true) {
			// 총 사원수 조회
			if (isNotStart) {
				total = eDao.getTotal();
				page.setPageUtil(nowPage, total);
				list = eDao.getEmpList(page);
				// 결과출력
				//printEmpList(list, page);
			}else {
				isNotStart = true;
			}
			printEmpList(list, page);
			
			// 1. 메세지 입력받기
			String msg = JOptionPane.showInputDialog("페이지 번호 입력\n상위메뉴 : UP\n프로그램 종료 : EXIT");
			// 2. 메세지 내용에 따라 조건처리
			if (msg.toUpperCase().equals("UP")) {
				break;
			}else if (msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break;
			}else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
	*/
	// 사원정보 출력 전담 처리함수
	 public void printEmpList(ArrayList<EmpVO> list, PageUtil page) {
		 // 리스트에 채워진 길이만큼 반복해서 내용을 출력해준다.
		 System.out.println();
		 System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		 for (int i = 0; i < list.size(); i++) {
			EmpVO eVO = list.get(i);
			//출력 데이터
			int mno = eVO.getMno();
			int dno = eVO.getDno();
			String name = eVO.getName();
			String sdate = eVO.getSdate();
			
			// 출력
			System.out.printf("▒▒ %-5d | %-10s | %15s | %2d ▒▒\n",mno,name,sdate,dno);
		}
		 System.out.println("▒▒ ============================================ ▒▒");
		 printPage(page);
	 }
	 
	 public void printPage(PageUtil page) {
		 System.out.println("▒▒ ============= 이동 가능 페이지 ============= ▒▒");
		 System.out.print("▒▒               | ");
		 for (int i = page.getStartPage(); i < page.getEndPage()+1; i++) {
			if (i == page.getNowPage()) {
				System.out.print("* | ");
			}else {
				System.out.print(i + " | ");
			}
		}
		System.out.print("             ▒▒");
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println();
		System.out.println();
	 }
}
