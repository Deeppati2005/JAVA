import java.util.*;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value a : ");
      float a = sc.nextFloat();
      System.out.print("Enter the value b : ");
      float b = sc.nextFloat();
      System.out.println("Enter +...add -...sub *...mul /...div %...mod : ");
      // int ans=sc.nextInt();
      char operator = sc.next().charAt(0);
      switch (operator) {
        case '+':
          System.out.println("Addition : " + (a + b));
          break;
        case '-':
          System.out.println("Subtraction : " + (a - b));
          break;
        case '*':
          System.out.println("Multiplication : " + (a * b));
          break;
        case '/':
          System.out.println("Division : " + (a / b));
          break;
        case '%':
          System.out.println("Modulus : " + (a % b));
          break;
        default:
        System.out.println("Wrong Operator");
          break;
      }
      sc.close();
  }
}
