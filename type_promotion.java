import java.util.*;

public class type_promotion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char a = 'a';
    char b = 'b';
    System.out.println((int) (b));
    System.out.println((int) (a));
    System.out.println(b - a);
    sc.close();
  }
}
