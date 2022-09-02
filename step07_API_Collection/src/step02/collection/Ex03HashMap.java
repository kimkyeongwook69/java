package step02.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

	public class Ex03HashMap {
	public static void main(String[] args) {
		// K
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		
		// put() : 추가
		hm1.put("a",1);
		hm1.put("b",2);
		hm1.put("c",3);
		hm1.put("d",4);
		
	//	System.out.println(hm1);
		
		// get(key) : key -> value
	//	System.out.println(hm1.get("a"));
		
		// remove(key) : key -> key : value
	//	System.out.println(hm1.remove("b"));
	//	System.out.println(hm1.get("b")); // 없는 데이터는 null 출력
		
		// 
	//	HashMap<String, Student> hm2 = new HashMap<String, Student>();
	//	hm2.put("k1", new Student("IT", 10001, "junior"));
		
		// hm2 -> junior 출력하기
	//	System.out.println(hm2.get("k1").getGrade());
		
		// HashMap
		// HashMap<String, ArrayList>
		ArrayList<String> arr3 = new ArrayList<>();
		arr3.add("a");
		arr3.add("b");
		arr3.add("c");
		arr3.add("d");		 
		
		HashMap<String, ArrayList<String>> hm3 = new HashMap<>();
		
		hm3.put("arr3", arr3);
		
	//	System.out.println(hm3);
		
	//	System.out.println();
		
		// b값을 출력?
		
	//	System.out.println((hm3.get("arr3")).get(1));
		
		// HashMap<String, HashMap>
		HashMap<String, HashMap<String, ArrayList<String>>> hm4 = new HashMap<>();
		hm4.put("hm3", hm3);
		
	//	System.out.println(((ArrayList)hm4.get("hm3").get("arr3")).get(1));
	//	System.out.println(hm4.get("hm3").get("arr3").get(1));
		
		// key -> value
		// hm1 -> keySet() : 해당 객체가 갖고 있는 key만을 출력
	//	System.out.println(hm1);
	//	System.out.println(hm1.keySet());
		
		// hm1 -> values() : 해당 객체가 갖고 있는 value만을 출력
	//	System.out.println(hm1.values());
		
		Set<String> keySet = hm1.keySet();
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			
			//key만 출력되고 잇는 상황 -> key : value 한쌍의 값이 출력되려면?
		String key = iter.next();
		System.out.println("key값은" + key + hm1.get(key));
					
			}
		
		}
	}
