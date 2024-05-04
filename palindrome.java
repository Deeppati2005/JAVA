import java.util.*;

public class palindrome {

  public static void check(int n) {
    int value = n;
    int rev = 0;
    while (n > 0) {
      int a = n % 10;
      rev = rev * 10 + a;
      n = n / 10;
    }
    if (value == rev) {
      System.out.println("This ia a palindrome no");
    } else {
      System.out.println("This is not a palindrome no");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no : ");
    int n = sc.nextInt();
    check(n);
    sc.close();
  }
}
