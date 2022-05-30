package com.Masai;

public class LastQ {

	static Person generatePerson(Person person) {
		
	    System.out.println(person);
		return person;
		
	}
	public static void main(String[] args) {
	
		
		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Teacher());
		System.out.println(newStudent);
		System.out.println(newTeacher);
	}

}
