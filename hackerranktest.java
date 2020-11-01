import java.util.*;
abstract class Calculator
{
	abstract void add(int a, int b);
}
public class Adder extends Calculator
{
	public void add(int a ,int b)
	{
		 int c= a+b;
		System.out.println(c);
	}


}
public class Hackerranktest extends Adder
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		Adder adde=new Hackerranktest();
		adde.Adder();

	  


	}
}