package Binary_Searching;

public class Search_Rotated_Sorted_Array {

	public static void main(String[] args) {
		
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int target = 3;
		
		System.out.println(findRotate(arr,target));
	}
	
	public static int findRotate(int[] arr, int target)
	{
		int low = 0, high = arr.length -1;
		
		while(low<= high)
		{
			int mid = (low + high)/2;
			
			if(arr[mid] == target) return mid;
			else if(arr[low] <= arr[mid]){ //left side sorted
				if(arr[low]<= target && target<arr[mid])  high = mid -1;
				else low = mid + 1;
			}else
			{
				if(arr[mid]<target && target<= arr[high])  low = mid + 1;
				else high = mid -1 ;
			}
		}	
		return -1;
	}
}
