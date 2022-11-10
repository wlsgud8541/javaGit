package day22;

import java.util.*;

public class Test04 {

	public Test04() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "jennie");
		map.put("age", "27");
		map.put("mail", "jennie@githrd.com");
		
		String name = map.get("name");
		String age = map.get("age");
		String mail = map.get("mail");
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("mail : " + mail);
	}
	 
	public static void main(String[] args) {
		new Test04();
	}
}
