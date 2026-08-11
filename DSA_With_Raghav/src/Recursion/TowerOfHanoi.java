package Recursion;

public class TowerOfHanoi {

	static int count;
	
	public static void main(String[] args) {
		count = 0;
		
		hanoi(5,'A','B','C');
		
		System.out.println(count);
		
	}
	
	public static void hanoi(int n , char a , char b , char c)
	{
		if(n == 0) return;
		hanoi(n-1,a,c,b);//n-1 a to b use c
//		System.out.println(a +"->"+c);
		count++;//;largest of A to C
		hanoi(n-1,b,a,c);//n-1 b to c use a
		
	}
}

