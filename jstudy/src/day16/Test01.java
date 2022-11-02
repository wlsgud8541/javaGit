package day16;

public class Test01 {

	public Test01() {
		Grand g = new Grand();
		Father f = new Father();
		Son s = new Son();
		
		System.out.println("-------------------Grand Class-------------------");
		g.abc();

		System.out.println("-----------------Father Class-------------------");
		f.abc();
		f.xyz();
		System.out.println(f.money);
		
		System.out.println("-----------------Son Class-------------------");
		s.abc();
		s.xyz();
		System.out.println(s.money);

		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		Grand g2 = f;
		Father f2 = s;
		Grand g3 = s;
		
		System.out.print("Grand g2.abc() : ");
		g2.abc(); // 맨 마지막 오버라이드 된 Father 의 함수를 호출한다.

		System.out.print("Grand g3.abc() : ");
		g3.abc();
		
		System.out.print("((Son)g3).toPlay() : ");
		((Son)g3).toPlay(); //Grand class가 범위가 더 젋기 때문에 Son class로 강제 형변환을 사용해서 써야한다.
		
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		System.out.println("==========Grand==========");
		Grand g7 = g;
		System.out.print("g | g7.abc() : ");
		g7.abc();
		
		System.out.println("==========Father==========");
		g7 = f;
		System.out.print("f | g7.abc() : ");
		g7.abc();
		System.out.print("((Father)g7).xyz() : ");
		((Father)g7).xyz();
		System.out.println(((Father)g7).money);
		
		System.out.println("==========Son==========");
		g7 = s;
		System.out.print("s | g7.abc() : ");
		g7.abc();
		System.out.print("((Son)g7).xyz() : ");
		((Son)g7).xyz();
		System.out.print("((Son)g7).toPlay() : ");
		((Son)g7).toPlay();
		System.out.println(((Son)g7).money);
		
		
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();

		Grand[] gArr = new Grand[3];
		gArr[0] = g;
		gArr[1] = f;
		gArr[2] = s;
		
		for (Grand grand : gArr) {
			grand.abc();
		}

		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		System.out.println("====================Money======================");
		System.out.println("money : "+f2.money);
	
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
