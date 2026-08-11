package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Commen_Ele_Sorted {

	public static void main(String[] args) {
		
		int a[] = {3, 4, 2, 2, 4};
		int b[] = {3, 2, 2, 7};
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		System.out.println(commonElements(a,b));
	}
	
	
	public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
		Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0,j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length)
        {
            if(a[i]== b[j])
            {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j])
            {
                i++;
            }
            else if(a[i] > b[j])
            {
                j++;
            }
                
        }
        return ans;
    }
}
