package Assignments;

import java.util.Scanner;

public class Alphabets_Identification 
{
	public static void main(String[] args)
	{
		{
			System.out.println("Enter an Alphabet: ");
		}
		Scanner sc = new Scanner(System.in);
		String Alphabets = sc.nextLine();
		if((Alphabets.equalsIgnoreCase("a"))||(Alphabets.equalsIgnoreCase("e"))||(Alphabets.equalsIgnoreCase("i"))||(Alphabets.equalsIgnoreCase("o"))||(Alphabets.equalsIgnoreCase("u")))
		{
			System.out.println("The given Alphabet is identified as a Vowel");
		}
		else if((Alphabets.equalsIgnoreCase("b"))||(Alphabets.equalsIgnoreCase("c"))||(Alphabets.equalsIgnoreCase("d"))||(Alphabets.equalsIgnoreCase("f"))||(Alphabets.equalsIgnoreCase("g"))||(Alphabets.equalsIgnoreCase("h"))||(Alphabets.equalsIgnoreCase("j"))||(Alphabets.equalsIgnoreCase("k"))||(Alphabets.equalsIgnoreCase("l"))||(Alphabets.equalsIgnoreCase("m"))||(Alphabets.equalsIgnoreCase("n"))||(Alphabets.equalsIgnoreCase("p"))||(Alphabets.equalsIgnoreCase("q"))||(Alphabets.equalsIgnoreCase("r"))||(Alphabets.equalsIgnoreCase("s"))||(Alphabets.equalsIgnoreCase("t"))||(Alphabets.equalsIgnoreCase("v"))||(Alphabets.equalsIgnoreCase("w"))||(Alphabets.equalsIgnoreCase("x"))||(Alphabets.equalsIgnoreCase("y"))||(Alphabets.equalsIgnoreCase("z")))
		{
			System.out.println("The given Alphabet is identified as a Consonanat");
		}
		else
		{
			System.out.println("Please enter an appropriate Alphabet");
		}
	}
}