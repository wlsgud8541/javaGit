package day21;

import java.util.*;

public class Test04 {

	public Test04() {
		/*
		TreeMap map = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				Nemo n1 = (Nemo) o1;
				Nemo n2 = (Nemo) o2;
				
				result = n1.getArea() == n2.getArea() ? 0 : (n1.getArea() < n2.getArea() ? 1 : -1); 
				
				return result;
			}
		});
		 */
		TreeMap map = new TreeMap(new Comparator<Nemo>() {
			@Override
			public int compare(Nemo o1, Nemo o2) {
				return o1.getArea() == o2.getArea() ? 0 : (o1.getArea() < o2.getArea() ? 1 : -1);
			}
		});
		
		Nemo n1 = new Nemo(1, 1);
		Nemo n2 = new Nemo(2, 2);
		map.put(new Nemo(1,1), "네모1");
		map.put(new Nemo(2,2), "네모2");
		//System.out.println("n1 : " + map.get(n1));
		//System.out.println("n2 : " + map.get(n2));

		map.put(new Nemo(3,3), "네모3");
		map.put(new Nemo(4,4), "네모4");
		Set set = map.keySet();
		Iterator<Nemo> itor = set.iterator();
		while (itor.hasNext()) {
			Nemo key = itor.next();
			System.out.println(key);
			System.out.println("value : " + map.get(key));
		}
	}
	
	public static void main(String[] args) {
		new Test04();
	}
}
