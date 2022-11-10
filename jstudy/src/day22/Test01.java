package day22;

import java.io.*;
import java.util.*;

public class Test01 {
/*
 * test.properties 파일을 읽어서 Map에 기억시키고 출력해보자. 
 * */
	public Test01() {
		// Properties 객체를 만든다.
		Properties prop = new Properties();
		// 외부 파일과 연결한다.
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day22/test_ko.properties");
			// 파일에서 읽은 내용을 Properties에서 읽기
			prop.load(fin); //==> 파일의 내용이 Map으로 전환됨.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		// HashMap처럼 사용
		String name = (String)prop.get("name");
		String mail = (String)prop.get("mail");
		String tel = (String)prop.get("tel");
		String sage = (String)prop.get("age");
		int age = Integer.parseInt(sage);
		
		// 출력
		System.out.println("name : " + name);
		System.out.println("mail : " + mail);
		System.out.println("tel : " + tel);
		System.out.println("age : " + age);
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
