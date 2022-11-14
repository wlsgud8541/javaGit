package day24;

/*
 * 점수를 입력받아 학점을 계산해서 출력
 * */
import java.text.*;
import javax.swing.*;

public class Test07 {
/*
 * ChoiceFormat을 만들 때
 * limits와 formats를 하나로 만들 수 있다.
 * 
 * 만드는 형식 ]
 * 		60#D : 60보다 (<=)의 의미
 * 		70<C : 70보다 (<)의 의미
 * 
 * 		이것을 | 를 이용해서 연결해서 사용하면 된다.
 * */
	
	public Test07() {
		String pattern = "0#F|60#D|70#C|80#B|90<A";
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		String sno = JOptionPane.showInputDialog("점수 입력");
		int score = Integer.parseInt(sno);
		
		// 학점 계산
		String grade = form.format(score);
		System.out.println("입력받은 점수 : "+score+"\n학         점 : "+grade);
				
	}
	
	public static void main(String[] args) {
		new Test07();
	}
}
