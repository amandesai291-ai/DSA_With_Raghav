package Binary_Searching;

public class Maximum_CountOf_Poss_Negative_Count {

	public static void main(String[] args) {
		
		int arr[] = {-2,-1,-1,1,2,3,4};
		System.out.println(maximumCount(arr));
	}
	
	public static int maximumCount(int[] nums) {

        int n = nums.length;

        int lastNegative = lastNegative(nums);
        int firstPositive = firstPositive(nums);

        int negCount = lastNegative + 1;
        int posCount = n - firstPositive;

        return Math.max(negCount, posCount);
    }

    public static int lastNegative(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < 0) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int firstPositive(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > 0) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

