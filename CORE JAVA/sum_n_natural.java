import java.util.*;

public class sum_n_natural{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n : ");
int n = sc.nextInt();
int sum = 0;
while(n>0) // or take i as an iterator and use (i<=n) , i=1
{
sum = sum +n;
n--;
}
System.out.println("Sum = "+ sum);
}
}