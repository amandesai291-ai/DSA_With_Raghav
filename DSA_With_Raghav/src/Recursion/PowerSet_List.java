package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet_List {
	    public static void main(String[] args) {

	        int nums[] = {1, 2, 3};

	        List<Integer> ans = new ArrayList<>();
	        List<List<Integer>> list = new ArrayList<>();

	        subSet(ans, nums, 0, list);

	        System.out.println(list);
	    }

	    private static void subSet(List<Integer> ans,
	                               int[] nums,
	                               int i,
	                               List<List<Integer>> list) {

	        if (i == nums.length) {
	            list.add(ans);
	            return;
	        }

	        // Exclude
	        subSet(ans, nums, i + 1, list);

	        // Include
	        List<Integer> newAns = new ArrayList<>(ans);
	        newAns.add(nums[i]);
	        
	        subSet(ans, nums, i + 1, list);
	    
	}


}