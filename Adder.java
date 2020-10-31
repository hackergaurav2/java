import java.util.*;
abstract class Calculator
{
	abstract void add(int a, int b);
}
 class Adder extends Calculator
{
	 void add(int a ,int b)
	{
		 int c= a+b;
		System.out.println(c);
	}


}
class Hackerranktest
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		Calculator adde=new Calculator();
		adde.add();

	  


	}
}