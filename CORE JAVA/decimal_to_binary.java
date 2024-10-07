import java.util.*;

public class decimal_to_binary{
  public static int decToBin(int n)
  {
      int a;
      int pow = 0;
      int bin=0;
      while(n>0)
      {
	a = n%2;
	bin = bin + a*( (int) Math.pow(10,pow));
	pow++;
	n = n/2;
      }
      return bin;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the decimal no : ");
    int n = sc.nextInt();
    System.out.println("binary of "+n+" is : "+ (decToBin(n)) );
  }
}