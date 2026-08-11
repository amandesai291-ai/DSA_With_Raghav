package Arrays;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10 , 15 , 25 , 35 , -5 , -17};
		
		print(arr);
		System.out.println();
		Arrays.sort(arr);
		print(arr);
	}

	public static void print(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
