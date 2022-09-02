package step05_OOP;

import java.util.StringTokenizer;

class IT {
	public int num;
	
	public IT(int num) {
		this.num = num;
//		System.out.println("IT" + num + "가 생성되었습니다.");
	}
	
	// toString과 마찬가지로 자동 호출 되는 메소드
	// 단, finalize는 객체가 사라지는 경우 
	public void finalize() {
//		System.out.println("IT" + num + "가 제거되었습니다.");
		
	}
}


public class Ex01Lang {

	public static void main(String[] args) {
		//Object 클래스
		//equals() : 동일 객체인지 비교후 결과 반환
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
		
		// hashCode() : 객체 주소값을 정수로 반환----> 두가지 꼭 알고 가기 hash code, toString
//		System.out.println(obj1.hashCode());
//		
		// toString() : 객체의 정보(객체의 주소값)를 문자열로 반환
		// 개발자가 호출하지 않아도 객체 호출시 자동적으로 실행되는 메소드 
//		System.out.println(obj1);
//		System.out.println(obj1.toString());
//		
		
		// System 클래스
		// gc() : 쓰레기 수집기 
		IT it;
		
		it = new IT(1);
		it = null; 
		it = new IT(2);
		it = new IT(3);
		
		
		
		// 어플리케이션이 구동되는 동안, 메모리 상에서 제거된 객체를 삭제하는 
		// 메소드 : 직접 호출하지 않고 알아서 실행이 되는 메소드 
//		System.gc();
//		
		// getProperty() : 시스템의 속성값 
//		
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("java.home"));
//		System.out.println(System.getProperty("java,runtime.name"));
//		System.out.println(System.getProperties());
		
		
		// String 클래스
		// 객체 비교 : ==, != / equals() : 문자열의 내용을 비교
		
		// chartAt() : 지정 인덱스의 위치 문자를 반환
		String str1 = "java API";
//		System.out.println(str1.charAt(6));
//		System.out.println(str1.charAt(8)); //에러

		
		// length() : 문자열의 길이 반환
//		System.out.println(str1.length());
		
		
		
//		System.out.println(str1.indexOf("API"));
//		
//		// 대소문자로 변경 
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.toLowerCase());
		
		// substring(): 지정 위치에서 또 다른 지정 위치의 문자열을 반환 
//		System.out.println(str1.substring(0));
//		System.out.println(str1.substring(0, 5));
		
		// replace(): 지정 문자열을 변경하는 메소드 
//		System.out.println(str1.replace("java", "자바"));
		
		
		//trim() : 문자열의 앞, 뒤 공백 제거 
		String strTrim = "       Java API       ";
		System.out.println(strTrim.trim());
		
		
		// split() : 특정 구분자를 기준으로 분리된 문자열 반환
	
		String strSplit = "Java API String Test";
//		System.out.println(strSplit.split(" "));
		
		String[] strSplitArr = strSplit.split(" ");
		for(String str : strSplitArr) {
			System.out.println(str);
		}
		
		
		
		
		// StringTokenizer 클래스 : java.util
		StringTokenizer strTokenizer = new StringTokenizer(strSplit, " "); // 일반 문자열 
//		while(strTokenizer.hasMoreTokens()) {
//			System.out.println(strTokenizer.nextToken());
//		}
	
		
		
		// StringBulider
		// String은 불변 객체
		String str = "abc";
		System.out.println("before :" +  str.hashCode());
		
		str += "def";
		System.out.println("agter:" + str.hashCode());
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
//		sb.append("abc");
//		System.out.println("before : " + sb.hashCode());
//		
//		sb.append("def");
//		System.out.println("after : " + sb.hashCode());
//		
//		sb.delete(4, 5);
//		System.out.println(sb);
//		
//		sb.insert(4, "e");
//		System.out.println(sb);
		
		// vlalueof(): 기본타입을 문자열로 변환 
		int i = 10;
		System.out.println(i);
//		System.out.println(i,getClass());
//		System.out.println(String.valueOf(i));
		
		// Wrapper 클래스 : 기본타입의 값을 갖는 객체(기본타입의 첫 문자를 대문자) 
		Integer intgr2 = new Integer(10);
		System.out.println(intgr2.getClass());
		
		// 언박싱
		int i2 = intgr2.intValue();
		
		// 자동 박싱 - 언박싱
		Integer intgr3 = 3;
		int i3 = intgr3; 
		
		
		// parseXXX : 문자열을 기본타입으로 변경
		System.out.println(Integer.parseInt("3"));
		System.out.println(Double.parseDouble("3"));
//		System.out.println(Double.parseDouble("three")); //  --> java.lang.NumberFormatException:
		
		
		
		// Math 클래스 
		// abs() : 절대값을 표현하는 메소드
		System.out.println(Math.abs(-6.3));

		// ceil() : 올림값, floor : 내림값, round() : 반올림값

		System.out.println(Math.ceil(2.1));
		
		// max(), min()
		System.out.println(Math.max(3, 4));
		
		// radom() : 0.0 < = Math.radom() < 1.0
	
		System.out.println((int)(Math.random()*10 + 1));
		

		
		

	
	
	}

}
