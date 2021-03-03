package test_demo;

import java.util.Scanner;

public class demo3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of the candidate: ");
		int age=sc.nextInt();
		sc.close();
		  if(age>=18)
		  {
			  System.out.println("elligible for vote");
		  }
	}
}