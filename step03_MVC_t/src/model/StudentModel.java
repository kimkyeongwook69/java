package model;

import model.domain.Student;

public class StudentModel {
	
	// DB 역할
	private static Student[] allData = new Student[5];
	private static int index;
	
	
	// 가상의 데이터 저장
	static {
		allData[0] = new Student("Java", 26);
		allData[1] = new Student("Python", 30);
		allData[2] = new Student("C++", 38);
		index = 5;
	}
	
	// 모든 학생 검색
	public static Student[] getAll() {
		return allData;
	}
	
	// 한 학생의 정보만 검색
	public static Student getOne(String name) {
		//? name변수를 가지고 allData 배열 객체의 정보값과 같은 이름을 가진 학생 객체만 return 로직 작성 !!
		// 1. 모든 데이터 가져와서 
		// 2. 하나하나 데이터를 접근하고 
		// 3. 접근한 이름 데이터와 파라미터로 넘겨진 name이 같은지를 비교해서
		// 4. 같다면???!!! return 해당 학생 객체를 넘겨줘야함!! 
		for(int i=0; i < allData.length; i++) {
			if(allData[i] != null && allData[i].getName().equals(name)) {
				return allData[i];
			}
		}
		return null;
	} 
	
	
	
	// 저장 메소드
	/* Student 객체가 배열에 저장
	 * 개발
	 * 	- 고려사항 1 : 매개변수 값으로 name, age -> Student 객체 생성 -> 배열에 저장
	 * 	- 고려사항 2 : 매개변수 값으로 Student 객체 -> 배열에 저장
	 */
	public static boolean insert(Student student) {
		// 전달 되어진 Student 객체를 allData 배열에 저장 
		
		if(index < 5) {
			allData[index] = student; // -> return true;
			index++;
			return true;
			
			
			
		}
		return false;
	}
		
	// 삭제 메소드
	/* 개발
	 * 	- 고려사항 1 : 미존재 데이터 삭제?
	 * 	- 고려사항 2 : 존재 데이터 삭제?
	 * 	- 삭제의 의미 : 배열의 값 삭제(해당 인덱스의 객체를 null로 변경 )
	 * 	- 만약
	 * 		1. 마지막 index 데이터 삭제
	 * 		2. 중간 index 데이터 삭제
	 * 			- 모든 사람 정보 검색 데이터 출력에 문제
	 * 			- 고려사항
	 * 				1. 실행시 존재 하지 않는 객체 출력 에러 발생 가능
	 * 				2. 검증 필수
	 * 
	 * 	- 이름으로 삭제 
	 * 		1. 반복문을 통해서 이름값과 매개변수값을 비교
	 */
	
	public static boolean delete(String name) {
		
		for(int i=0; i < allData.length; i++) {
			if(allData[i] != null && allData[i].getName().equals(name)) {
				allData[i] = null;	
				return true;
			}
		}
	return false;
	} 
		
	// 수정 : 이름으로 검색 -> 학생의 이름이 있다면 -> 한살 추가 // updateAge
	public static Student updateAge(String name) {
		Student student = null;
		for (int i = 0; i < allData.length; i++) {
			student = allData[i];
			if(student != null && student.getName().equals(name)) {
				student.setAge(student.getAge()+1);
				return student;
			}
		}
		return new Student("java", 26);
	}
}
