package com.labassignments.lipeteixeira;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution 
{

	public static void main(String[] args) 
	{
		String tryAgain;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Centennial College Multithreaded Calculator");
		
		do 
		{
			System.out.print("Please enter the first integer: ");
			int firstInt = Integer.parseInt(input.nextLine());
			System.out.print("Please enter the second integer: ");
			int secondInt = Integer.parseInt(input.nextLine());
			
			// create each task (runnable)
			Addition add = new Addition(firstInt, secondInt);
			Subtraction sub = new Subtraction(firstInt, secondInt);
			Multiplication mul = new Multiplication(firstInt, secondInt);
			Division div = new Division(firstInt, secondInt);
			
			// create threads and register tasks to threads
			Thread addTask = new Thread(add);
			Thread subTask = new Thread(sub);
			Thread mulTask = new Thread(mul);
			Thread divTask = new Thread(div);
			
			// create ExecutorService to manage threads
			ExecutorService executorService = Executors.newCachedThreadPool();
			
			// start the four tasks (Thread Pool Version)
			executorService.execute(addTask); // same as 'addTask.start();' (Classic Version)
			executorService.execute(subTask); // same as 'subTask.start();' (Classic Version)
			executorService.execute(mulTask); // same as 'mulTask.start();' (Classic Version)
			executorService.execute(divTask); // same as 'divTask.start();' (Classic Version)
			
			// shut down ExecutorService--it decides when to shut down threads
			executorService.shutdown();
			
			// wait until all tasks are finished...
			while(!executorService.isTerminated())
			{
				
			}
			
			// ... then we can ask whether the user wanna try again or not
			System.out.print("\nDo you wanna try again (y/n)? ");
			// using toUpperCase() to change the string typed by the user to upper case
			tryAgain = input.nextLine().toUpperCase();
		// if the first character was 'Y' (y, Y, yes, Yes) the user will try again
		} while(tryAgain.charAt(0) == 'Y');

		System.out.println("\tBye. Have a good day.");
		
		input.close();
	}

}
