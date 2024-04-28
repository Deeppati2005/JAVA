import java.util.*;

public class sum_n_natural_nos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = sc.nextInt();
    int i = 1;
    int sum = 0;
    while (i <= n) {
      sum = sum + i;
      i++;
    }
    System.out.println("Sum = " + sum);
    sc.close();
  }
}
