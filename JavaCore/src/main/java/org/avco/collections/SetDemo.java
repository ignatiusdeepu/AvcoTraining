package org.avco.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	// int a[] = new int[10];

	public static void main(String a[]){
		//to create set of Integers and display the values:
		
		Set<Integer> integerSet = new HashSet<Integer>(2);
		integerSet.add(1);
		integerSet.add(new Integer(10));
		integerSet.add(new Integer(20));
		integerSet.add(new Integer(10));
		integerSet.add(new Integer(30));
		
		//Integer l = (Integer)integerSet.get(0);
		for(Integer elem :integerSet ){ //for(Classthesetcontains ref:setName)
			System.out.println("Element Value :"+elem.intValue());
		}
		
		Iterator<Integer> iterator = integerSet.iterator();
		while(iterator.hasNext()){
			System.out.println("Element Value :"+iterator.next().intValue());
		}
		
		/*for(int i=0;i<integerSet.size();i++){
			integerSet.get(i)
		}*/
	}
}
