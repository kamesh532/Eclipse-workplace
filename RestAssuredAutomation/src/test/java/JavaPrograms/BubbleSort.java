package JavaPrograms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]={3,2,7,8,5,4,1};
		System.out.println("Before sort "+Arrays.toString(arr));
		for(int  i=0; i<arr.length - 1; i++)
		{

			for(int  j=0; j<arr.length -1 - i; j++)
			{//System.out.println(i+" "+j);
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}

			}
		}


		System.out.println("After sort "+Arrays.toString(arr));
	}
}
