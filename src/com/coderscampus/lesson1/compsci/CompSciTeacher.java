package com.coderscampus.lesson1.compsci;

import com.coderscampus.lesson1.Teacher;

//inheritance from Teacher class using 'extends'
public class CompSciTeacher extends Teacher {
	
	// constructor 
	public CompSciTeacher () {
		System.out.println("Inside the CompSciTeacher constructor");
		this.setClasses("COMP 101, COMP 201");
		this.setLevelOfEducation("Bachelor of Science");
	}
	
}
