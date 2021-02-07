package com.med.servletdemo.mvc2;

import java.util.*;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		//create empty list
		List<Student> students = new ArrayList<>();
		
		//add sample data
		students.add(new Student("Mary", "Public", "mary@email.com"));
		students.add(new Student("Mat", "Rublic", "mat@email.com"));
		students.add(new Student("Mike", "Vublic", "mike@email.com"));

		//return the list
		return students;
	}
}
