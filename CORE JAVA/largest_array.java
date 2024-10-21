import java.util.*;

public class largest_array
{
  public static void compare(int arr[])
  {
	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i] > largest)
		{
			largest = arr[i];
		}
		if(arr[i] < smallest)
		{
			smallest = arr[i];
		}
	}
	System.out.println("Largest no in the array is : "+largest);
	System.out.println("Smallest no in the array is : "+smallest);
  }
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter the numbers : ");
	for(int i=0;i<arr.length;i++)
	{
	    arr[i] = sc.nextInt();
	}
	compare(arr);
  }
}