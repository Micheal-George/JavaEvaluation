package com.Masai;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		float sum = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of students : ");
		int num=sc.nextInt();
		Student[] student=new Student[num];
		for(int i=0;i<num;i++)
			
		{
			student[i]=new Student();
			System.out.println("Enter Details of Student "+(int)(i+1));
			System.out.println("Enter Roll no  : ");
		int roll=sc.nextInt();
			student[i].setRoll(roll);
			
			System.out.println("Enter Name: ");
			String name=sc.next();
				student[i].setName(name);
				sc.nextLine();
				System.out.println("Enter Address : ");
				String address=sc.nextLine();
					student[i].setAddress(address);
					System.out.println("Enter mark  : ");
					int mark=sc.nextInt();
						student[i].setMarks(mark);
						
                      sum=sum+student[i].getMarks();
	}
		for(int i=0;i<num;i++)
		{System.out.println(" Details of Student "+(int)(i+1));
			student[i].displayDetails();
		}
   System.out.println("Average marks of "+num+" students "+sum/num);;

}
}
