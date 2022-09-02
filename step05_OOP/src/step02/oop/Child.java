package step02.oop;


// 부모 클래스
class Parent extends Object {
	String name;
	int age;
	
	public Parent() {
//		System.out.println("부모 생성자");
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(age);
//		System.out.println("부모 메소드");
	
	}
}
	
// 자바는 단일 상속(클래스 간에)을 원칙으로 한다 . 
public class Child extends Parent {
	String wish;
	
	public Child() {
//		super(); //Parent() 부모의 생성자 호출 
//		System.out.println("자식 생성자");
	}
	
	//메소드 오버라이딩
	void printInfo() {
//		System.out.println(name);
//		System.out.println(age);
		super.printInfo();
		System.out.println(wish);
//		System.out.println("자식 메소드");
	}

	public static void main(String[] args) {
		// 상속
			Child child = new Child();
			child.wish = "game";
			child.name = "Java";
			child.age = 26;
			
//			child.printInfo();
			
			
//			Parent parent = new Parent();
			
			// 다형성 : 타입을 다양하게 변경할 수 있다. 
			Parent p1 = new Parent();
			Child c1 = new Child();
			
			Parent c2 = new Child(); 
			// c2는 자식 객체이면서 부모의 타입이다.
			// 자동 타입 변환: 자식 객체가 부모 타입으로 생성 
			/* 타입                *객체
			 * Child pc = new Child();
			 * Parent c2 = pc;
			 */
			// c2는 부모의 타입이기 때문에 자식이 갖고 있는 wish는 사용 할수 없다.
			// 더불어 c2는 자식이 갖고 있는 다른 메소드도 원칙적으로 사용이 불가능 하다 .
			// 단, Child클래스가 부모의 메소드를 오버라이딩 하고 있다면 자식히 호출한 메소드는
			// 오버라이딩된 자식의 메소드가 호출된다 . 
			c2.printInfo();
			
			// 부모객체가 자식타입으로 생성이 될까??
//			Child p2 = new Parent(); // 에러 : 부모 객체는 자식 타입으로 생성 할 수 없다. 
			
			
			// 강제 타입 변환 : 부모타입 : 자식 객체가 부모타입을 생성 되었다가 다시 자식 타입으로 변환
			Parent c3 = new Child();
			Child c33 = (Child)c3;
	}
}
