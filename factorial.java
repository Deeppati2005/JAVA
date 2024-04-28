import java.util.*;

public class factorial {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      int f = 1;
      System.out.print("Enter the no : ");
      int n = sc.nextInt();
      for (int i = 1; i <= n; i++) {
        f = f * i;
      }
      System.out.print("Factorial = " + f);
      sc.close();
    }
}
