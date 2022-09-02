package step02.oop;

class Parent3 extends Object{
	String name;
	
	@Override
	public String toString() {
		return name;
	}
}

public class Child3 extends Parent3 {
	String nickName;
	
	// toString 오버라이딩 
	public String toString(String name) {
		return name+ " " + nickName; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 child= new Child3();
		child.name = "java";
		child.nickName = "oop";
		
		System.out.println(child);
		// 주소값이 아니라 name, nickName 이 출력되려면?
		// toString 오버라이딩
		
		System.out.println(child.name);
		System.out.println(child.nickName);
		System.out.println(child);
		
		
		Parent3 parent = new Parent3();
		System.out.println(parent.toString());
		
		

	}

}
