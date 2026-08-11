package Binary_Searching;

public class FloorSqrt {

	public static void main(String[] args) {
		
//		int  n = 0;
		int n = 15;
		System.out.println(floorSqrt(n));
	}
	
	public static int floorSqrt(int n)
	{
		if(n==0) return 0;
		
		int low = 1, high = n;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			
			if(mid == n/mid) return mid;
			else if(mid  > n/mid) high = mid -1;
			else low = mid + 1;
		}
		return high;
	}
	
//	 public static int floorSqrt(int n) {
//	        // code here
//	        int root = 0;
//	        for(int i =1; i<=n; i++)
//	        {
//	            if(i*i > n) break;
//	            root = i;
//	        }
//	        return root;
//	    }
	
	
}

