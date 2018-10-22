package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int number = scanner.nextInt();
        
        if ((number % 2) != 0 || ((number % 2) == 0 && number >= 6 && number <= 20)) {
            System.out.println("The number " + number + " is Weird");
        } else if ((number % 2) == 0 && number >= 2 && number <= 5) {
            System.out.println("The number " + number + " is Not Weird");
        } else {
            System.out.println("The number " + number + " is Not Weird");
        }
        scanner.close();
	}
}
