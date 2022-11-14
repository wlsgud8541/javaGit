package day24.stream;

import java.io.*;
import java.util.Arrays;

public class Test02 {

	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day24/stream/Test01.java"); //byte단위 기본 스트림
			
		/*
			// 1. 한 글자 읽기
			int ch = fin.read();
			// 출력
			System.out.println((char)ch);
		*/
			
		/*
			// 2. 여러 글자 읽기
			byte[] buff = new byte[1024];
			int len = fin.read(buff); //읽은 데이터를 buff 배열에 기억하고 읽은 갯수 반환
			
			String str = new String(buff, 0, len);
			
			// 출력
			System.out.println(str);
		*/
			
			// 파일 내용 전체 읽기
			// 몇 글자 인지 모름으로 while문 사용
			byte[] buff = new byte[1024];
			while(true) {
				// 배열 0으로 채우기
				Arrays.fill(buff, (byte)0);
				// 읽기
				int len = fin.read(buff);
				// 문자열로 변환
				String str = new String(buff, 0, len);
				// 출력ㅣ
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
