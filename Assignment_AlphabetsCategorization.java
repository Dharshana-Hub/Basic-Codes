package Assignments;
import java.util.Scanner;
public class Assignment_AlphabetsCategorization
{
	public static void main(String[] args)
	{
		System.out.println("Enter an Alphabet");
	}
	{
	Scanner sc  = new Scanner(System.in);
	String Alphabets = sc.nextLine();
	if(Alphabets.equalsIgnoreCase("a"))
	{
		System.out.println("The given Alphabet is identified as a Vowel");
	}
	else if(Alphabets.equalsIgnoreCase("e"))
	{
		System.out.println("The given Alphabet is identified as a Vowel");
	}
	else if(Alphabets.equalsIgnoreCase("i"))
	{
		System.out.println("The given Alphabet is identified as a Vowel");
	}
	else if(Alphabets.equalsIgnoreCase("o"))
	{
		System.out.println("The given Alphabet is identified as a Vowel");
	}
	else if(Alphabets.equalsIgnoreCase("u"))
	{
		System.out.println("The given Alphabet is identified as a Vowel");
	}
	else if((Alphabets.equalsIgnoreCase("b"))||(Alphabets.equalsIgnoreCase("c"))||(Alphabets.equalsIgnoreCase("d"))||(Alphabets.equalsIgnoreCase("f"))||(Alphabets.equalsIgnoreCase("g"))||(Alphabets.equalsIgnoreCase("h"))||(Alphabets.equalsIgnoreCase("j"))||(Alphabets.equalsIgnoreCase("k"))||(Alphabets.equalsIgnoreCase("l"))||(Alphabets.equalsIgnoreCase("m"))||(Alphabets.equalsIgnoreCase("n"))||(Alphabets.equalsIgnoreCase("p"))||(Alphabets.equalsIgnoreCase("q"))||(Alphabets.equalsIgnoreCase("r"))||(Alphabets.equalsIgnoreCase("s"))||(Alphabets.equalsIgnoreCase("t"))||(Alphabets.equalsIgnoreCase("v"))||(Alphabets.equalsIgnoreCase("w"))||(Alphabets.equalsIgnoreCase("x"))||(Alphabets.equalsIgnoreCase("y"))||(Alphabets.equalsIgnoreCase("z")))
	{
		System.out.println("The given Alphabet is identified as a Consonant");
	}
	else
	{
		System.out.println("Please enter an appropriate Alphabet");
	}
	}
}