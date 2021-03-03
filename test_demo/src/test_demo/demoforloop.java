package test_demo;

import java.util.Scanner;

public class demoforloop {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
