package com.hackerrank.thirtydaysofcode;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MathOperators
{

    static void totalMealCost(double meal_cost, int tip_percent, int tax_percent)
    {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double totalCost = (meal_cost + tip + tax);
        System.out.println("\nThe total meal cost is: " + 
        	NumberFormat.getCurrencyInstance(new Locale("en", "CA"))
        	.format(Math.round(totalCost)));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
    	System.out.print("Please input the meal cost: ");
        double meal_cost = scanner.nextDouble();
        System.out.print("Please input the tip percent: ");
        int tip_percent = scanner.nextInt();
        System.out.print("Please input the tax percent: ");
        int tax_percent = scanner.nextInt();

        totalMealCost(meal_cost, tip_percent, tax_percent);
        
        scanner.close();

	}

}
