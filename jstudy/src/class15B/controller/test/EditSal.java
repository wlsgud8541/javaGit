package class15B.controller.test;

import javax.swing.JOptionPane;

import class15B.dao.EmpDao;

public class EditSal implements Father{
	private EmpDao eDao;
	private Test01 main;
	
	public EditSal() {}
	public EditSal(EmpDao eDao) {
		this.eDao = eDao;
	}

	public EditSal(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
	
	@Override
	public void satang() {
		editNameSal();
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
}
