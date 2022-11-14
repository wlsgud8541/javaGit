package day24.stream;

import java.io.*;

public class Test08 {

// PrintStream 을 이용해서 파일을 저장
	
	  
	public Test08() {
		// 스트림 준비
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day24/stream/휘파람2.txt");
			
			ps.println("Hey, boy");
			ps.println();
			ps.println("Make 'em whistle like a missile bomb, bomb");
			ps.println("Every time I show up, blow up, uh");
			ps.println("Make 'em whistle like a missile bomb, bomb");
			ps.println("Every time I show up, blow up, uh");
			
			ps.flush();
			// 내부적으로 Buffer 기능을 가지고 있으므로 반드시 내보내기가 끝나면 버퍼를 비워준다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (Exception e2) {}
		}
		
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}
