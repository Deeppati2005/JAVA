import java.util.*;

public class price{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the price of pencil : ");
float a = sc.nextFloat();
System.out.println("Enter the price of pen : ");
float b = sc.nextFloat();
System.out.println("Enter the price of eraser : ");
float c = sc.nextFloat();
float price = a+b+c;
float gst = (a+b+c)*0.18f;
System.out.println("Price : " +price+ "\nAfter adding GST "+gst);
}
}