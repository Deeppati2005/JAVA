import java.util.*;

public class binary_to_decimal{
 public static int binToDec(int n){
   int pow = 0;
   int a;
   int dec = 0;
   while(n>0)
   {
	a = n%10;
	dec = dec + a * ( (int) Math.pow(2,pow) );
	n=n/10;
   	pow++;
   }
   return dec;
 }

 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the binary number : ");
	int n = sc.nextInt();
	System.out.println("Decimal of "+n+" is : "+(binToDec(n)));
 }
}