package com.labassignments.lipeteixeira;

public class Subtraction implements Runnable
{
	// instance variables
	private int subNum1;
	private int subNum2;
	
	// default constructor
	public Subtraction() 
	{
		
	}
	
	// constructor
	public Subtraction(int subNum1, int subNum2)
	{
		this.subNum1 = subNum1;
		this.subNum2 = subNum2;
	}

	// override the run() to tell the system what task to perform
	@Override
	public void run() 
	{
		System.out.println("\tThe result of the subtraction operation on " 
			+ subNum1 + " and " + subNum2 + " is " + (subNum1 - subNum2) + ".");		
	}
	
}
