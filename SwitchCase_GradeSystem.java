package Switch_Case;
import java.util.Scanner;
public class SwitchCase_GradeSystem 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Mark");
		int Mark = sc.nextInt();
		switch(Mark/10)
		{
		case 10:
			
		case 9: System.out.println("Your grade is S");
		break;
		case 8: System.out.println("Your grade is A");
		break;
		case 7: System.out.println("Your grade is B");
		break;
		case 6: System.out.println("Your grade is C");
		break;
		case 5: System.out.println("Your grade is D");
		break;
		case 4: System.out.println("Your grade is E");
		break;
		
		default: System.out.println("Your grade is U");
		break;
		}
	}
}
