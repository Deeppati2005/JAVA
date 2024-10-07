import java.util.*;

public class odd_even_add{
public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);

	
	int choice;
	int oddSum = 0;
	int evenSum = 0;

	do{
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		if(n%2==0)
		{
			evenSum += n;	
		}
		else
		{
			oddSum += n;
		}

	System.out.println("Enter 1 to continue add the numbers : ");

	choice = sc.nextInt();
	}while(choice==1);

	System.out.println("EvenSum : " + evenSum + "\n" + "OddSum : " + oddSum);
 }
}