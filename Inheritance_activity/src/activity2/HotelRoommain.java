package activity2;

import java.util.Scanner;
public class HotelRoommain
{
	public static void main(String args[])
	{
		DeluxeRoom a=new DeluxeRoom();
		DeluxeACRoom b=new DeluxeACRoom();
		SuiteACRoom c=new SuiteACRoom();
		System.out.println("Hotel Tariff Calculator\r\n"+"1. Deluxe Room"+"2. Deluxe AC Room"+"3. Suite AC Room"+"Select Room Type:");
		int x = 0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		switch (x)
		{
		case 1:
			System.out.println(a.getHotelName());
			System.out.println(a.getNumberOfSqFeet());
			System.out.println("Room cost:"+a.CalculateTariff(a.getRatePerSqFeet()));
			break;
		case 2:System.out.println(a.getHotelName());
		System.out.println(a.getNumberOfSqFeet());
		System.out.println("Room cost:"+a.CalculateTariff(a.ratePerSqFeet));
		break;
		case 3:System.out.println(a.getHotelName());
		System.out.println(a.getNumberOfSqFeet());
		System.out.println("Room cost:"+a.CalculateTariff(a.getRatePerSqFeet()));
		break;
	}
	}}