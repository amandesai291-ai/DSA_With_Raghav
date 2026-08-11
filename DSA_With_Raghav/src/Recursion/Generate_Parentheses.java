package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

	public static void main(String[] args) {
			int n = 3;
			
			List<String> ans = new ArrayList<>();
			
//			generate(n , 0 , 0 , "",ans);
			
//			System.out.println(ans);
			System.out.println(generate(n , 0 , 0 , "",ans));
	}
	
	public static List<String> generate(int n , int r , int l , String s, List<String> ans) {
		
		if(r == n)
		{
			ans.add(s);
		}
		if(l < n) generate(n,r,l+1,s+"(",ans);
		if(r < l) generate(n ,r+1,l,s+")",ans);

		return ans;
	}
}
