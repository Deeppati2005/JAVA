import java.util.*;

public class pairs{
 
 public static void pair(int arr[])
 {
	int tp = 0;
	for(int i = 0 ;i < arr.length ; i++)
	{
		int current = arr[i];
		for(int j = i+1 ; j<arr.length; j++)
		{
			System.out.print("(" + current + "," + arr[j] + ")");
			tp++;
		}
		System.out.println();
	}
	System.out.println("Total pairs : "+tp);
 }

 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int n = sc.nextInt();
	int arr [] = new int[n];
	System.out.println("Enter the numbers : ");
	for(int i = 0 ;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	pair(arr);
 }
}