package My_Works;
import java.util.Scanner;
public class Conditional_Statements_Number 
{
	public static void main(String[] args)
	{
		{
			System.out.println("Enter a Number: ");
		}
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		
		if (Number%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			System.out.println("The given number is odd");
		}
	}
}
