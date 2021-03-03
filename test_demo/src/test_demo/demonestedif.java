package test_demo;

import java.util.Scanner;

public class demonestedif {	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		sc.close();
		if(a%2==0) {
		System.out.println("a is even number");
	}
	else if(a%2==1) {
		System.out.println("a is the odd number");
	}
	else{
		System.out.println("a is zero");
	}

}
}
