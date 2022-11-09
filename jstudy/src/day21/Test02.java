package day21;

import java.util.*;

public class Test02 {
	Comparator localComp;
	public Test02() {
		TreeSet set = new TreeSet(new Comparator() {
			// 무명 내부 클래스
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		TreeSet set2 = new TreeSet(new SetSort1());
	}
	
	public static void main(String[] args) {
		new Test02();
	}
	
	class SetSort1 implements Comparator{
		// 전역 내부 클래스
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	public TreeSet getTree() {
		TreeSet set ;
		class LInnerCls implements Comparator{
			// 지역 내부 클래스 이 함수 내에서만 사용 할 수 있는 클래스
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		/*
		localComp = new LInnerCls();
		set = new TreeSet(localComp);
		*/
		set = new TreeSet(new LInnerCls());
		return set;
	}
}
