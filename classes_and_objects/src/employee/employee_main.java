package employee;
import java.util.Scanner;
public class employee_main {
		public static void main(String[] args)
		{
		String a,b,c;
	    Scanner sc = new Scanner(System.in);
	    employee obj = new employee();
	    System.out.println("Enter the name:");
	    a = sc.nextLine();
	    System.out.println("Enter Address:");
	    b = sc.nextLine();
	    System.out.println("Enter Mobile:");
	    c = sc.nextLine(); 
	    obj.setName(a);
	    obj.setAddress(b);
	    obj.setMobile(c);
	    String name = obj.getName();
	    String address = obj.getAddress();
	    String mobile = obj.getMobile();
	    System.out.println("name = "+name);
	    System.out.println("address = "+address);
	    System.out.println("mobile = "+mobile);
		}
	}