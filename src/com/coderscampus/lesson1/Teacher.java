package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levelOfEducation;

	public void teach() {
		System.out.println("I'm a teacher and I'm now teaching");
	}
	
	public void teach (String teacherName) {
		System.out.println("Hello. My name is " + teacherName + ", I'm a teacher that teaches students");
	}
	
	public void teach (String teacherName, int numStudents) {
		System.out.println("Hello. My name is " + teacherName + ". I'm a teacher that teaches " + numStudents + " students");
	}
	
	public void teach (String teacherName, String schoolName, int numStudents) {
		System.out.println("Hello. My name is " + teacherName + " and I teach at " + schoolName + ". I'm a teacher that teaches " + numStudents + " students");
	}

	// constructor
	public Teacher() {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
	}
	

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
}
