package com.Masai;

import java.util.Scanner;

public class Ola {
	
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger>3)
		{
			
			return new Sedan();
		}
		else
		{
			return new HatchBack();
		}
		
		public int calculateBill(Car car) {
			int total= car.getNumberOfKms()*car.farePerKm;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numberOfKms");
		int km=sc.nextInt();
		System.out.println("Enter numberOfPassenger");
		int pass=sc.nextInt();
		
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(pass, km);
		System.out.println((myCar));
//		int res = myOla.calculateBill(myCar);
	}

}
