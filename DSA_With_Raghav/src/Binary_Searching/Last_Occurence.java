package Binary_Searching;

public class Last_Occurence {

	public static void main(String[] args) {
		
		int arr[] = {1,1,1,2,2,3,4,5};
		int target = 1;
		
		System.out.println(lastOccu(arr, target));
	}
	
	public static int lastOccu(int arr[] , int target)
	{
		int low = 0;
		int high = arr.length - 1;
		int ldx = -1;
		
		while(low <= high)
		{
			int mid = (low + high) / 2;
			
			if(arr[mid] > target)
			{
				high = mid -1;
			}else if(arr[mid] < target)
			{
				low = mid + 1;
			}else {
				ldx = mid;
				low = mid + 1;
			}
		}
		return ldx;
	}
}
