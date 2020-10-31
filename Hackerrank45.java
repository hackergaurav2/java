import java.util.*;
abstract class Calculator
{
	abstract void add();
}
 class Adder extends Calculator
{
	 int add();
	{
		 int c= a+b;
		return(c);
	}


}
class Hackerranktest
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		Adder obj=new Adder();
		obj.add();

	  


	}
}