package Recursion;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		
		int n = 5;
//		nthFibonaci(n);
		System.out.println(nthFibonaci(n));
	}
	
	public static int nthFibonaci(int n)
	{
		if(n<=1 ) return n;
		return nthFibonaci(n-1) + nthFibonaci(n-2);
	}
}
