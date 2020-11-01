class Test1
{
	int add ( int var1, int var2)
	{
		int res = var1 +var2;
		System.out.println(res);
		return (res);

	}
	int add ( int var1, int var2, int var3)
	{
		int res = (var1 + var2 + var3);
		System.out.println(res);
		return res;
		
	}

}
class Test
{
	public static void main ( String []arg)
	{
		Test1  t = new Test1();
		t.add(4,5);
		t.add(5,6,7);


	}

}