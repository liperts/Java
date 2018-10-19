package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
				
		// Please input 'Welcome to 30 Days of Code!'.
		System.out.print("Please input a message: ");
		String inputString = scan.nextLine();
		scan.close(); 
		
		System.out.println("\nNow you can see a \"Hello\" from the system and the message "
				+ "that you entered.");
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
		      
		// TODO: Write a line of code here that prints the contents of inputString to stdout.
		System.out.println(inputString);

	}

}
