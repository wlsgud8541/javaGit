package day22;

import java.util.*;

public class Test03 {

	public Test03() {
		HashSet<String> names = new HashSet<String>();
		names.add("jennie");
		names.add("lisa");
		names.add("rose");
		names.add("jisoo");
		
		ArrayList<String> list = new ArrayList<String>(names);
		// names의 제너릭스가 전파되지 않는다.
		// 그러므로 ArrayList에 넣을 때 ArrayList에도 새롭고 제너릭스를 선언해줘야한다.
		
		Iterator<String> itor = names.iterator();
		// 여기도 Object 타입으로 데이터를 기억한다.
		// 제너릭스는 전파되지 않으며로 새로운 컬렉션이 만들어 질때 다시 선언해야 한다.
		
		while (itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
		
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}
