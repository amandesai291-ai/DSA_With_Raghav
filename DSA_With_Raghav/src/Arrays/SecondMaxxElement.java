package Arrays;

public class SecondMaxxElement {

	public static void main(String[] args) {
		
		int[] arr = {5,7,10,8,10};
		
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		//max 
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		
		//smax 
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i] > smax && arr[i] != max)
				smax = arr[i];
		}
		
		System.out.println("Max : "+ max);
		System.out.println("Second Max : "+ smax);
	}
}

/*package Arrays;

public class RevArray {

	public static void main(String[] args) {
		
		int[] arr = {5,8,3,9,2,4};
		
//		for(int i = arr.length - 1; i>= 0 ; i--)
//		{
//			System.out.print(arr[i] + " , ");
//		}

		int i = 0;
		int j = arr.length - 1;
		
		int temp;
		
		while(i < j)
		{
			temp = i;
			j = i;
			i = temp;
			i++;
			j--;
		}
		
		for(int each: arr)
		{
			System.out.print(each);
		}
	}
	
}

*/