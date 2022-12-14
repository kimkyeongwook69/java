/* 변수
 * 1. 명명
 * 		- 시작은 문자, $, _
 * 		- 대소문자 구분 (camelCase)
 * 		- 첫번째 문자는 소문자 시작
 * 		- 개발시 의미있는 이름으로 지정
 * 		- 단어가 이어지는 경우 대문자로 구분
 * 		- 자바 예약어는 주의
 * 		- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
 */

package step01;

public class Ex01Variable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타입 변수명 = 값;
		// Java Data types
		
		// 정수 : byte
		byte  vb1 = -128;
		byte  vb2 = 127;
		
		
		// short 
		short vs1 = 128;
		
		// *int
		int vi1 = 1008;
		
		long vl1 = 1008;
		long vl2 = 10000000000L;
		
		// 실수 : float
		float vf1 = 3.14f;
		
		//double 
		double vd1= 3.14;
		
		// chat : ''
		char vc1 = 'A';
		System.out.println(vc1);
		
		char vc2 = 66;
		System.out.println(vc2);
		
		char vc3 = '\u0041';
		System.out.println(vc3);
		
		// 논리: boolean
		boolean isTrue = true;
		boolean isFalse = false;		
		
//		vb1 = 127;
//		System.out.println(vb1);
		
	}

}
