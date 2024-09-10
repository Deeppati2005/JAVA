import java.util.Scanner;

public class greatest_5_nos {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 nos : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    // int max = (a > b) ? ((a > c) ? (a) : (c)) : ((b > c) ? (b) : (c));
    // int max2 = (max > d) ? ((max > e) ? (max) : (e)) : ((d > e) ? (d) : (e));
    int max = Math.max(e, Math.max(Math.max(c, d), Math.max(a, b)));
    System.out.print("Max : " + max);
    sc.close();
  }
}
