import java.util.*;

public class prime_range{
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

 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the range : ");
     int n = sc.nextInt();
     System.out.println("Prime numbers are : ");
     for(int i=1;i<=n;i++)
     {
	if(prime(i))
	{
	  System.out.print(i+" ");
	}
     }
 }
}