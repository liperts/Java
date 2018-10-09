package com.labassignments.lipeteixeira;

// Manager is an inherited class from Employee
public class Manager extends Employee
{
	// instance variables
	private String dept;
	
	// constructor using three instance variables
	public Manager(String name, double salary, String dept)
	{
		super(name, salary);
		this.dept = dept;
	}
	
	// properties - gets and sets
    public String getDept() { return this.dept; }
    public void setDept(String dept) { this.dept = dept; }
    
    // override toString()
    @Override
    public String toString()
    {
    	return "\nName: " + super.getName() + "\nSalary: " + super.getSalaryAsString() + "\nDepartment: " + dept;
    	// return "\nName: " + this.getName() + "\nSalary: " + this.getSalary() + "\nDepartment: " + dept;
    	// return "\nName: " + getName() + "\nSalary: " + getSalary() + "\nDepartment: " + dept;
    	// return super.toString() + "\nDepartment: " + dept;
    }
}
