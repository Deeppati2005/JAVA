import java.util.*;

public class prime{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no the check : ");
	int n = sc.nextInt();
	if(n==2)
	{
	   System.out.println("Prime no");
	}
	if(n<=1)
	{
		System.out.println("Not a Prime no");
	}
	else
	{
	  	boolean isPrime = true;
	  	for(int i=2;i<=Math.sqrt(n);i++)
	  	{
			if(n%i==0)
			{
			   isPrime = false;
			}
	 	 }
		if(isPrime==true)
		{
	 	  System.out.println(n + " is prime");
		}
		else
		{
	 	  System.out.println(n + " is not a Prime no");
		}
	}
   }
}