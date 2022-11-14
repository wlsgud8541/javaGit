package day24.stream;

import java.io.*;

public class Test06 {

	// 현재 폴더에서 확장자가 txt 인 파일들만 리스트를 추출
	
	public Test06() {
		// 1. 목록을 보고싶은 파일 객체를 생성
		File file = new File("src/day24/stream");
		
	/*	
		// 2. 파일 리스트 출력
		String[] list = file.list();

		// 3. 출력
		for (String dir : list) {
			System.out.println(dir);
		}
	*/	
	/*	
		File[] list = file.listFiles();
		
		for (File f : list) {
			String fileName = f.getName();
			long len = f.length();
			
			System.out.println("fileName : " + fileName + " | len : " + len + " byte");
		}
	*/
		
		// 확장자가 txt인 파일들 추출
		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*
				 * 매개변수
				 * 		File dir 	: 현재 파일의 정보를 알려준다.
				 * 		String name : 현재 파일의 이름만 알려준다.
				 * 
				 * 이 함수는 자동 호출되는 함수
				 * 목록을 구하는 파일을 하나씩 발견 할 때마다 이 함수가 호출된다.
				 * 
				 * 이 함수에서 true를 반환하면 목록에 포함
				 * 이 함수에서 false를 반환하면 목록에서 제외
				 * */

			/*
			 	// 1. 직접 확장자를 꺼내는 방법.
				String ext = name.substring(name.lastIndexOf(".") + 1);
				return ext.equals("txt");
			*/
				
				// 2. endsWith() 함수를 이용하는 방법
				return name.endsWith(".txt");
			}
		});
		
		// 출력
		for (String f : list) {
			System.out.println(f);
		}
	}
	
	public static void main(String[] args) {
		new Test06();
		
	}
}
