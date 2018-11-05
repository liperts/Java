package com.labassignments.lipeteixeira;

import java.text.DecimalFormat;

public class CentStudent extends Student
{
	// instance variables
	protected String dept;
	protected double tuitionFee;
	
	DecimalFormat decimalFormat = new DecimalFormat("0.00");

	// default constructor
	public CentStudent() 
	{
		
	}
	
	// constructor using all instance variables (3 of them were inherited + 2 new)
	public CentStudent(int studentId, String name, String address, String dept, 
			double tuitionFee) 
	{
		super(studentId, name, address);
		this.dept = dept;
		this.tuitionFee = tuitionFee;
	}
	
	// properties - getters and setters
	// override gets from the abstract class
	@Override
	public int getStudentId() 
	{
		return this.studentId;
	}

	@Override
	public String getName() 
	{
		return this.name;
	}

	@Override
	public String getAddress() 
	{
		return this.address;
	}
	
	// getters from this level
	public String getDept() 
	{ 
		return this.dept; 
	}
	
	public double getTuition() 
	{ 
    	return this.tuitionFee;
    }
	
	// setters
	public void setStudentId(int studentId) 
	{ 
    	this.studentId = studentId; 
    }
	
	public void setName(String name) 
	{ 
    	this.name = name; 
    }
	
	public void setAddress(String address) 
	{ 
    	this.address = address; 
    }
	
	public void setDept(String dept) 
	{ 
    	this.dept = dept; 
    }
	
	public void setTuitionFee(double tuitionFee) 
	{ 
    	this.tuitionFee = tuitionFee; 
    }
	
	// override toString()
    @Override
	public String toString() 
    {
		return "\tStudent ID: " + studentId + "\n\tName: " + name + "\n\tAddress: " + address 
				+ "\n\tDepartment: " + dept + "\n\tTuition paid: " + decimalFormat.format(tuitionFee);
	}

}
