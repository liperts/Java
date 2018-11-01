package com.labassignments.lipeteixeira;

import java.util.Scanner;

// EmployeeTest as a driver class
public class EmployeeTest
{
	public static void main(String[] args)
	{		
		Employee firstEmployee = new Employee("Bruno Silva", 75000);
		Employee secondEmployee = new Employee("Renata Teixeira", 80000);
		Employee thirdEmployee = new Employee("Jorge Silva", -85000);
		Employee fourthEmployee = new Employee("Wilza Teixeira", 90000);
		Manager firstManager = new Manager("Lipe Silva", 110000, "DevOps");
		Manager secondManager = new Manager("Vanessa Teixeira", 120000, "Big Data");
		Executive executivePresident = new Executive("Peu Teixeira", 150000, "CEO", -50000);
		
		System.out.println("\nWelcome to HR System");
		System.out.println("This is the employees' list:");
		System.out.println(firstEmployee);
		System.out.println(secondEmployee);
		System.out.println(thirdEmployee);
		System.out.println(fourthEmployee);
		System.out.println(firstManager);
		System.out.println(secondManager);
		System.out.println(executivePresident);
		System.out.println();
		
		Scanner readInput = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.print("Do you wanna add a employee (\"y\" or \"n\")? ");
		String wannaAddEmployee = readInput.nextLine();
		
		while (wannaAddEmployee != "n")
		{
			System.out.print("Which role this person has (1 - Employee; "
					+ "2 - Manager; 3 - Executive; 0 - Exit)? ");
			int whichRole = Integer.parseInt(readInput.nextLine());
			
			if(whichRole == 1)
			{
				System.out.println();
				Employee newEmployee = new Employee();
				System.out.print("Please input the name of the new Employee: ");
				newEmployee.setName(readInput.nextLine());
				System.out.print("Please input the salary of the new Employee: ");
				newEmployee.setSalary(Double.parseDouble(readInput.nextLine()));
				
				System.out.println();
				System.out.println("You can see below the last Employee that you added:");
				System.out.println(newEmployee);
				System.out.println();
			}
			
			else if (whichRole == 2)
			{
				Manager newManager = new Manager();
				System.out.print("Please input the name of the new Manager: ");
				newManager.setName(readInput.nextLine());
				System.out.print("Please input the salary of the new Manager: ");
				newManager.setSalary(Double.parseDouble(readInput.nextLine()));
				System.out.print("Please input the department of the new Manager: ");
				newManager.setDept(readInput.nextLine());
				
				System.out.println();
				System.out.println("You can see below the last Manager that you added:");
				System.out.println(newManager);
				System.out.println();
			}
			
			else if (whichRole == 3)
			{
				Executive newExecutive = new Executive();
				System.out.print("Please input the name of the new Executive: ");
				newExecutive.setName(readInput.nextLine());
				System.out.print("Please input the salary of the new Executive: ");
				newExecutive.setSalary(Double.parseDouble(readInput.nextLine()));
				System.out.print("Please input the department of the new Executive: ");
				newExecutive.setDept(readInput.nextLine());
				System.out.print("Please input the yearly bonus of the new Executive: ");
				newExecutive.setYearlyBonus(Double.parseDouble(readInput.nextLine()));
				
				System.out.println();
				System.out.println("You can see below the last Executive that you added:");
				System.out.println(newExecutive);
				System.out.println();
			}
			
			else
			{
				System.out.println("Thank you for use our system. Have a good one!");
				break;
			}
			
			System.out.println("Do you wanna add a employee (\"y\" or \"n\")? ");
			wannaAddEmployee = readInput.nextLine();
		}
		
		if(wannaAddEmployee == "n")
		{
			System.out.println("Thank you for use our system. Have a good one!");
		}
		
		readInput.close();
	}
}
