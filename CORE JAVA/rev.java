import java.util.*;

public class rev{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no : ");
int n = sc.nextInt();
int rev = 0 ;
int a;	
while(n>0)
{
a=n%10;
rev = rev*10+a;
n=n/10;
}
System.out.println("Reverse no : "+rev);
}
}