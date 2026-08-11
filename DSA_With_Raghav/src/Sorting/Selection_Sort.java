package Sorting;

public class Selection_Sort {
	
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
		
		for(int i = 0; i< n -1 ; i++)
		{
			int min = Integer.MAX_VALUE,mindx = -1;
			
			for (int j = i; j < n; j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					mindx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mindx];
			arr[mindx] = temp;
			
		}
		print(arr);
	}
	
}
