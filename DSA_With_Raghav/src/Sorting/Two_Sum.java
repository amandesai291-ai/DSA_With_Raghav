package Sorting;

import java.util.Arrays;

public class Two_Sum {
	
	public static void main(String[] args) {
		
		int arr[] = {11 , 2 , 6 ,3 , 10 , 15 , 20};
		int target =8 ;
		
//		twoSum(arr, target);
		System.out.println(twoSum(arr, target));
	}
	
	 public static boolean twoSum(int arr[], int target) {
	        // code here
	        Arrays.sort(arr);
	        int i = 0, j = arr.length - 1;
	        while(i < j)
	        {
	            if((arr[i] + arr[j]) == target)
	            {
	                return true;
	            }else if((arr[i] + arr[j]) < target)
	            {
	                i++;
	            }else if((arr[i] + arr[j]) >  target)
	            {
	                j--;
	            }
	        }
	        return false;
	    }

}
