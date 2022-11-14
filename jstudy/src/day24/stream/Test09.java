package day24.stream;

// 파일을 문자 단위 스트림으로 읽어보자.

import java.io.*;

public class Test09 {

	public Test09() {
		FileReader fr = null;
		try {
			fr = new FileReader("src/day24/stream/tempFile.txt");
			
			// 데이터 기억할 배열 생성
			char[] buff = new char[1024];
			
			// 저장된 데이터 길이 추출 및 저장
			int len = fr.read(buff);
			
			// 저장된 문자를 문자열에 저장
			String str = new String(buff,0,len);
			
			// 출력
			System.out.println(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {}
		}
	}
	
	public static void main(String[] args) {
		new Test09();
	}
}
