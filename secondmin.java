package practice;

import java.util.Scanner;

public class secondmin {

	public static void main(String[] args) 
	{
		int n,smin=0,min=9,a;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number:\n");
		n=in.nextInt();
		while(n>0) 
		{
			a=n%10;
			if(min>a)
			{
				smin=min;
				min=a;
			}
			n/=10;
		}
		
		
		System.out.println("2 nd min Value:"+smin);

	}


}