package Assignments;

class Assignment_UpperandLowerCases 
{
	public static void main(String[] args)
	{
		// I am a automation Tester engineer //
		String Sentence = "I am a automation Tester engineer";
		String[] words = Sentence.split(" ");
		Character n1 = words[0].charAt(0);
		Character n2 = words[1].charAt(0);
		Character n3 = words[2].charAt(0);
		Character n4 = words[3].charAt(0);
		Character n5 = words[4].charAt(0);
		Character n6 = words[5].charAt(0);
		if(n1.isUpperCase(n1))
		{
			System.out.println(n1 + " " + "is in Upper Case");
		}
		else
		{
			System.out.println(n1 + " " + "is in Lower Case");
		}
		if(n2.isUpperCase(n2))
		{
			System.out.println(n2 + " " + "is in Upper Case");
		}
		else
		{
			System.out.println(n2 + " " + "is in Lower Case");
		}
		if(n3.isUpperCase(n3))
		{
			System.out.println(n3 + " " + "is in Upper Case");
		}
		else
		{
			System.out.println(n3 + " " + "is in Lower Case");
		}
		if(n4.isUpperCase(n4))
		{
			System.out.println(n4 + " " + "is in Upper Case");
		}
		else
		{
			System.out.println(n4 + " " + "is in Lower Case");
		}
		if(n5.isUpperCase(n4))
		{
			System.out.println(n5 + " " + "is in Upper Case");
		}
		else
		{
			System.out.println(n5 + " " + "is in Lower Case");
		}
		if(n6.isUpperCase(n5))
		{
			System.out.println(n6 + " " + "is in Upper Case");
		}
		else
		{
			System.out.println(n6 + " " + "is in Lower Case");
		}
		// To convert the case of first letter of every word //
		Character  c1;
		if(n1.isUpperCase(n1))
		{
			c1 = n1.toLowerCase(n1);
			System.out.println(c1);
		}
		else
		{
			c1 = n1.toUpperCase(n1);
			System.out.println(c1);
		}
		Character c2;
		if(n2.isUpperCase(n2))
		{
			c2 = n2.toLowerCase(n2);
			System.out.println(c2);
		}
		else
		{
			c2 = n2.toLowerCase(n2);
			System.out.println(c2);
		}
		Character c3;
		if(n3.isUpperCase(n3))
		{
			c3 = n3.toLowerCase(n3);
			System.out.println(c3);
		}
		else
		{
			c3 = n3.toUpperCase(n3);
			System.out.println(c3);
		}
		Character c4;
		if(n4.isUpperCase(n4))
		{
			c4 = n4.toLowerCase(n4);
			System.out.println(c4);
		}
		else
		{
			c4 = n4.toUpperCase(n4);
			System.out.println(c4);
		}
		Character c5;
		if(n5.isUpperCase(n5))
		{
			c5 = n5.toLowerCase(n5);
			System.out.println(c5);
		}
		else
		{
			c5 = n5.toUpperCase(n5);
			System.out.println(c5);
		}
		Character c6;
		if(n5.isUpperCase(n6))
		{
			c6 = n6.toLowerCase(n6);
			System.out.println(c6);
		}
		else
		{
			c6 = n6.toUpperCase(n6);
			System.out.println(c6);
		}
		{
			System.out.println(c1 + " " + c2 + "m" + " " + c3 + " " + c4 + "utomated" + " " + c5 + "ester" + " " + c6 + "ngineer" );
		}
		}
}