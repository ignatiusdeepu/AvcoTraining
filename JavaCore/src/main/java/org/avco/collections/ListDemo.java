package org.avco.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.avco.encapsulation.Test;
import org.avco.generics.Demo;
import org.avco.vo.Employee;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Avco", "Consultin");
		Employee employee1 = new Employee("Test", "123");
		Employee employee2 = new Employee("123", "Test");
		
		//create a list which holds employee objects
		List<Employee> employeeList = new ArrayList<Employee>(2);
		employeeList.add(employee);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee1);
		
		
		//for(className ref : listName)
		//className is decided based on list definition.
		for(Employee employees: employeeList){
			employees.printName();
		}
		
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			iterator.next().printName();		
		}
		
		for(int i=0;i<employeeList.size();i++){
			employeeList.get(i).printName();
		}
		
		Integer arr[] = {1,2,3,4,5};
		List<Integer> integers = Arrays.asList(arr);
		
		for(Integer i: integers){
			System.out.println(i.intValue());
		}
		
		/*Demo<Test> demo = new Demo<Test>();
		Test test = demo.getInstance("org.avco.encapsulation.Test");
		test.printf();*/
	}
	

}
