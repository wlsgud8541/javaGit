package day18;

import java.util.*;

public class Test02 {

	public Test02() {
		//Vector vec = new Vector();
		Vector vec = new Vector(10, 1);
		
		int cap = vec.capacity();
		System.out.println(cap);

		for (int i = 0; i < 11; i++) {
			vec.add("jennie");
		}
		cap = vec.capacity();
		System.out.println("(1) vec.size() : "+vec.size());
		System.out.println("(1) vec.capacity : "+cap);
	
		for (int i = 0; i < 11; i++) {
			vec.add("jennie");
		}
		cap = vec.capacity();
		System.out.println("(2) vec.size() : "+vec.size());
		System.out.println("(2) vec.capacity : "+cap);
		
		System.out.println("=======================================");
		System.out.println("Vector : "+vec);
		
		ArrayList list = new ArrayList(vec);
		
		System.out.println("=======================================");
		System.out.println("ArrayList : "+list);
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
