import java.util.*;

public class calc{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int result=0;
System.out.println("Enter the 1st no : ");
int a = sc.nextInt();
System.out.println("Enter the 2nd no : ");
int b = sc.nextInt();
System.out.println("Enter + or - or * or /");
char operator = sc.next().charAt(0);
switch(operator)
{
case '+': result = a+b;
	  break;
case '-': result = a-b;
	  break;
case '*': result = a*b;
	  break;
case '/': result = a/b;
	  break;
default : System.out.println("Enter a valid operator");
}
System.out.println("Result : " + result);
}
}