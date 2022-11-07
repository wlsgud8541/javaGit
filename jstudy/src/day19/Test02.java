package day19;

import java.util.*;

public class Test02 {

	public Test02() {
		LinkedList list = new LinkedList();
		
		list.add("jennie");
		list.add("lisa");
		list.add("rose");
		list.add("jisoo");
		
		//출력
		for (int i = 0; i < list.size(); i++) {
			System.out.print((String)list.get(i) + " | ");
		}
		
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
