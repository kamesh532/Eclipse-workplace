package JavaPrograms;
import java.util.*;
public class InsertElementInArray {

	public static void main(String[] args) {
		int []arr={1,2,4,5};
		int []narr= new int[arr.length+1];
		int ele=3,index=2;
		System.out.println("Original Array: " + Arrays.toString(arr));
		for(int i= 0; i<arr.length; i++)
		{
			narr[i]=arr[i];
			//System.out.println(narr[i]);
			
		}
		
		narr[index]=ele;
		for(int i=index; i<arr.length; i++)
		{
			narr[i+1]=arr[i];
		}
		System.out.println("element inserted array "+Arrays.toString(narr));
	}
}
