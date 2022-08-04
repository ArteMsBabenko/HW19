package lesson19;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File fileEmployee = new File("Employee.obj");
		Employee employee = new Employee(18, "Order name", 6000);
		System.out.println("Worker");
		System.out.println(employee);
		
		System.out.println("Our worker after serialization/deserialization:");
		Methods.serialize(employee, fileEmployee);
		System.out.println(Methods.deserealize(fileEmployee));
	
		System.out.println();
		
		File fileEmployeeList = new File ("EmployeeList.obj");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee);
		employeeList.add(new Employee(62, "Max", 11327));
		employeeList.add(new Employee(37, "Vlad", 17024));
		employeeList.add(new Employee(28, "Victoria", 15700));
		employeeList.add(new Employee(62, "Jane", 9043));
		employeeList.add(new Employee(62, "Jack", 7500));
		
		System.out.println("List of our employees:");
		for (Employee eachEmployee : employeeList) {
			System.out.println(eachEmployee);
		}
		
		System.out.println();
		
		System.out.println("List of our employees after serialization/deserialization:");
		Methods.serialize((Serializable) employeeList, fileEmployeeList);
		
		List<Employee> employeeListDeserialized = new ArrayList<Employee>();
		employeeListDeserialized = (List<Employee>) Methods.deserealize(fileEmployeeList);
		
		for (Employee eachEmployee : employeeListDeserialized) {
			System.out.println(eachEmployee);
		}
	
		
	}

}
