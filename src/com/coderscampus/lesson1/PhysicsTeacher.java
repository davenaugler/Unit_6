package com.coderscampus.lesson1;

// inheritance from Teacher class using 'extends'
public class PhysicsTeacher extends Teacher {
	
	// constructor
	public PhysicsTeacher () {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevelOfEducation("Masters of Science");
	}
	
	public void teach () {
		System.out.println("I'm a physics teacher and I'm now teaching physics");
	}
	
	public void teach (String teacherName) {
		System.out.println("Hello. My name is " + teacherName + ", I'm a physics teacher and I teach physics");
	}
}