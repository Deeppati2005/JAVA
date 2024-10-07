import java.util.*;

public class ternary{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 nos : ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int result = ( (a>b) ? ( (a>c) ? (a) : (c) ) : ((b>c) ? (b) : (c) ) );
System.out.println("Largest is : " +result);
}
}