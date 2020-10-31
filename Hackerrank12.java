import java.util.Scanner;
public class Hackerrank12
{

	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int n =in.nextInt();
		try{

		if(n>=-100 && n<=100)
		{
			
			String s = String.valueOf(n);
			s="Good job";
			System.out.println(s);

		}
	}
	catch (NumberFormatException e) 
	{
            System.out.println("Bad String");
        }
	}
}