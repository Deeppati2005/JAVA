import java.util.*;

public class largest{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 nos : ");
int largest;
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a>b && a>c)
{
largest=a;
}
else if(b>a && b>c)
{
largest=b;
}
else
{
largest=c;
}

System.out.println("Largest  : " +largest);
}
}