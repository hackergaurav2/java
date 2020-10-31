
import java.util.Scanner;

public class Add
{
  public static void main( String[] args)
{
int i,j,sum;
Scanner sc=new Scanner(System.in);
System.out.println("input first number: ");
i= sc.nextInt();
System.out.println("input second number: ");
j= sc.nextInt();
sc.close();

  sum=i*j;
System.out.println("sum of these numbers is : "+sum);
}
}