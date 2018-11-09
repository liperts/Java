package com.labassignments.lipeteixeira;

public class Division implements Runnable
{
	// instance variables
	private int divNum1;
	private int divNum2;
	
	// default constructor
	public Division() 
	{
		
	}
	
	// constructor
	public Division(int divNum1, int divNum2)
	{
		this.divNum1 = divNum1;
		this.divNum2 = divNum2;
	}

	// override the run() to tell the system what task to perform
	@Override
	public void run() 
	{
		System.out.println("\tThe result of the division operation on " 
			+ divNum1 + " and " + divNum2 + " is " + (divNum1 / divNum2) + ".");		
	}
	
}
