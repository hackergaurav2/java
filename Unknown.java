
import java.util.Scanner;
  class Unknown
  {
	
	public static void main(String []args)
	{
		Scanner sa = new Scanner(System.in);
		System.out.println("input two number");
		int a=sa.nextInt();
		int b= sa.nextInt();
		System.out.println("input ur choice");
		  int ch = sa.nextInt();
		if (ch==1)
		{
			int c =a+b;
			System.out.println("this is your addition"+c);
		} 
		else if (ch==2)
		{
			int c = a-b;
			System.out.println("this is your subtract"+c);
		}
		else if (ch==3)
		{
			if(b==0)
			{	
			try
			{ 
				
				c = a/b;
				System.out.println("after exception");


			}
			catch (ArithmeticException ca)
			{
				System.out.println("Division by 0");

			}}
			else 
			{
				c = a/b;
				System.out.println("result"+c);
			}


		}
		else 
		{
			System.out.println("wrong key");
		}
	}
}