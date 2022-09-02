/* 값 비교
 * 1. 기본타입
 * 	- ==
 * 
 * 2. 참조타입
 * 	- == : 주소값 비교
 * 	- equals() : 
 * 			
 * 
 * 3. String의 equals()
 * 	- Object 클래스의 주소값 equals() 재정의 -> 서로 다른 객체라도 데이터 값을 비교
 * 
 * 4. java.lang.Object의 equals()
 * 	- public boolean equals(Object o){
 * 	  	객체의 주소값을 비교
 * 		return true or false;
 *    }
 */

package step03.override;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 *  equals() : 재정의 
	 *  -- 매개변수로 들어온 Object 타입의 객체 -> Person 타입으로 형 변환이 가능한지 부터 체크해주어야 합니다 !! 
	 *  -- 형변환이 가능하다면 -> 각각의 name과 age 멤버 변수를 비교 
	 */
	
	// 같은 person 타입 
	@Override
	public boolean equals(Object o) {
		// 코드 작성 
	
		if(o instanceof Person) {
			return((Person) o).name.equals(this.name) && ((Person)o).age == this.age;
		}
		return false;
	}
}

class Person2 {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class EqualsOverride {

	public static void main(String[] args) {
		Person p1 = new Person("java",26);
		Person p2 = new Person("java",26);
		Person2 p3 = new Person2("java", 26);

		// 같은 객체가 있을 것이다 !!!  p1.equals
		// 같은 person 타입 
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3)); 
		
		System.out.println();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
	}

}
