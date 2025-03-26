package JavaPrograms;

import java.util.Arrays;

public class SortingAndFindSeconLarNSmall {
	public static void main(String[] args) {
		int arr[]={2,1,3,5,7,9};int seconSmallest=0,secondLargest=0;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			seconSmallest=arr[1];
			secondLargest=arr[arr.length-2];
		}
		System.out.println("sorted "+Arrays.toString(arr));
		System.out.println("seconSmallest "+seconSmallest+"\n secondLargest "+secondLargest+" ");
	}
}
