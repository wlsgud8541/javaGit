package day24;

/*
 * 점수를 입력받아서 학점을 출력해주는 프로그램을 작성
 * */

import java.text.*;
import javax.swing.*;

public class Test06 {

	public Test06() {
		// limits 배열
		/*
		 * limits 배열 만들 때 주의사항
		 * 		반드시 오름차순으로 정렬되어야 한다.
		 * 		의미는 
		 * 		0 ~ 59 까지는 ???
		 * 		60 ~ 69 까지는 ???
		 * 		...
		 * 		90 ~ ???
		 * */
		double[] limits = {0, 60, 70, 80, 90};
		
		// format 생성
		// format 생성 시 주의사항 : limits 갯수와 반드시 일치해야 한다.
		String[] formats = {"F", "D", "C", "B", "A"};
		
		ChoiceFormat form = new ChoiceFormat(limits, formats);
	
		// 점수 입력
		String sno = JOptionPane.showInputDialog("점수 입력");
		
		// 점수 변환
		int score = Integer.parseInt(sno);
		
		// 학점 계산
		String grade = form.format(score);
		
		// 출력
		JOptionPane.showMessageDialog(null, "입력받은 점수 : "+score+"\n학점 : "+grade);
	
	}
	
	public static void main(String[] args) {
		new Test06();
	}
}
