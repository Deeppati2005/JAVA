//check the given no is niven no or not 123 = 1+2+3 = 6

import java.util.*;

public class test1 {
  public static boolean isNiven(int n) {
    int a, sum = 0;
    int temp = n;
    while (n > 0) {
      a = n % 10;
      sum = sum + a;
      n = n / 10;
    }

    if (temp % sum == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no : ");
    int n = sc.nextInt();
    if (isNiven(n)) {
      System.out.println("Niven no");
    } else {
      System.out.println("Not Niven no");
    }
    sc.close();
  }
}