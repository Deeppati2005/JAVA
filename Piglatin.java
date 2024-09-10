package practice;

import java.util.Scanner; 

public class Piglatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();			
		int i;
		str = str.toUpperCase();
		int vowelIndex = -1;
		for(i= 0 ; i < str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch== 'O' ||ch == 'U')
			{
				vowelIndex = i;
				break;
			}
		}
		String s1=str.substring(0,vowelIndex);
		String s2=str.substring((vowelIndex),(str.length()));
		System.out.print(s2+s1+"AY");
	}

}
