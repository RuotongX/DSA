package otherSortMethod;

public class QucikSort {
	public static void main(String[] args) {
		int[] array = {0,-5,-25,257,19,25,693,13,13,-8,254};
		int min = 0;
		int max = array.length-1;
		quicksort(array,min,max);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		
	}
	public static void quicksort(int[] arr,int min,int max) {
		if(min>=max) {
			return;
		}
		int i = min;
		int j = max;
		int pick = arr[i];
		while(i<j) {
			while(arr[j]>=pick&&i<j) {
				j--;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			while(arr[i]<=pick&&i<j) {
				i++;
			}
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		quicksort(arr,i,j);
	}
}
