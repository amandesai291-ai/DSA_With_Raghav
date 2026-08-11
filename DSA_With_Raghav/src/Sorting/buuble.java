package Sorting;

public class buuble {
	
	public static void print(int arr[])
	{
		System.out.println();
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args)
	{
		
		int arr[] = {2,-1,0,3,5,4};
		int n = arr.length;
		print(arr);
		
		for(int i = 0; i<n-1; i++)
		{
			int swaps = 0;
			
			for(int j = 0; j <n-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swaps++;
				}
			}
			if(swaps == 0) break;
		}
		print(arr);
	}
}
