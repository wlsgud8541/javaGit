package day17;

import java.awt.event.ActionListener;

public class Test06 {

	public Test06() {
		BtnEvt evt = new BtnEvt();
		getEvt(evt);
		/*
		 * ActionListener act
		 * act = evt;
		 * 
		 *  <== ActionListener act = new BtnEvt();
		 */
	}
	
	public void getEvt(ActionListener act) {
		
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}
