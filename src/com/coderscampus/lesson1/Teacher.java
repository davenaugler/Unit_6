package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levelOfEducation;
	protected int totalNumberOfGradedPapers;
	
	// protected method (first time using 'protected')
	protected void gradePapers () {
		System.out.println("I'm a teacher and I'm now grading papers");
	}
	
	private void giveARaise () {
		System.out.println("Teacher get's a raise!");
	}

	public void teach() {
		this.giveARaise();
		System.out.println("I'm a teacher and I'm now teaching");
	}

//	public void teach(String teacherName) {
//		System.out.println("Hello. My name is " + teacherName + ", I'm a teacher that teaches students");
//	}

	public void teach(String teacherName, int numStudents) {
		System.out.println(
				"Hello. My name is " + teacherName + ". I'm a teacher that teaches " + numStudents + " students");
	}

	public void teach(String teacherName, String schoolName, int numStudents) {
		System.out.println("Hello. My name is " + teacherName + " and I teach at " + schoolName
				+ ". I'm a teacher that teaches " + numStudents + " students");
	}

	// constructor
	public Teacher() {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
		this.giveARaise();
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
