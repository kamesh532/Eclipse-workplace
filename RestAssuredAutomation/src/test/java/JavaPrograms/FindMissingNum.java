package JavaPrograms;

import java.util.Arrays;

public class FindMissingNum {

	public static void missingNum(int[] nums)
	{
		int n=nums.length+1;
		int sum=n*(n+1)/2;
		int actsum=0;
		for(int i:nums)
		{
			actsum+=i;
		}
		sum-=actsum;
		System.out.println("missing number in "+Arrays.toString(nums) + " is: "+sum);
				
	}
	public static void main(String[] args) {
	int[] nums= {1,2,3,4,5,6,8,9,10};
	
missingNum(nums);
	}

}
