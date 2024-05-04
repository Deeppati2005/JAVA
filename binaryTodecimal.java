import java.util.*;

public class binaryTodecimal {

  public static void convert(int n) {
    int pow = 0;
    int decnum = 0;
    while (n > 0) {
      int a = n % 10;
      decnum = decnum + (a * (int) Math.pow(2, pow));
      pow++;
      n = n / 10;
    }
    System.out.println("Decimal of binary no is : " + decnum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no to convert : ");
    int n = sc.nextInt();
    convert(n);
    sc.close();
  }
}
