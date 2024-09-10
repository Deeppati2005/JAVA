package practice;

import java.util.Scanner;

public class First_string_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();			
		int i;
		String[] x = str.split(" ");
		for(i=0 ; i< x.length-1;i++)
		{
			char ch=x[i].charAt(0);
			System.out.print(ch + ".");
		}
		System.out.print(x[x.length-1].charAt(0));			
	}
}

