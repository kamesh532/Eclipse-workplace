package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

import org.checkerframework.checker.units.qual.min;

public class PairSumEqualToTarget {
	public static void main(String[] args) {
		int arr[]={2,3,4,5,6,3};
		int tar=8;
		usingMap(arr,tar);
		
	}
	public static void usingBruteforce(int[] arr,int target) {
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}
	}
	public static void usingMap(int[] arr,int target) {
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			int com=target-arr[i];
			if(!map.containsKey(com))
			{
				int min=Math.min(arr[i], com);
				int max=Math.max(arr[i], com);
				map.put(min,max);
			}
			
		}
	//	System.out.println(map);
		 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            System.out.println("Pair: " + entry.getKey() + ", " + entry.getValue());}
	}
}
