package day20.ex02;

public interface Figure extends Comparable{
	double getArea();
	void figurePrint();
	// 이 인터페이스에는 Comparable 인터페이스가 가지고 있는
	// compareTo() 추상함수도 가지고 있는 인터페이스
}
