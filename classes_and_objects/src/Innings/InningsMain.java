package Innings;

import java.util.Scanner;

import employee.employee;

public class InningsMain {
		  public static void main(String[] args) {
			  String a,b;
			  int c;
			    Scanner sc = new Scanner(System.in);
			    Innings obj = new Innings();
			    System.out.println("Enter the team name:");
			    a = sc.nextLine();
			    System.out.println("Enter session:");
			    b = sc.nextLine();
			    System.out.println("Enter runs");
			    c = sc.nextInt(); 
			    obj.setTeamname(a);
			    obj.setInningsname(b);
			    obj.setRuns(c);
			    String teamname = obj.getTeamname();
			    String inningsname = obj.getInningsname();
			    int runs = obj.getRuns();
		    System.out.println("Name:"+teamname);
		    System.out.println("Scored:"+inningsname);
	    	int d=c+1;
		    if(b == "second")
		    {
		    	System.out.println("Match Ended.");
		    }
		    else
		    {
		    	System.out.println("Need  to win"+d);
		    }
		  }
}