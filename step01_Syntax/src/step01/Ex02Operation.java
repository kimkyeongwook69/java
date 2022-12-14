package step01;

public class Ex02Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex03Operation.java
//		 숫자 연산
//		 기본 연산 : +, -, *, /, %
		System.out.println("===기본연산===");
		int v1 = 10;
		int v2 = 3;
		
//		System.out.println(v1 + v2);
//		System.out.println(v1 - v2);
//		System.out.println(v1 * v2);
//		System.out.println(v1 / v2);
//		System.out.println(v1 % v2);
		
		// 증감 연산 : ++, --
//		System.out.println("===증감연산===");
//		System.out.println(v1);
//		System.out.println(v1++);
//		System.out.println(v1);
//		System.out.println(++v1);
//		System.out.println(v1);
		
		System.out.println(v1 / v2);
		// 타입 변환 --> Wrapper Class 
		System.out.println((double)v1 / (long)v2);
		
//		 3.33.... 으로 출력?

		// NaN
		System.out.println(v1 / 0.0 );
		// v1 / 0 : java.lang.ArithemeticException: / by zerp
		// v1 / 0.0 : Infinity
		// v1 % 0.0 : NaN
//		// 논리 연산 : &&, ||, ^, !
		System.out.println("===논리연산===");
		boolean t = true;
		boolean f = false;
		
		// && : 모든 연산자가 true라면 결과도 true
		System.out.println(t & t);
		System.out.println(f & f);
		System.out.println(t & f);
		System.out.println(f && t);
		
		// || : 연산자중 하나만 true라도 결과는 true
		System.out.println(t || t);
		System.out.println(f || f);
		System.out.println(t || f);
		System.out.println(f || t);
		
		// ^ : 연산자 하나는 true, 다른 하나는 false일때 결과는 true
		System.out.println(t ^ t);
		System.out.println(f ^ f);
		System.out.println(t ^ f);
		System.out.println(f ^ t);
		
		// ! : 논리값을 변경 (t -> f, f -> t)
		System.out.println(f);
		System.out.println(!f);
		
		// 비교연산 : <, >, <=, >=, ==, !=
		System.out.println("===비교연산===");
		int num1 = 1;
		int num2 = 10;
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
	
		double num3 = 1.0;
		System.out.println(num1 == num3);
		
		// 대입연산 : =, +=, -=, ...
		System.out.println("===대입연산===");
		int assign = 0;
		System.out.println(assign);
		assign += 10;
		System.out.println(assign);
		assign -= 5;
		System.out.println(assign);
		assign *= 5;
		System.out.println(assign);
		
		
		// 문자 != 문자열("")
		// 문자열 (String) 연산
		String  str1 = "문자열 연산";
		String  str2= "문자열 연산";
		String  str3= new String("문자열 연산");
		
		// 문자열의 덧셈
		System.out.println(str1 + ""+ str2 +"" + str3);
				
		// 문자열 비교
		// == 
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		//equals : 객체 데이터값
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //true
		
		// 삼항연산
		
		double meatGrade = 66.1;
		System.out.println(meatGrade > 67.5 ? "A등급" : "그  외 등급");
		
		
		
		// 비트연산 
		// << , >>, >>> 
		// a << b : 정수 a를 b 비트 수만큼 자리 이동 후 빈 곳은 0 채워진 숫자 연산
		// 16
		
		System.out.println(2 << 3);
		// 0
		System.out.println(2 >> 3);
		
		// |,  &, ^, ~
		// & : 2
		// 두비트 모두 1일 경우에 결과는 1 --> 2
		System.out.println(2 & 18);
		// | : 18 두 비트 중 하나만 1일 경우에 결과는 1 --> 18
		System.out.println(2 & 18);
		// ^ : 하나는 1이고 다흔 하나는 0일때 1--> 16
		System.out.println(2 ^ 18);
		
		// ~ 
		// https://6kkki.tistory.com/8
		System.out.println(~25); //-26
		
		
		
	}
}


