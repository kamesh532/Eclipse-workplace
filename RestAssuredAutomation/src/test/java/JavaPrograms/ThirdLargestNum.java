package JavaPrograms;

import java.util.Arrays;

public class ThirdLargestNum {

	public static void thirdLargestNumber(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("third largest in  :" + arr[size - 3]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 7,6, 4 };
		int size = arr.length;
		
			System.out.println(Arrays.toString(arr) );
		
		thirdLargestNumber(arr, size);
	}

}
