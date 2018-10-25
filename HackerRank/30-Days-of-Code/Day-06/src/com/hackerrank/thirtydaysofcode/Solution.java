package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Solution 
{
	
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String S;
        for (int i = 0; i < T; i++)
        {
            S = scan.next();
            char[] myCharArray = S.toCharArray();
            
            for (int j = 0; j < S.length(); j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print(myCharArray[j]);
                }
            }
            System.out.print(" ");
            
            for (int j = 0; j < S.length(); j++) 
            {
                if (j % 2 == 1) 
                {
                    System.out.print(myCharArray[j]);
                }
            }
            System.out.println();
        }
        scan.close();
    }
}