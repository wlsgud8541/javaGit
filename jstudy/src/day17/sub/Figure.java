package day17.sub;

public interface Figure {
	int no = 10; // 인터페이스 내의 변수는 자동적으로 public static final 이 앞에 붙게 된다.
	void toPrint(); // 이 함수는 자동적으로 public abstract 가 앞에 붙게 된다.
}
