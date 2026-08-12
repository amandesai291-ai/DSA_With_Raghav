package Recursion;

/*
 * 1
11
21
1211
111221
Look-and-Say Pattern:

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
1211 is read off as "one 1, one 2, then two 1s" or 111221.
111221 is read off as "three 1s, two 2s, then one 1" or 312211.

Input n = 5
Output: 111221
 */

public class LookAndSayPatterns {

	public static void main(String[] args) {
		
		int n = 5;
		
		System.out.println(countAndSay(n));
	}
	
	public static String countAndSay(int n) {
     
		if(n == 1) return "1";
		String s = countAndSay(n-1) + "#";
		String ans = "";
		int i = 0,j = 0;
		while(j < s.length())
		{
			if(s.charAt(i) == s.charAt(j)) j++;
			else
			{
				int freq = j - i;
				ans += freq;
				ans += s.charAt(i);
				i = j;
			}
		}
		return ans;
    }
}
