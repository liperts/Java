package com.hackerrank.thirtydaysofcode;

public class Person 
{

	// instance variable
	int age;
	
	// constructor
	public Person(int initialAge) 
	{
		if (initialAge >= 0) 
		{
			this.age = initialAge;
		}
		else 
		{
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
	
	// method to increment age
	public void yearPasses() 
	{
		this.age++;
	}
	
	// method to check if the person is old or not
	public void amIOld() 
	{
		if (this.age < 13) 
		{
			System.out.println("You are young.");
		}
		else if (this.age >= 13 && this.age < 18) 
		{
			System.out.println("You are a teenager.");
		}
		else 
		{
			System.out.println("You are old.");
		}
	}
	
	public static void main(String[] args) 
	{
		// checking using the HackerRank's examples
		Person person01 = new Person(-1);
		person01.amIOld();
		person01.yearPasses();
		person01.yearPasses();
		person01.yearPasses();
		person01.amIOld();
		System.out.println();
		
		Person person02 = new Person(10);
		person02.amIOld();
		person02.yearPasses();
		person02.yearPasses();
		person02.yearPasses();
		person02.amIOld();
		System.out.println();
		
		Person person03 = new Person(16);
		person03.amIOld();
		person03.yearPasses();
		person03.yearPasses();
		person03.yearPasses();
		person03.amIOld();
		System.out.println();
		
		Person person04 = new Person(18);
		person04.amIOld();
		person04.yearPasses();
		person04.yearPasses();
		person04.yearPasses();
		person04.amIOld();
		System.out.println();
	}
}
