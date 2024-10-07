import java.util.*;

public class prime_fun
{
 public static boolean prime(int n)
 {
	if(n<=1)
	{
	   return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
		  return false;
		}
	}
	return true;
 }

 public static void main(String[] args)
{	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num : ");
	int n = sc.nextInt();
	if(prime(n))
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not a Prime no");
	}
}
}