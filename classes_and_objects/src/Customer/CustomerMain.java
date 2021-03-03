package Customer;
import java.util.Scanner;
import employee.employee;
public class CustomerMain {
		public static void main(String[] args)
		{
		String a,b,c;
	    Scanner sc = new Scanner(System.in);
	    Customer obj = new Customer();
	    System.out.println("Enter the details:");
	    a = sc.nextLine();
	    b = sc.nextLine();
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