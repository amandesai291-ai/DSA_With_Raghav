package Binary_Searching;

public class FloorSearchEle {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,8,9,10,15};
		int target = 5;
		System.out.println(findFloor(arr, target));
	}
	
	public static int findFloor(int[] arr, int target) {
        // code here
        int low = 0;
        int high = arr.length -1;
         int fdx = -1;
         
       while(low<=high)
       {
           int mid = (low + high)/2;
           
           if(arr[mid] == target)
           {
               return mid;
           }else if(arr[mid] > target)
           {
               high = mid -1;
           }else if(arr[mid] < target)
           {
               fdx = mid;
               low = mid + 1;
           }
       }
       return fdx;
   }
}
