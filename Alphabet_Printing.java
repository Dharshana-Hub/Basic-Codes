package For_Loop;

public class Alphabet_Printing 
{
	public static void main(String[] args)
	{
		int r = 1;
		for(char i = 'A';i<='Z';)
		{
			//System.out.println(i);
			for(int c = 1;c<=r;c++)
			{
				System.out.print(i);
				i++;
			}
			r++;
			if(i=='Z')
			{
				break;
			}
		}
		
		System.out.println();
	}
}
