package Merge_Sort;

public class Two_Array_Merge {
	
	public static void main(String[] args) {
		
		int a[] = {10, 15 , 28 , 39 , 40 , 43 , 65};
		int b[] = {12, 35 , 48 , 69 , 70 , 73 , 85};
		int c[] = new int[a.length + b.length];

		merge(a,b,c);
		
		for(int ele : c) System.out.print(ele + " ");
		System.out.println();
	}
	
	
	public static void merge(int a[] , int b[] , int c[]) {
		
		int i = 0 , j = 0 , k = 0;
		
		 while(i <a.length && j <b.length) {
			 if(a[i]<=b[j]) {
				 c[k++] = a[i++];
			 }
			 else {
				 c[k++] = b[j++];
			 }
		 }
		
		 while(i<a.length) c[k++] = a[i++];
		 while(j<b.length) c[k++] = b[j++];
		
	}

}
