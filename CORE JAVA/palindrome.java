import java.util.*;

public class palindrome{

 public static int rev(int n)
 {
	int a ;
	int rev = 0;
	while(n>0)
	{
	   a = n%10;
	   rev = rev * 10 + a;
	   n = n/10;
	}
	return rev;
 }
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no :");
	int n = sc.nextInt();
	int a = n;
	if(a == rev(n))
	{
		System.out.println("Palindrome no");
	}
	else
	{
		System.out.println("Not a palindrome no");
	}
 }
}