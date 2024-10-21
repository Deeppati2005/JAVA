import java.util.*;

public class armstrong{

public static int len(int n)
{
	int c=0;
	while(n!=0)
	{
	   c++;
	   n=n/10;	
	}
	return c;
}

public static boolean armstrong(int n , int l)
{
	int sum = 0;
	int temp = n , a;
	while(n!=0)
	{
	  a = n%10;
       	  sum = sum + ( (int) Math.pow(a,l) );
	  n= n/10;
	}
	return temp==sum;
}

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no : ");
	int n = sc.nextInt();
	if(armstrong(n,len(n)))
	{
		System.out.println("Armstrong No");
	}
	else
	{
		System.out.println("Not a armstrong no");
	}
}
}