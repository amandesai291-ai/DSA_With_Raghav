package Recursion;

public class Gcd_to_Number {

	public static void main(String[] args) {
		
		int a = 18 , b = 48;
		System.out.println("Hello");
		System.out.println(gcd(a , b));

	}

//	public static int gcd(int a , int b)
//	{
//		for(int i = Math.min(a, b); i>= 1; i--)
//		{
//			if(a % i == 0 && b % i == 0)
//			{
//				return i;
//			}
//		}
//	
//		return 1;
//	}
	
	
	public static int gcd(int a, int b) {
        // code here
        return helper(Math.min(a,b), Math.max(a,b));
    }
    
    public static int helper(int a , int b)
    {
        if(a == 0) return b;
        return helper(b % a , a);
    }
}
