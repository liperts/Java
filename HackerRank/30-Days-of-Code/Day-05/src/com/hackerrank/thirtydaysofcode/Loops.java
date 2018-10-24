package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Loops 
{
	public static void main(String[] args)
	{
		Scanner readInput = new Scanner(System.in);
		System.out.print("Please input a number (2 >= number <= 20): ");
		int number = (Integer.parseInt(readInput.nextLine()));
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		System.out.println();
		readInput.close();
	}
}
