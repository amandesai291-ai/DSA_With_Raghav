package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) 
	{
		String s = "abc";
		List<String> list = new ArrayList<>();
		subSet("",s,0,list );
		System.out.println(list);
	}

	private static void subSet(String ans, String s, int i,List<String> list) {
		
		if(i == s.length())
		{
			if(ans.length() != 0) list.add(ans);
			return;
		}
		  
		char ch = s.charAt(i);
		
		subSet(ans + ch,s,i+1,list);
		subSet(ans,s,i+1,list);
	}	
	
}

