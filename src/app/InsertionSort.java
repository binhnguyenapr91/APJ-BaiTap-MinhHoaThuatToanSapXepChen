package app;

public class InsertionSort {
	public static double[] list = {4,3,2,7,6,5,1,8,9,0};
	public static double[] outputList = {0,0,0,0,0,0,0,0,0,0};
	public static int sizeOfOutput = 0;
	
	public static void insertionSort(double[] list) {
		for(int i = 0; i<list.length;i++) {
			outputList[i]=list[i];
			selectionSort(outputList);
			for(double item : outputList) {
				System.out.print(item+" ");
			}
			System.out.println();
			
		}
		
	}
	
	public static void selectionSort(double[] list) {
		for(int i = 0; i< list.length -1 ;i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for(int j = i+1;j<list.length;j++) {
				if (currentMin<list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex!=i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			
		}
	}
	
	public static void main(String args[]) {
		
		insertionSort(list);
		System.out.println(outputList);
		
		for(double item:outputList) {
			System.out.print(item + " ");
		}
	}
}
