package day24.stream;

import java.io.*;

public class Test12 {
// jennie.txt 파일읽기
	public Test12() {
		// 기본 스트림
		FileInputStream  fin = null;
		
		// 보조 스트림
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day24/stream/jennie.txt");
			oin = new ObjectInputStream(fin);
			
			// 데이터 읽어서 변수에 기억
			Member member = (Member)oin.readObject();
			
			// 출력
			System.out.println("이름 : " + member.getName() + " | 메일 : " + member.getMail() + " | 나이 : " + member.getAge());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		new Test12();
	}
}
