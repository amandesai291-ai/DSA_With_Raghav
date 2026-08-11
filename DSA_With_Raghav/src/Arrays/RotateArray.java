package Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] arr = {10 , 13 , 15 , 17 , 19 ,21 , 22};
		int d = 8;//rotate element
		
		rotateArray(arr , d);
		print(arr);
		
	}
	
	public static  void rotateArray(int[] arr ,int d) {
		
		int n = arr.length;
		d %= n;
		
		rev(arr,0,d-1);
		rev(arr,d,n-1);
		rev(arr,0,n-1);
		
	}
	
	public static void rev(int[] arr, int i , int j) 
	{
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}
	
	public static void print(int[] arr)
	{
		for(int err : arr)
		{
			System.out.print(err + " ");
		}
	}
}
