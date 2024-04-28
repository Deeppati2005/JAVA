import java.util.*;

public class avg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a : ");
    float a = sc.nextFloat();
    System.out.println("Enter the value of b : ");
    float b = sc.nextFloat();
    System.out.println("Enter the value of c : ");
    float c = sc.nextFloat();
    float avg = (a + b + c) / 3;
    System.out.print("Avg : ");
    System.out.println("Avg : " + avg);
    sc.close();
  }
}
