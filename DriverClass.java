package com.jsp.abstraction;

public class DriverClass 
{
	public static void main(String [] args)
	{
		Car c1 = Car.getAudi();
		Car c2 = Car.getBMW();
		
		c1.start();
		c1.accelerate();
		c1.stop();
		c1.seatbelt();
		System.out.println("************************************");
		c2.start();
		c2.accelerate();
		c2.stop();
		c2.seatbelt();
	}
}
