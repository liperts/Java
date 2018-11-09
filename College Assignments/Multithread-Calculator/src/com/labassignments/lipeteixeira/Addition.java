package com.labassignments.lipeteixeira;

public class Addition implements Runnable
{
	// instance variables
	private int addNum1;
	private int addNum2;
	
	// default constructor
	public Addition() 
	{
		
	}
	
	// constructor
	public Addition(int addNum1, int addNum2)
	{
		this.addNum1 = addNum1;
		this.addNum2 = addNum2;
	}

	// override the run() to tell the system what task to perform
	@Override
	public void run() 
	{
		System.out.println("\tThe result of the addition operation on " 
			+ addNum1 + " and " + addNum2 + " is " + (addNum1 + addNum2) + ".");		
	}
	
}
