package step05.interfaceex;

// 자바는 단일 상속이 원칙이므로 또 다른 클래스를 상속 받을 수 없음! 
public class Calulator extends Calc{

	@Override
	public
	int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	@Override
	public
	int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public
	int divide(int num1, int num2) {
		if(num2 == 0) {
			return ERORR;
		}
		return num1 / num2;
	}
	
	

}
