package Assignments;
import java.util.Scanner;
public class Assignment_PrimeNumber
{

	public static void main(String[] args) 
	{
		{
			System.out.println("Enter a number: ");
		}
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		if((Number%Number==0)&&(Number%1==Number))
		{
			System.out.println("The given number is a Prime Number");
		}
		else
		{
			System.out.println("The given number is a Composite Number");
		}
		
	}

}
