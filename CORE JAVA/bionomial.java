import java.util.*;

public class bionomial{

public static int fact(int n)
{
	int f = 1;
	for(int i = 1; i <= n; i++)
	{
		f = f * i;
	}
	return f;
}
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of n :");
  int n = sc.nextInt();
  System.out.println("Enter the value of r :");
  int r = sc.nextInt();
  int result = fact(n) / (fact(r) * fact(n-r));
  System.out.println("Value of ncr is : "+result);
}
}