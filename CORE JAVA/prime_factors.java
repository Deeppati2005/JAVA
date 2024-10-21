import java.util.*; 

public class prime_factors{
public static boolean prime(int n)
 {
	if(n<=1)
	{
	   return false;
	}
	else
	{
	   for(int i=2;i<=( (int) Math.sqrt(n) );i++)
	   {
		if(n%i==0)
		{
		    return false;
		}
	   }
	   return true;
	}
 }
 public static void factor(int n)
 {
	System.out.println("Prime factors of "+n +" is: ");
	for(int i=1;i<n;i++)
	{
	   if(n%i==0 && prime(i))
	   {
		System.out.println(i);
    	   }
	}
 }
 public static void main (String[]args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no : ");
	int n = sc.nextInt();
	factor(n);
   }
}
