package day24.stream;

import java.io.*;
import java.util.*;

public class Test01 {

	public Test01() {
		/*
		 * 참고 ]
		 * 		키보드 역시 외부장치이다.
		 * 		자주 사용하느 ㄴ외부장치이기 때문에
		 * 		이미 스트림을 준비한 변수가 있다.
		 * 			
		 * 			==> System.in
		 * */
		
		System.out.print("한글자 입력 : ");
		int ch = 0;
		try {
			/*
			// 한글자 읽기
			ch = System.in.read();
			System.out.println("읽은 문자 : " + (char)ch);
			*/
			
			/*
			// 여러글자 읽기
			// 읽은 데이터를 기억 할 변수 생성
			byte[] buff = new byte[1024]; // ==> 배열의 사이즈에 따라서 한번에 읽을 수 있는 문자수가 결정된다.
			
			// 데이터 자장
			int len = System.in.read(buff); // ==> 읽은 데이터는 buff 배열에 기억시키고 읽은 데이터의 갯수를 반환해준다.
			
			// 문자열로 변환
			String str = new String(buff, 0, len);
			
			// 출력
			System.out.println(str);
			*/
			
			
			// 주로 네트워크 처리를 할 때 많이 사용하는 방법
			byte[] buff = new byte[1024];
			Arrays.fill(buff, (byte) 'A'); // 강제로 'A'로 모두 채우고
			int len = System.in.read(buff, 10, 100); // ==> 준비된 배열의 11번째 위치에서부터 최대 100개까지 읽은 내용을 기억
			
			String str = new String(buff, 0, len + 10);
			
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
