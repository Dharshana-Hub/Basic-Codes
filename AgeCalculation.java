package Open_Mee;

import java.util.Scanner;

public class AgeCalculation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Please enter your born year");
		}
		int BornYear = sc.nextInt();
		{
			System.out.println("Please enter Your born month");
		}
		int BornMonth = sc.nextInt();
		{
			System.out.println("Please enter your born date");
		}
		int BornDate = sc.nextInt();
		{
			System.out.println("Please enter the present Year");
		}
		int PresentYear = sc.nextInt();
		{
			System.out.println("Please enter the present month");
		}
		int PresentMonth = sc.nextInt();
		{
			System.out.println("Please enter the Present date");
		}
		int PresentDate = sc.nextInt();
		int Years = PresentYear-BornYear;
		int Months = PresentMonth-BornMonth;
		int Days = PresentDate-BornDate;
		{
			System.out.println(Years+" "+"Years"+" "+Months+" "+"Months"+" "+Days+" "+"Days");
		}
	}
}
	
