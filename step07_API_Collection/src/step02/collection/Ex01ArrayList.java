package step02.collection;

import java.util.ArrayList;

import model.domain.Student;

public class Ex01ArrayList {

	public static void main(String[] args) {
		// ArrayList
		
		ArrayList arr1 = new ArrayList();
		//add() : 추가;
		arr1.add("java");
		arr1.add(new Student("IT", 10001, "junior"));
		arr1.add(3); // Integer의 객체 타입으로 저장되는 것과 동일(오토 박싱 수행 되었다 !!! ) 
		
		System.out.println(arr1.toString());
		
		
		// get(index) : 해당 index 객체 리턴 
		System.out.println( ((Student)arr1.get(1)).getGrade());
		System.out.println( ((String)arr1.get(0)).charAt(2));
		
		
		// size() : 객체수
		System.out.println(arr1.size());
		
		
		// remove(index) : 해당 객체 삭제 
		System.out.println(arr1);
		System.out.println(arr1.remove(0));
		System.out.println(arr1);
		
		// 제네릭 : 데이터의 타입을 정하는 기능 <Element> 
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("java");
		
//		arr2.add(new Student("IT", 10001, "junior"));
//		arr2.add(3); // Integer의 객체 타입으로 저장되는 것과 동일(오토 박싱 수행 되었다 !!! ) 
		
		System.out.println(arr2.get(0).charAt(2));
	}
	
	
	

}
