package activities;

import java.util.Scanner;

public class NumberCount {
	static int count;
	public static int findElementCount(int a[],int num,int n){
		for(int i=0;i<num;i++){
	    if(a[i] == n)
		{
		count++;
		}
		}
		return count;
		}
		public static void main(String[] args){
		int n;
		int search;
		int result;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		search = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
		}
		if(n>0)
		{
		result = findElementCount(arr,n,search);
		System.out.println(result);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		}
}
