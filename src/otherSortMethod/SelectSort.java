package otherSortMethod;

public class SelectSort {
	public static void main(String[] args) {
		int[] array = { 0, -5, -25, 257, 19, 25, 693, 13, 13, -534, 254 };
		selectsort(array);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
	}
	public static void selectsort(int[]array) {
		for(int i = 0;i<array.length;i++) {
			int minimum = i;
			for(int j = i+1;j<array.length;j++) {
				if(array[j]<array[minimum])
					minimum = j;
				if(array[i] != array[minimum]) {
					int temp = array[i];
					array[i] = array[minimum];
					array[minimum] = temp;
				}
			}
		}
	}
}
