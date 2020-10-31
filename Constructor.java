class Constructorbase
{ int res=0;

	int show(int a ,int b)
	{

	int res =a+b;
	return res;
	
	}

}
class cost extends Constructorbase
{
	void Disp(int mul)
	{
		System.out.println(res*mul);

	}

}
class Constructor
{
	public static void main(String arg[])
{
	cost ob = new cost();
	int add = ob.show(4,5);
	ob.Disp(a,6);
	
}
}