package practice;

import java.util.Scanner;

public class Display_char_by_char {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		int i;
		for(i=0;i<=str.length()-1;i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("Reverse :");
		for(i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		int v=0,c=0;
		char ch;
		str = str.toUpperCase();
		for(i=0;i<str.length();i++)
		{
			str=str.toUpperCase();
			ch = str.charAt(i);
			if(Character.isLetter(ch))
			{
				if ("AEIOU".indexOf(ch)!=-1) {
					v++;
				}
				else {
					c++;
				}
			}
		}
		System.out.println("Vowel : "+v+"Consonent : "+c);
		String s1=str.substring(0,str.indexOf(' '));
		String s2=str.substring(str.lastIndexOf(' ')+1);
		System.out.println("Fisrt Word="+s1);
		System.out.println("Last Word="+s2);
		String[] words = str.split(" ");
        if (words.length > 0) {	
            System.out.println("First word: " + words[0]);
            System.out.println("Last word: " + words[words.length - 1]);
        } else {
            System.out.println("No words found.");
        }
        sc.close();
	}
}
