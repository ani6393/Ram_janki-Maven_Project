package com.Student.ByRam_Janki;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext A=new ClassPathXmlApplicationContext("com/Student/ByRam_Janki/Janki.xml");
		Student s=(Student)A.getBean(Student.class, "S");
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getClass());
	}

}
