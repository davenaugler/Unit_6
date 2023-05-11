package com.coderscampus.lesson1;

public class QuantumPhysicsTeacher extends PhysicsTeacher {
	
	// constructor
	public QuantumPhysicsTeacher () {
		System.out.println("Inside the QuantumPhysicsTeacher constructor");
		this.setClasses("QPHY 101, QPHY 202");
		this.setLevelOfEducation("PhD");
	}
	
	public void teach () {
		System.out.println("I'm a quantum physics teacher and I'm now teaching Quantum Physics");
	}

}
