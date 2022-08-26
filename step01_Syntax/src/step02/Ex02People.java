package step02;

class People {
	// 멤버 변수
//	String name = "java";
//	int age = 26;
	
	String name;
	int age;
	char test;
	
	// 기본생성자 : 사용자 정의 생성자가  있는 경우에는 반드시 개발자가 지정
	People(){
		System.out.println("기본 생성자 호출");
	}
	
	// 사용자 정의 생성자 : 객체 생성시, 초기화
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	// setAge - 매개변수O(int age), 리턴값X(void), 조건
	void setAge(int age) {
		if( age > 0) {
			this.age = age;
		}else {
			System.out.println("지정한 나이로 update할 수 없음");
		}
	}
}

public class Ex02People {

	public static void main(String[] args) {
		People ppl1 = new People();
		System.out.println(ppl1.name);
		System.out.println(ppl1.age);
		System.out.println(ppl1.test);
		
		// step01 : 초기값을 갖고 있는 상태의 객체 생성 --> 사용자 정의 생성자 필수
		People ppl2 = new People("apple", 30);
		System.out.println(ppl2.getName());
		System.out.println(ppl2.getAge());
		
		// step02 : 객체의 데이터 보호 --> set함수 이용
		People ppl3 = new People("google", 20);
//		ppl3.age = -10; 본래 들어가서는 안되는 데이터이므로 보호 필요
		
		
		// ? setAge  메소드 생성 : 새로운 나이를 지정, 단 음수는 지정되지 않도록
		ppl3.setAge(-40);
		System.out.println(ppl3.getAge());
	}

}

