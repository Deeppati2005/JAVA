package practice;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string :");
		s=sc.nextLine();
		int i;
		s = s.toUpperCase();
		String s1 = "";
		for(i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			s1=s1+ch;
		}
		if (s.equals(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
