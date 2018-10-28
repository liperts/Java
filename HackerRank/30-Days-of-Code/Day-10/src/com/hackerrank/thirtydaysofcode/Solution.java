package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Solution 
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int remainder = 0;
        int count = 0;
        int consecutiveOnes = 0;
        
        while(n > 0) 
        {
            remainder = n % 2;
            n = n/2;
            if (remainder == 1) 
            {
                count++;
                if (count > consecutiveOnes)
                {
                    consecutiveOnes = count;
                }
            }
            else 
            {
                count = 0;
            }
        }
        
        System.out.println(consecutiveOnes);
        
        scanner.close();
    }
}
