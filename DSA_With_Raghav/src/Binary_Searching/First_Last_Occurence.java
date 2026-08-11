//Use for a ArrayList

package Binary_Searching;

import java.util.ArrayList;

public class First_Last_Occurence {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,4,5,5,5,6};
		int target = 5;
		
		System.out.println(find(arr, target));
	}

    public static  ArrayList<Integer>  find(int arr[], int x) {
     
    ArrayList<Integer> list = new ArrayList<>();
    
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;
        
        while(low <= high)
        {
            int mid1 = (low+high)/2;
            
            if(arr[mid1] < x)
            {
                low = mid1 + 1;
            }else if (arr[mid1] > x)
            {
                high = mid1 -1;
            }else
            {
            	idx = mid1;
            	high = mid1 -1; 
            }
        }
        
        
        list.add(idx);
    
        low = 0;
		high = arr.length - 1;
		
		int ldx = -1;
		
		while(low <= high)
		{
			int mid2 = (low + high) / 2;
			
			if(arr[mid2] > x)
			{
				high = mid2 -1;
			}else if(arr[mid2] < x)
			{
				low = mid2 + 1;
			}else {
				ldx = mid2;
				low = mid2 + 1;
			}
		}
		
		list.add(ldx);
		
		return list;
    }
}

