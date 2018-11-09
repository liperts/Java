package com.labassignments.lipeteixeira;

public class Multiplication implements Runnable
{
	// instance variables
	private int mulNum1;
	private int mulNum2;
	
	// default constructor
	public Multiplication() 
	{
		
	}
	
	// constructor
	public Multiplication(int mulNum1, int mulNum2)
	{
		this.mulNum1 = mulNum1;
		this.mulNum2 = mulNum2;
	}

	// override the run() to tell the system what task to perform
	@Override
	public void run() 
	{
		System.out.println("\tThe result of the multiplication operation on " 
			+ mulNum1 + " and " + mulNum2 + " is " + (mulNum1 * mulNum2) + ".");		
	}
	
}
