package Sorting;

public class NumOf_Smallest {

	public static void main(String[] args) {
		
		int arr[] = {10, 5,4, 4, 3, 48, 6, 2, 33, 53, 10};
		int k = 4;
		
		System.out.println("Arr["+(k-1)+"] :"  + kthSmallest(arr,k));
		
	}
	
	
	public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {

            int min = Integer.MAX_VALUE;
            int minIdx = i;

            for (int j = i; j < n; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr[k - 1];
    }
}
