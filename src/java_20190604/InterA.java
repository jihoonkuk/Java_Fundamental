package java_20190604;

//인터페이스 상속은 다중상속이 가능함.
public interface InterA extends InterB, InterC{
	
	//인터페이스의 변수 public static final이 생략되어 있음
	double PI = 3.14;
	
	//인터페이스에서 메서드의 접근 한정자를 붙이지 않으면 public이 생략되어 있음
	//인터페이스는 abstract를 안붙여도 추상
	void mA();

}
