package oday06;

import javax.swing.JFrame;

public class Test01 {
	
	public Test01() {
		JFrame fr = new JFrame(); // 창 만드는 명령
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 버튼 기본 이벤트 추가
		fr.setTitle("### 점심 추천 ###");

		fr.setSize(450, 600);
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test01();
	}

	public void abc() {
		
	}
	
}
