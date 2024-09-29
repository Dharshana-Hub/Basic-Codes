package My_Works;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Word: ");
		Scanner sc = new Scanner(System.in);
		String Word = sc.next();
		
		StringBuffer ReversedWord = new StringBuffer(Word);
		ReversedWord.reverse();
		
		if(ReversedWord.toString().equalsIgnoreCase(Word))
		{
			System.out.println("The given word is Palindrome!");
		}
		else
		{
			System.out.println("The given word is not a Palindrome!");
		}
	}
}
