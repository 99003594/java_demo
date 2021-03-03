package Company;

import java.util.Scanner;
public class CompanyMain {
	public static void main(String[] args) {
		String a,b,c;
		Scanner k = new Scanner(System.in);
		Company j = new Company();
		System.out.println("Enter the company name:");
		a = k.nextLine();
		System.out.println("Enter the employees:");
		b = k.nextLine();
		System.out.println("Enter TeamLead:");
		c = k.nextLine(); 
		j.setName(a);
		j.setEmployees(b);
		j.setTeamlead(c);
		String name = j.getName();
		String employees = j.getEmployees();
		String teamlead = j.getTeamlead();
		System.out.println("Name:"+name);
		System.out.println("Emploees: "+employees);
		System.out.println("Lead: "+teamlead);
	}
}