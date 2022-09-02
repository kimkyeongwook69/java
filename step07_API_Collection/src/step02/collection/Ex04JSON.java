package step02.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

import model.domain.Student;

public class Ex04JSON {

	public static void main(String[] args) {
		// JSON
		// JSONObject
		JSONObject json = new JSONObject();
		json.put("name", "IT");
		json.put("lecture","WEB");
		
		
		
				
		System.out.println(json);
		
		//HashMap 으로 JSONObject 생성하기
		Map<String, String> jsonMap = new HashMap();
		json.put("name", "IT");
		json.put("lecture","WEB");
		
		JSONObject json2 = new JSONObject(jsonMap);
		System.out.println(json2);
		
		// 문자열로 된 정보를"{"key": JSONOBject로 생성 
		
		String jsonStr = "{\"name\":\"IT\",\"lecture\":\"WEB\"}";
		
		JSONObject json3 = new JSONObject(jsonStr);
		
		System.out.println(json3);
		
		// ㅋ////////////////////////////////////////////////////////
		// keys()
		Iterator iter = json3.keys();
		while(iter.hasNext()) {
			String key = (String)iter.next();
//			System.out.println(key + "" + json3.get(key));
			System.out.println(key + "" + json3.getString(key));
		}
		Student student = new Student("IT", 10001, "junior");
		JSONObject json4 = new JSONObject(student);
		System.out.println(json4);
		
		// Jackson : SpringBoot 내장 라이브러리 
		
		}

}
