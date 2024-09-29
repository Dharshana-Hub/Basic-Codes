package Conditional_Statements;

import java.util.Scanner;

public class ConditionalStatements_Age
{
	public static void main(String[] args)
		{
		System.out.println("Select Month or Year: ");
		Scanner sc= new Scanner(System.in);
		String type = sc.nextLine();
		if(type.equalsIgnoreCase("Month"))
		{
			System.out.println("Please enter your age in Month");
			int Month = sc.nextInt();
			if((Month>0)&&(Month<=6))
			{
				System.out.println("Infant");
			}
			else if((Month>=7)&&(Month<=24))
			{
				System.out.println("Toddler");
			}
			else if((Month>=25)&&(Month<=48))
			{
				System.out.println("Kid");
			}
			else if((Month>=49)&&(Month<=144))
			{
				System.out.println("Child");
			}
			else if((Month>=145)&&(Month<=228))
			{
				System.out.println("Teen");
			}
			else if((Month>=229)&&(Month<=708))
			{
				System.out.println("Adult");
			}
			else if((Month>=709))
			{
				System.out.println("Oldage");
			}
			else
			{
				System.out.println("Please enter the proper month");
			}
		}
		else if(type.equalsIgnoreCase("Year"))
		{
			System.out.println("Please enter your age in Year");
			Float Year = sc.nextFloat();
			if((Year>0)&&(Year<=0.5))
			{
				System.out.println("Infant");
			}
			else if((Year>=0.6)&&(Year<=2.0))
			{
				System.out.println("Toddler");
			}
			else if((Year>=2.1)&&(Year<=4.0))
			{
				System.out.println("Kid");
			}
			else if((Year>=4.1)&&(Year<=12.4))
			{
				System.out.println("Child");
			}
			else if((Year>=12.5)&&(Year<=19.4))
			{
				System.out.println("Teen");
			}
			else if((Year>=19.5)&&(Year<=59.0))
			{
				System.out.println("Adult");
			}
			else if((Year>=59.1))
			{
				System.out.println("Oldage");
			}
			else
			{
				System.out.println("Please enter the proper Year");
			}
		}
		else 
		{
			System.out.println("Please select the appropriate option");
		}
	
	}
}