package Arrays;

public class RevArray {

	public static void main(String[] args) {
		
		int[] arr = {5,8,3,6,9,2,4};
		
		print(arr);
		System.out.println();
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j)
		{
			swap(arr,i,j);
			i++;
			j--;
		}
		
		print(arr);
	}
	
	
	public static void swap(int[] arr, int n1, int n2) {

		int temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;

	}
	public static void print(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
