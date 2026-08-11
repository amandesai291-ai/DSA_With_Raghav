package Recursion;

public class RecursionOnArray {
	
	public static void main(String[] args) {
		
		int arr[] = {5 , 13 , 23 , 45 , 56, 76 , 86 , 98};
		int ele = 76;
		int i = 0;
		System.out.println(exists(arr , ele , i));
//		recPrint(arr , 0);
	}

	public static boolean exists(int arr[] ,int ele , int i)
	{
		int n = arr.length;
		if(i == n) return false;
		if(arr[i] == ele) return true;
		return exists(arr,ele ,i+1);
	}
	
//	public static void recPrint(int arr[] , int idx)
//	{
//		int n = arr.length;
//		if(idx == n) return;
////		System.out.print(" "+arr[idx]); // start left
//		recPrint(arr,idx+1);
//		System.out.print(" "+arr[idx]); //start right
//		
//	}
}
