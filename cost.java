import java.util.*;

public class cost {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the cost of pencil : ");
    float pc = sc.nextFloat();
    System.out.println("Enter the cost of pen : ");
    float pn = sc.nextFloat();
    System.out.println("Enter the cost of eraser : ");
    float er = sc.nextFloat();
    float cost = (pc + pn + er) + (pc + pn + er) * 18 / 100;
    System.out.println("Cost :" + cost);
    sc.close();
  }
}