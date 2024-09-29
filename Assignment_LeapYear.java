package Assignments;
import java.util.Scanner;
public class Assignment_LeapYear 
{
	public static void main(String[] args)
	{
		{
			System.out.println("Enter a Year: ");
		}
		Scanner sc = new Scanner(System.in);
		int Year = sc.nextInt();
		if(((Year%4==0)&&(Year%100!=0)||(Year%400==0)))
		{
			System.out.println("The given Year is a Leap Year");
		}
		else
		{
			System.out.println("The given year is not a Leap Year");
		}
	}
}
