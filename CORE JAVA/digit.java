import java.util.*;

public class digit{
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	int c = 0;
	int a;
	System.out.println("Enter the no :");
	int n = sc.nextInt();
	while(n>0)
	{
	 c++;
	 n=n/10;
	}
	System.out.println("Count : "+c);
 }
}