import java.util.*;

public class fibonacci {
    public static void fib(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " , " + b);
        int nextTerm;
        for (int i = 2; i < n; i++) 
	{
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(" , " + nextTerm);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        fib(n);
    }
}
