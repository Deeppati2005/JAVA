public class bubble_sort{
 
 public static void sort(int arr[])
 {
	int n = arr.length;
	int temp;
	for(int i=0 ; i<n-1;i++)
	{
	   boolean swapped = false;
	   for(int j=0;j<n-i-1;j++)	
	   {
		if(arr[j+1]<arr[j])
		{
			swapped = true;
			temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		}
	   }
	   if(!swapped)
	   {
		break;
	   }
	}
 }

 public static void main(String args[])
 {
	int arr [] = {4,3,7,1,5};
	System.out.print("Before Sort : " );		
	for(int i = 0 ; i < arr.length; i++)
	{
		System.out.print(arr[i] + " ");
	}
	sort(arr);
	System.out.println();
	System.out.print("After Sort : " );
	for(int i = 0 ; i < arr.length; i++)
	{
		System.out.print(arr[i] + " ");
	}
 }
}