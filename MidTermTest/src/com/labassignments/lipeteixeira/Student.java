package com.labassignments.lipeteixeira;

public abstract class Student 
{
	// instance variables
	protected int studentId;
	protected String name;
	protected String address;
	
	// default constructor
	public Student() 
	{
		
	}
	
	// constructor using all instance variables
	public Student(int studentId, String name, String address) 
	{
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}
	
	// abstract methods - gets
	abstract public int getStudentId();
	abstract public String getName();
	abstract public String getAddress();
	
	// override toString()
	@Override
	public String toString() 
	{
		return "\nStudent ID: " + studentId + "\nName: " + name 
				+ "\nAddress: " + address;
	}
}
