package Binary_Searching;

public class Binary_Search {

	public static void main(String[] args) {
		
		int arr[] = {-76 , 12 , 43 , 67 , 89 , 93 , 98};
		int target = 43;
		
		System.out.println(binarySearch(arr,target));
	}
	
	public static  boolean binarySearch(int[] arr, int k) {
        // code here
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high)
        {
            int mid = (low+high)/2;
            
            if(arr[mid] == k)
            {
                return true;
            }else if(arr[mid] < k)
            {
                low = mid + 1;
            }else if (arr[mid] > k)
            {
                high = mid -1;
            }
        }
        return false;
    }
}
