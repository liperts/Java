package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondeString;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.print("Please input the second integer: ");
        secondInt = Integer.parseInt(scan.nextLine());
        System.out.print("Please input the second double: ");
        secondDouble = Double.parseDouble(scan.nextLine());
        System.out.print("Please input the second string: ");
        secondeString = scan.nextLine();
        
        // Printing a empty line just to be more readable.
        System.out.println();
        /* Print the sum of both integer variables on a new line. */
        System.out.println("The sum of the integers is: " + (i + secondInt));

        /* Print the sum of the double variables on a new line. */
        System.out.println("The sum of the doubles is: " + (d + secondDouble));
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println("The concatenate of the strings is: " + s + secondeString);
        
        scan.close();

	}

}
