package Conditional_Statements;
import java.util.Scanner;
public class ConditionalStatements_GradeSystem
{
	public static void main (String[] args)
	{
		{
			System.out.println("Enter your mark: ");
		}
		Scanner sc = new Scanner(System.in);
		float Mark = sc.nextFloat();
		if((Mark>=0f)&&(Mark<=44.4f))
		{
			System.out.println("U Grade");
		}
		else if((Mark>=44.5f)&&(Mark<=50.4f))
		{
			System.out.println("E Grade");
		}
		else if((Mark>=50.5f)&&(Mark<=60.4f))
		{
			System.out.println("D Grade");
		}
		else if((Mark>=60.5f)&&(Mark<=70.4f))
		{
			System.out.println("C Grade");
		}
		else if((Mark>=70.5f)&&(Mark<=80.4f))
		{
			System.out.println("B Grade");
		}
		else if((Mark>=80.5f)&&(Mark<=90.4f))
		{
			System.out.println("A Grade");
		}
		else if((Mark>=90.5)&&(Mark<=100f))
		{
			System.out.println("S Grade");
		}
		else
		{
			System.out.println("Please enter a valid mark");
		}
	}
}
