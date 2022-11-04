package day17;

import java.awt.*;
import java.awt.event.*;

public class BtnEvt implements ActionListener{
	
	Test05 main;
	
	public BtnEvt() {}
	public BtnEvt(Test05 main) {
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		Color color = new Color(red, green, blue);
		
		main.pan.setBackground(color);
	}

}
