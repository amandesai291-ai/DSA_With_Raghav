package Arrays;

import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Search Number...");
		int no = sc.nextInt();
		
		int[] arr = {10,20,30,40,50,60};
	    int found = -1;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == no)
			{
				found = i;
				break;
			}
		}
		
		if(found != -1)
		{
			System.out.println("Arr["+found+"] :" + arr[found]);
		}else
		{
			System.out.println("Element Not found for a Array...");
		}
	}
}
