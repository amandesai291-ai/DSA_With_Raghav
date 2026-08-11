package Arrays;

public class Segment_ZERO_ONE {

	public static void main(String[] args) {
		
		int  arr[] = {0, 1,1,1,1, 0, 1, 0, 0, 1, 1, 1, 0};
		int ZeroCount =  0;
		int OneCount = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				ZeroCount++;
			}else
			{
				OneCount++;
			}
		}
		
		for(int i = 0; i<ZeroCount; i++)
		{
			arr[i] = 0;
		}
		
		for(int i = ZeroCount; i<arr.length; i++)
		{
			arr[i] = 1;
		}
		
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
		
	}
}
