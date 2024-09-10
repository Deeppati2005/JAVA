package practice;

import java.util.Scanner;

public class Swap1st_last  {
	public static void swap(int n)
	{	
		int pow;
		pow=(int)Math.log10(n);//n=integer.toString(n).length()
		pow=(int)Math.pow(10,pow);
		int first=n/pow;
		int last=n%10;
		n=n%pow;
		n-=last;
		int result=last*pow+n+first;
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("\n Enter the no:");
		int n=in.nextInt();
		swap(n);
		in.close();
	}
}