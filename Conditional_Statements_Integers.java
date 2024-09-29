package My_Works;
import java.util.Scanner;
public class Conditional_Statements_Integers 
{
	public static void main(String[] args)
	{
		{
			System.out.println("Enter a Number: ");
		}
	Scanner sc = new Scanner(System.in);
	int Number = sc.nextInt();
		if (Number > 0)
		{
			System.out.println("The Given Number is Positive");
		}
		else if (Number < 0)
		{
			System.out.println("The Given Number is Negative");
		}
		else
		{
			System.out.println("The Given Number is Zero");
		}
	}
}
