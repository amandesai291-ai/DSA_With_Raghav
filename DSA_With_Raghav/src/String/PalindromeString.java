package String;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("Enter the String..");
		String str = sc.nextLine();
		
		for (int i = 0, j = str.length() - 1; i < j; i++, j--){
				if(str.charAt(i) != str.charAt(j))
				{
					flag = false;
					break;
				}
		}
		
		if(flag) {
			System.out.println("String is a Palindrome..");
		}else
		{
			System.out.println("String is a Not Palindrome..");
		}
		
	}

}
