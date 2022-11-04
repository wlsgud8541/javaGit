package day18;

import java.util.*;

public class Test03 {

	public Test03() {
		ArrayList list = new ArrayList();
		
		//데이터 추가
		list.add("jennie");
		list.add("lisa");
		list.add("rose");
		list.add("jisoo");
		//출력
		System.out.println(list);

		//데이터 수정
		list.set(2, "Rose");
		list.add(2, "rose");
		list.add(2, "rose");
		//출력
		System.out.println(list);
		
		System.out.println();
		System.out.println("** Vector **");
		//데이터 복제
		Vector vec = new Vector(list);
		//출력
		System.out.println(vec);
		
		System.out.println();
		System.out.println("** HashSet **");
		HashSet set = new HashSet(list);
		set.add("rose");
		System.out.print(set);

		System.out.println();
		System.out.println();
		System.out.println("** Enumeration **");
		Enumeration en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + ", ");
		}
		System.out.println();
		System.out.println();
		System.out.println("** Iterator **");
		Iterator itor = set.iterator();
		while (itor.hasNext()) {
			System.out.print(itor.next() + ", ");
		}
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}
}
