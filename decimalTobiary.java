import java.util.*;

public class decimalTobiary {

  public static void convert(int n) {
    int pow = 0;
    int binnum = 0;
    while (n > 0) {
      int a = n % 2;
      binnum = binnum + (a * (int) Math.pow(10, pow));
      pow++;
      n = n / 2;
    }
    System.out.println("Binary to Decimal is : " + binnum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no to convert : ");
    int n = sc.nextInt();
    convert(n);
    sc.close();
  }
}
