import java.util.*;

public class strong{ 
 public static int fact(int n)
 {
	int f = 1;
	for(int i=1;i<=n;i++)
	{
	   f=f*i;
	}
	return f;
 }
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no : ");
	int n = sc.nextInt();
	int temp=n;
	int sum=0;
	while(n!=0)
	{
	  int a = n%10;
	  sum = sum + fact(a);
	  n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("Strong no");
	}
	else
	{
		System.out.println("Not a strong no");
	}
 }
}