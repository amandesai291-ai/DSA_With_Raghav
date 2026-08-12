package Merge_Sort;

public class Merge_Magic_Sort {

	public static void main(String[] args) {
		
		int arr[] = {8,1,3,-2,4,7,2,9,5,10,6,-5};
		
		mergeSort(arr);
		
		for(int ele : arr) System.out.print(ele + " ");
		
	}
	
	public static void mergeSort(int arr[]) {
		
		int n = arr.length;
		if(n == 1) return;
		
		
		//new Empty array create 
		int a[] = new int [n/2];
		int b[] = new int [ n - n/2];
		
		//copy - past array
		
		int idx = 0;
		for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
		for(int i = 0; i<b.length; i++) b[i] = arr[idx++];
		
		//magic sort
		mergeSort(a);
		mergeSort(b);
		
		
		merge(a,b,arr);
					
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
