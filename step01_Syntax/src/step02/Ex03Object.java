package step02;

public class Ex03Object {

	public static void main(String[] args) {
		/* 왜 결과가  A A B 로 출력될까?
		 * ===> B 객체 생성 시점은 언제일까?
		 *  -> 객체의 생성은 객체가 보유하고 있는 모든 멤버 변수 (필드) 이 메모리에 생성이 되어야만 객체 생성이 완료됨
		 * 
		 * 
		 */
		
		A a = new A();
		B b = new B();
//		C c = new C();
		
	}

}

class A {
	A() {
		System.out.println("Class A");
	}
}

class B {
	A a = new A();
	B() {
		System.out.println("Class B");
	}
}

class C {
	C() {
		System.out.println("Class C");
	}
}


