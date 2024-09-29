package My_Works;
import java.util.Scanner;
public class Conditional_Statements_VoterAge 
{
	public static void main(String[] args)
	{
		{
			System.out.println("Enter your Age: ");
		}
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		if(Age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
	}
}
