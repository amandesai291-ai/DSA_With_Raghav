package Sorting;

public class Sel_Task {

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
		
		for(int i = n-1; i>=1; i--)
		{
			int max = Integer.MIN_VALUE , maxdx = -1;
			
			for(int j = i; j>=0; j--)
			{
				if(arr[j] > max)
				{
					max = arr[j];
					maxdx = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[maxdx];
			arr[maxdx] = temp;
			
		}
		print(arr);
	}
}
