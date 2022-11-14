package day24.stream;

import java.io.*;

import javax.swing.JOptionPane;

public class Test05 {
// 1. 폴더 하나를 생성 ==> mkdir();
// 2. 계층화 된 폴더를 생성 ==> mkdirs();
// 3. 만들어진 폴더 삭제
	public Test05() {
	/*
		// 1. 폴더 만들기
		File file = new File("src/day24/stream/test01");
		file.mkdir();
	*/
	/*	
		// 2. 계층화된 폴더 만들기
		File file = new File("src/day24/stream/test02/t01/t02");
		if (file.mkdirs()) {
			JOptionPane.showMessageDialog(null, "### 폴더 생성 성공 ###");
		}else {
			JOptionPane.showMessageDialog(null, "### 폴더 생성 실패 ###");
		}
	*/
	/*	
		// 3. 폴더 삭제
		File file = new File("src/day24/stream/test02/t01/t02");
		if (file.delete()) {
			JOptionPane.showMessageDialog(null, "### 폴더 삭제 성공 ###");
		}else {
			JOptionPane.showMessageDialog(null, "### 폴더 삭제 실패 ###");
		}
	*/
		
		//4. 폴더이름 변경
		// 1. 현재폴더와 변경 될 폴더를 File 로 만들어 둔다.
		File oldF = new File("src/day24/stream/test02/t01");
		File newF = new File("src/day24/stream/test02/T01");
		
		// 2. renameTO() 함수를 사용해 바꾼다.
		oldF.renameTo(newF);
		
	}
	
	public static void main(String[] args) {
		new Test05();
	}
}
