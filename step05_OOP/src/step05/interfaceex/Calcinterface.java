package step05.interfaceex;

public interface Calcinterface {
	// 인터페이스에서 필드의 기본 형태는 상수이다 !! 
	double PI = 3.14;
	int ERORR = -999999;
	
	// 인터페이스에서 메소드의 기본 형태는 추상 메소드이다 !!! 
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다. ");
	}
	
	
}
