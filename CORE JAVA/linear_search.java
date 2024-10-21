import java.util.*;

public class linear_search{
 
 public static int search(int arr[],int key)
 {
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)	
		{
		    return i;
		}
	}
	return -1;
 }
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.print("Enter the numbers: ");
	for(int i=0; i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the no to find it : ");
	int key = sc.nextInt();
	int index = search(arr,key);
	if(index==-1)	
	{
		System.out.println("Not found");
 	}
	else
	{
		System.out.println("Found at index : "+index);
	}
 }
}