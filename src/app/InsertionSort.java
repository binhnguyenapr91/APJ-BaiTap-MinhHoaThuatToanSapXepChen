package app;

public class InsertionSort {
	public static double[] list = {4,3,2,7,6,5,1,8,9,0};

	public static double[] insertionSort(double[] arr){
		int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            double key = arr[i]; 
            int j = i - 1; 

            while (j >= 0 && arr[j] < key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        return arr;
	}
	
	public static void main(String args[]) {
		
		
		insertionSort(list);
		for(double item:list) {
			System.out.print(item + " ");
		}
	}
}
