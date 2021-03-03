package test_demo;
public class demoelseif {
	public static void main(String args[]) {
		int a=20,b=10,c=5;
		if((a>b)&&(a>c)) {
			System.out.println("a is the greatest number");
		}
		else if((b>a)&&(b>c)) {
			System.out.println("b is the greatest number");
		}
		else{
			System.out.println("c is the greatest number");
		}

	}
}