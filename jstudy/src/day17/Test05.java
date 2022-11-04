package day17;

import java.awt.*;
import javax.swing.*;


public class Test05 {

	JFrame fr;
	JPanel pan;
	JButton btn;
	public Test05() {
		fr = new JFrame("Color Change");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan = new JPanel();
		// 패널에 색상 설정
		pan.setBackground(Color.WHITE);
		
		btn = new JButton("Color Change");
		btn.addActionListener(new BtnEvt(this));
		
		fr.add(pan, BorderLayout.CENTER);
		fr.add(btn, BorderLayout.SOUTH);
		
		fr.setResizable(false);
		fr.setSize(300, 400);
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test05();
	}
}
