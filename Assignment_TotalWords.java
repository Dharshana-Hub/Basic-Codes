package Assignments;
import java.util.Scanner;
public class Assignment_TotalWords 
{
	public static void main(String[] args)
	{
		{
			System.out.println("Enter a Passage: ");
		}
		Scanner sc = new Scanner(System.in);
		String Passage = sc.nextLine();
		String [] Words = Passage.split(" ");
		{
			System.out.println(Words.length);
		}
	}
}
