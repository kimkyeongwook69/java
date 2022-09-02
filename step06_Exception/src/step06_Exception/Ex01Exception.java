package step06_Exception;

class A{}
class B extends A{}
class C extends A{}

public class Ex01Exception {

	public static void main(String[] args) {
			// NPE
		String str1 = null;
//		System.out.println(str1.length());
		
		String str2 = "three";
		Integer.parseInt(str2);
		
		// ArrayIndexOutofBoundsException
		int[] i1 = {1, 2, 3};
//		System.out.println(i1[3]);
		
//		
		//
		
		//System.out.println(10 / 0);
		
		A a = new B();
		B b = new B();
		C c = (C)a;
	}

}
