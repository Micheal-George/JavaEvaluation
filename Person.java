package com.Masai;

public class Person {

	
	String name;
	String gender;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Address{
	
	String city;
	String state ;
	String pinCode; 
	@Override
	public String toString() {
		return "city ="+city+","+"state ="+state+","+"pinCode ="+pinCode;
	}
}


class Teacher extends Person{
	int instructorId;
		int salary ;
		@Override
		public String toString() {
		return 	"Teacher["+"instructorId ="+instructorId+" ,"+" salary ="+salary ;
		}
}

class Student extends Person{
	
 int studentId;
 String courseEnrolled;
 int courseFee;
 @Override
	public String toString() {
	return 	"studentId ="+studentId+" ,"+" courseEnrolled ="+courseEnrolled+" ,"+" courseFee ="+courseFee;
	}
}