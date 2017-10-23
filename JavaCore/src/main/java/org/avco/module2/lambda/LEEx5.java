package org.avco.module2.lambda;

import java.util.ArrayList;
import java.util.List;

public class LEEx5 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		
		strList.forEach((str) ->System.out.println(str));
	}

}
