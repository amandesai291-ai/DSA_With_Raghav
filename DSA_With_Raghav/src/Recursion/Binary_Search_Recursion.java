package Recursion;

public class Binary_Search_Recursion {

	public static void main(String[] args) {
		int arr[] = {-1,0,3,5,9,12};
		int target = 5;
		 int n = arr.length;
		System.out.println("Index Of Target:"+helper(arr , target , 0 , n-1));
	}
	
	 public static  int  helper(int arr[] ,int target , int low , int high)
	 {
	        if(low>high)    return -1;
	        int mid = low + (high - low)/2;
	        if(arr[mid] == target) return  mid;
	        else if(arr[mid] > target) return  helper(arr, target , low , mid -1 ); 
	        else return helper(arr , target  , mid + 1 , high);     
	 }
	 
}
