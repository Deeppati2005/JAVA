import java.util.*;

public class avg{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 nos : ");
float a = sc.nextInt();
float b = sc.nextInt();
float c = sc.nextInt();
float avg = (a+b+c)/3;
System.out.println("Average = "+avg);
}
}