import java.util.*;

public class prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter the no to check : ");
      int n = sc.nextInt();
      boolean isPrime = true;
      for (int i = 2; i <= n - 1; i++) {
        if (n % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        System.out.println("The no is Prime no");
      } else {
        System.out.println("The no is not Prime no");
      }
      sc.close();
    }
}
