package step02.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02HashSet {

	public static void main(String[] args) {
		// HashSet
		HashSet<String> set = new HashSet<String>();
		
		// add()
		set.add("Java");
		set.add("IT");
		set.add("Dev");
		set.add("Lazy");
		set.add("Happy");
		set.add("Dev");
		
		
		System.out.println(set);
		
		// for 이용한 출력
		for( String str : set) {
			System.out.println(str);
		}
		
		System.out.println();
		//iterator : 반복 가능한 객체에 적용 할 수 있는 기능
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}


		
		System.out.println(set.isEmpty()); // 데이터 있는지 없는지 확인 가능 !!
		set.remove("Lazy");
		System.out.println(set.contains("Lazy")); // 데이터 잇는지 없는지 확인가능 
		
	}

}
