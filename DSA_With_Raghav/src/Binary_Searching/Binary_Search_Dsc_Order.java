package Binary_Searching;

public class Binary_Search_Dsc_Order {

	public static void main(String[] args) {
		
		int arr[] = {89, 78 , 67 , 56 , 45, 34 , 23 , 12 , 8};
		int target = 45;
		
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
            }else if(arr[mid] > k)
            {
                low = mid + 1;
            }else if (arr[mid] < k)
            {
                high = mid -1;
            }
        }
        return false;
    }
}
