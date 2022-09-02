/* 객체의 타입을 확인(instanceof)
 *  - 다형성으로 인한 타입과 객체의 혼란 발생 가능
 *  - 문법 : 객체 instanceof 타입
 *  - 결과 : boolean (true or false)
 */

package step03.oop;

class A {}
class B extends A {}
class C extends A {}

public class Instanceof {
	public static void main(String[] args) {
		A b1 = new B();
		A c1 = new C();
		A a1 = new A();
		
//		System.out.println(b1 instanceof A); // 
//		System.out.println(b1 instanceof B); // 
//		System.out.println(b1 instanceof C); // 
//		
//		System.out.println();
		
//		System.out.println(c1 instanceof A); //   
//		System.out.println(c1 instanceof B); // 
//		System.out.println(c1 instanceof C); // 
//		
//		System.out.println();
		
		B b2 = new B();
		System.out.println(b2 instanceof A); //    
		System.out.println(b2 instanceof B); // 
//		System.out.println(b2 instanceof C); // 에러 : 상속 관계에 있는 대상 객체들에 한정하여 사용
	}
}