package com.hackerrank.thirtydaysofcode;

public class Student extends Person 
{
	private int[] testScores;
    
    Student(String firstName, String lastName, int id, int[] testScores)
    {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    char calculate()
    {
        int sum = 0;
        int avg = 0;
        char gradingScale = ' ';
        
        for (int j = 0; j < testScores.length; j++)
        {
            sum += testScores[j];
        }
        
        avg = sum/testScores.length;
        
        if (avg >= 90 && avg <= 100) 
        {
            gradingScale = 'O';
        }
        else if (avg >= 80 && avg < 90) 
        {
            gradingScale = 'E';
        }
        else if (avg >= 70 && avg < 80) 
        {
            gradingScale = 'A';
        }
        else if (avg >= 55 && avg <= 70) 
        {
            gradingScale = 'P';
        }
        else if (avg >= 40 && avg < 55) 
        {
            gradingScale = 'D';
        }
        else if (avg >= 0 && avg < 40) 
        {
            gradingScale = 'T';
        }
        return gradingScale;
        
    }
}
