import java.util.*;

public class multplication
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no : ");
	int n = sc.nextInt();
	for(int i=1;i<=10;i++){
		System.out.println(n + "X" + i + "=" + n*i);
	}	
   }
}