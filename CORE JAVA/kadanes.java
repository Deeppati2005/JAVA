// max Subarrray Sum

public class kadanes{

 public static void kadanes_algo(int arr[])
 {
	int sum = 0; 
    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < arr.length; i++)
 	{
        	sum = sum+arr[i];
        	if(sum>max)
		{
           	   max = sum;
     		}
      		if(sum<0)
		{
                   sum=0;
                }
        }
	System.out.println("Our max Subarray sum is : " + max);
 }

 public static void main(String args[])
 {
	int arr [] = {-2,-3,-4,-1,-2,-1,-5,-3};
	kadanes_algo(arr);
 }
}