import java.util.*;

public class binary_search{
 public static int search(int arr[],int key)
 {
	int start = 0;
	int end =  (arr.length)-1;
	while(start<=end)	
	{
		int mid = (start+end)/2;
		if(key == arr[mid])
		{
			return mid;
		}
		if(key > mid)
		{
			start =  mid + 1;
		}
		else	
		{
			end = mid - 1;
		}
	}
	return -1;
 }
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter the numbers : ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the key : ");
	int key =  sc.nextInt();
	int res = search(arr,key);
	if(res == -1)
	{
	   System.out.println("Not found");
	}
	else
	{
	    System.out.println("Found at index  : "+res);
	}
 }
}