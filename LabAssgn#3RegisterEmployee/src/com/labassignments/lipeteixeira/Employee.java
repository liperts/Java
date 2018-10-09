package com.labassignments.lipeteixeira;

import java.text.NumberFormat;
import java.util.Locale;

// Employee as base class
public class Employee
{
	// instance variables 
	private String name;
	private double salary;
	
	// constructor using two instance variables
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	// properties - gets and sets
    public String getName() { return this.name; }
    
    public void setName(String name) { this.name = name; }
    
    public double getSalary() { return this.salary; }
    
    public void setSalary(String salary) { this.name = salary; }
    
    // Enhancement: exception handling -> salary should be greater than 0
    public String getSalaryAsString()
	{
	    try
	    {
		    if (salary <= 0)
		    {
		        // this gets caught in the catch block
		        throw new IllegalArgumentException("\nSalary should be positive (greater than 0)!"); 
		    }
	    }
	    catch (IllegalArgumentException e)
	    {
	       System.out.println(e.getMessage());
	    }
	    
	    // Enhancement: currency format for salary
	    return NumberFormat.getCurrencyInstance(new Locale("en", "CA")).format(salary);
    }
   
    // override toString()
    @Override
    public String toString() { return "\nName: " + name + "\nSalary: " + getSalaryAsString(); }
}
