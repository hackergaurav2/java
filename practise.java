 abstract class abb
{
	 public abstract void display( int a ,int b);
    
}
 class abbba extends abb
{
	public void display(int a ,int b)
	{
		int c = a+ b;
		System.out.println("Hello World!");
		System.out.println(c);
	}
	
}
 class Practise
{
	public static void main(String []args)
	{
		abb obj = new abbba();
		obj.display(4,5);

		
	}
}
