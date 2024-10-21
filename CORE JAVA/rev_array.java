import java.util.*;
public class rev_array{
 
 public static void rev(int arr[])
 {	
	int first = 0;
	int last = arr.length-1;
	int temp;
	while(first<last)	
	{
	  temp = arr[first];
	  arr[first]=arr[last];
	  arr[last]=temp;
	  first++;
	  last--;
	}
 }
 
 public static void main(String args[])
 {	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array : ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.print("Enter the numbers : ");
	for(int i=0;i<arr.length;i++)	
	{
		arr[i] =  sc.nextInt();
	}
	rev(arr);
	System.out.println("After reverse the array : ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
 }
}