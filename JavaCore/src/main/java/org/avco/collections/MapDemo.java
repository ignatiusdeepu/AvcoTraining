package org.avco.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create a map which holds string,string.
		Map<String, String> stringMap = new HashMap<String, String>(10);
		stringMap.put("USER_NAME", "AVCO");
		stringMap.put("PASSWORD", "123");
		stringMap.put("ADDRESS", "129387892");
		stringMap.put("CITY", "WORCESTOR");
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("COUNTRY", "US");
		map2.put("FIRST_NAME", "AVCO123");
		map2.put("LAST_NAME", "CONSULTING");
		stringMap.put("CITY", "ATLANTA");
		stringMap.putAll(map2);
		
		if(stringMap.containsKey("USER_NAME")){
			System.out.println(stringMap.get("USER_NAME"));
		}
		//if we want to retrieve a particular value, lets say username:
		System.out.println(" USERNAME :"+stringMap.get("USER_NAME"));
		
		for(Map.Entry<String, String> entry : stringMap.entrySet()){
			System.out.println(" KEY : "+entry.getKey()+" Value :"+entry.getValue());
		}
		
		
	}

}
