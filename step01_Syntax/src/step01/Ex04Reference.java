package step01;

import java.util.Arrays;

public class Ex04Reference {

	public static void main(String[] args) {
		// 문자열 String 
		String str1 = "Java";
		// toString() : 현재 객체가 가지고 있는 정보 출력
		System.out.println(str1.toString());
//		
//		str1 = null; 
//		System.out.println(str1.toString());
		//java.lang.NullPointerException  --> NPE'
		
		// 배열 Array : 데이터를 한개의 변수로 관리
		/* - 구조 : 타입[]
		 * - 특징 : 길이(배열 객체에 저장되어있는 데이터 개수)가 고정
		 * - 초기화 할때, 선언된 배열의 변수 -> new 연산자 사용 
		 * - 종류 : 1차원, 다차원 배열
		 */
		
		int[] arr1 = {1, 2, 3};
		String[] arr2 = {"1","2", "3"};
		
		int[] arr3; 
//		arr3 = {4, 5, 6}; // 에러 : 선언과 동시에 할당이 이루여 져야함
		arr3 = new int[] {4, 5, 6};		
		
//		int[] arr4 = new int[]; 에러(빈 배열을 만들때) : 초기에 배열의 길이가 정해져 있기 않기 떄문
		int[] arr4 = new int[3]; // []
	
		// 배열 접근 : index
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]); // 에러 : java.lang.ArrayIndexOutOfBoundsException: 3
//		
		System.out.println(arr1[2]);

		// 배열 길이 : length 
		System.out.println(arr1.length);
		System.out.println(arr4.length);
		
		
		
		// 배열 출력
		// 예상 결과값 [1, 2, 3] => 실제 출력값 [I@15db9742]
		System.out.println(arr1); // 배열 주소 값
		
		// 반복문으로 출력
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
	
		
	
		// 향상된 for문으로 출력 
		for(int i : arr1) {
			System.out.println(i);
		}
		
		// 복사
		// 얕은 복사
		int[] arr5 = {1, 2, 3};
		int[] arr5Copy = arr5; //주소값 전달됨
		arr5Copy[0] = 10;
		System.out.println(arr5[0]); // 1이 아니라 10이 출력된다! ( 얇은 복사의 문제점 )
		
		// 깊은 복사
		int[] arr6 = { 1, 2, 3};
		int[] arr6Copy = new int[arr6.length];
		for(int i =  0; i< arr6Copy.length; i++) {
			System.out.println(i);
			arr6Copy[i] = arr6[i];
		}
		
		for(int i : arr6Copy) {
			System.out.println(i);
		}
		
		
		
		arr6Copy[0] = 10;
		System.out.println(arr6[0]); // 예상 == 결과1 : 깊은 복사이므로 변경x
		
		int[] arr6Copy2 = arr6.clone();
		Arrays.copyOf(arr6, arr6.length);

	
		//int arr6Copy ??? hint: 반복문 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
