package test_demo;

public class demoswitchcase 
{
	public static void main(String args[]) 
	{
	int a=10;
	switch(a)
	{
	case 10:
		System.out.println("not elligible for vote");
		break;
	case 18:
		System.out.println("elligible for vote");
		break;
	default:
		System.out.println("can't say");
	}
   }
}