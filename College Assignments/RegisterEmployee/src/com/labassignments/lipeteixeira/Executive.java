package com.labassignments.lipeteixeira;

import java.text.NumberFormat;
import java.util.Locale;

// Executive is an inherited class from Manager
public class Executive extends Manager
{
	// instance variables
	private double yearlyBonus;
	
	// constructor with no instance variables
	public Executive()
	{
		
	}
	
	// constructor using four instance variables
	public Executive(String name, double salary, String dept, double yearlyBonus)
	{
		super(name, salary, dept);
		this.yearlyBonus = yearlyBonus;
	}
	
	// properties - gets and sets
    public double getYearlyBonus() { return this.yearlyBonus; }
    
    public void setYearlyBonus(double yearlyBonus) { this.yearlyBonus = yearlyBonus; }
    
    // Enhancement: exception handling -> yearlyBonus should be greater than 0
    public String getYearlyBonusAsString()
    {
	    try
	    {
		    if (yearlyBonus <= 0)
		    {
		        // this gets caught in the catch block
		        throw new IllegalArgumentException("\nYearly Bonus should be positive (greater than 0)!"); 
		    }
	    }
	    catch (IllegalArgumentException e)
	    {
	       System.out.println(e.getMessage());
	    }
	    
	    // Enhancement: currency format for yearlyBonus
	    return NumberFormat.getCurrencyInstance(new Locale("en", "CA")).format(yearlyBonus);
    }
    
    // override toString()
    @Override
    public String toString()
    {
    	return "\nName: " + super.getName() + "\nSalary: " + super.getSalaryAsString() + 
    			"\nDepartment: " + super.getDept() + "\nYearly Bonus: " + getYearlyBonusAsString();
    }
}
