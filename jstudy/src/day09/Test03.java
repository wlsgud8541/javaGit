package day09;

public class Test03 {
	public Test03(){
		
		//Heap Type이 다르기 때문에 안된다.
		//int[] no1 = new float[3]; //안된다.
		//float[] num = new int[5]; //안된다.
		
		//Heap Type이 같기 때문에 문제 없다.
		int[] no3 = new int[10];

		// ==> no3에 채워진 데이터는 자동 초기화가 되서 0으로 채워진다.
		for (int no : no3) {
			System.out.print(no + ", ");
		}
		System.out.println();
		
		Nemo[] nemo =  new Nemo[5];
		for (Nemo n : nemo) {
			System.out.print(n + ", ");
		}
		
		
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
