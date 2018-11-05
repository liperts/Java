package com.labassignments.lipeteixeira;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestSil 
{

	public static void main(String[] args) 
	{
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		CentStudent[] listOfStudent = new CentStudent[2];
		
		Scanner input = new Scanner(System.in);	
		
		System.out.print("\nCentennial Student Tracking Application");
		System.out.print("\nEnter student Id (enter -1 to quit): ");
		int id = Integer.parseInt(input.nextLine());
		int i = 0;
		while(id != -1) 
		{
			CentStudent student1 = new CentStudent();
			student1.setStudentId(id);
			System.out.print("Enter name: ");
			student1.setName(input.nextLine());
			System.out.print("Enter address: ");
			student1.setAddress(input.nextLine());
			System.out.print("Enter department: ");
			student1.setDept(input.nextLine());
			System.out.print("Enter tuition Paid: ");
			student1.setTuitionFee(Double.parseDouble(input.nextLine()));
			
			System.out.println("\n\tThe Complete Student Record:");
			System.out.println(student1);
			
			listOfStudent[i] = student1;
			i++;
			
			System.out.print("\nEnter student Id (enter -1 to quit): ");
			id = Integer.parseInt(input.nextLine());
			
			if (id == -1) 
			{
				System.out.println("\n\t" + listOfStudent[0].name + "'s student Id as "
						+ "entered is: " + listOfStudent[0].studentId);
				System.out.println("\t" + listOfStudent[0].name + "'s address as "
						+ "entered is: " + listOfStudent[0].address);
				System.out.println("\t" + listOfStudent[1].name + "'s department as "
						+ "entered is: " + listOfStudent[1].dept);
				System.out.println("\t" + listOfStudent[1].name + "'s tuition fees as "
						+ "entered is: " + decimalFormat.format(listOfStudent[1].tuitionFee));
			}
			
		}
		
		System.out.print("\tBye now. Have a nice day.");
		
		input.close();
	}

}
