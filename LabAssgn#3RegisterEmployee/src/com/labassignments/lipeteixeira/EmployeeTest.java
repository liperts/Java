package com.labassignments.lipeteixeira;

// EmployeeTest is a driver class
public class EmployeeTest
{
	public static void main(String[] args)
	{		
		Employee firstEmployee = new Employee("Bruno Silva", 75000);
		System.out.println(firstEmployee);
		Employee secondEmployee = new Employee("Renata Teixeira", 80000);
		System.out.println(secondEmployee);
		Employee thirdEmployee = new Employee("Jorge Silva", 85000);
		System.out.println(thirdEmployee);
		Employee fourthEmployee = new Employee("Wilza Teixeira", 90000);
		System.out.println(fourthEmployee);
		
		Manager firstManager = new Manager("Lipe Silva", 110000, "DevOps");
		System.out.println(firstManager);
		Manager secondManager = new Manager("Vanessa Teixeira", 120000, "Big Data");
		System.out.println(secondManager);
		
		Executive executivePresident = new Executive("Peu Teixeira", 150000, "CEO", 50000);
		System.out.println(executivePresident);
	}
}
