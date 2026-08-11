package Binary_Searching;

public class First_LAst_Occu_Array {
	
	public static void main(String[] args) {
		
		int nums[] = {1,3,4,4,5,5,5,6};
		int target = 5;

        int[] result = new int[2];

        result[0] = findFirst(nums,target);
        result[1] = findLast(nums,target);
        
        System.out.println(result[0] + " " + result[1]);
        
//        System.out.println(findFirst(nums,target));
//        System.out.println(findLast(nums,target));
//            
    }


	public static int findFirst(int nums[] , int target)
	{
        int low = 0;
        int high = nums.length -1;

        int fdx = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] > target)
            {
                high = mid -1;
            }else if(nums[mid] < target)
            {
                low = mid + 1;
            }else
            {
                fdx = mid;
                high = mid -1;
            }
        }
        return fdx;
	}
	
	
	public static int findLast(int nums[] , int target)
	{
        int low = 0;
        int high = nums.length -1;

        int ldx = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] > target)
            {
                high = mid -1;
            }else if(nums[mid] < target)
            {
                low = mid + 1;
            }else
            {
                ldx = mid;
                low = mid + 1;
            }
        }
        return  ldx;
	}
}
