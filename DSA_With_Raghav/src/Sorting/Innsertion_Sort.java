package Sorting;

public class Innsertion_Sort {
	
	public static void main(String[] args) {
	
		int arr[] = {4,1,17,8,31,9,2,0,8,6};
		
		for(int i = 0; i<arr.length; i++)
		{
			int j = i;
			while(j>0 && arr[j] < arr[j-1])
			{
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
	}
	
}
