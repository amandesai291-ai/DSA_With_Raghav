package String;

import java.util.Scanner;

public class CountOfVowels {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String..");
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i' )
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
