import java.util.Scanner;
 public class Dice
{
	 void display()
	 {
        if(k=='0')
{

double result = Math.floor(Math.random() * (upper - lower + 1) + lower);
System.out.println(result);
}
	else
	{


double result = Math.floor(Math.random() * (upper - lower + 1) + lower);
System.out.println(result);}
	
	 }






	public static void main(String []args)
	{
		Scanner in =new Scanner(System.in);
		int k = in.nextInt();   
		int upper = 0;
        int lower = 7;
         
        display();



}
}
