package JavaPrograms;

import java.util.*;
public class FindLargestAndSecondnum {
    
    public static void largeAndSmallNum(int []arr)
    {
        int large=arr[0];
        int small=arr[0];
        for(int nums:arr)
        {
            if(nums>large)
            {
            	small=large;
                large=nums;
                
            }
            if(nums>small&& nums!=large)
            {
                small=nums;
            }
        }
        System.out.println("Largest num in "+Arrays.toString(arr)+" is: "+large);
        System.out.println("Smallest num in "+Arrays.toString(arr)+" is: "+small);
    }
    public static void main(String[] args) {
       int arr[]={3,4,1,5,2,6};
       largeAndSmallNum(arr);
    }
}


