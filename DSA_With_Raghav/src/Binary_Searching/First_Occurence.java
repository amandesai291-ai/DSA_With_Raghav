package Binary_Searching;

public class First_Occurence {
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,4,5,5,5,6};
		int target = 5;
		
		System.out.println(binarySearch(arr,target));
	}
	
	public static int binarySearch(int[] arr, int k) {
        //First Occurence
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;
        
        while(low <= high)
        {
            int mid = (low+high)/2;
            
            if(arr[mid] < k)
            {
                low = mid + 1;
            }else if (arr[mid] > k)
            {
                high = mid -1;
            }else
            {
            	idx = mid;
            	high = mid -1; 
            }
        }
        return idx;
    }

}
