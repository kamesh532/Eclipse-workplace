package JavaPrograms;
import java.util.Arrays;
public class ShiftZeroToEnd {

	public static void shiftZerosAndOnes(int []arr) {

		int left=0,right=arr.length-1;
		while(left<right)
		{
			while(left<right && arr[left]==1)
			{
				left++;
			}
			while(left<right && arr[right]==0)
			{
				right--;
			}
			if(left<right)
			{
				arr[left]=1;
				arr[right]=0;
				left++;
				right--;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
		//USING SWAP METHOD
		public static void swapMethod(int []arr)
		{
		  int left=0;// Pointer for the leftmost part of the array

        for (int right =0; right< arr.length; right++) {
            if (arr[right] == 0) {
                // Swap elements at left and right pointers if right is 0
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;  // Move left pointer to the next position
            }
            
        }
        System.out.println("using 1st mehod "+Arrays.toString(arr));
	}
		
		//2nd method
		public static void shiftZeroAndOnes(int arr[]){
	        int left=0,temp=0;
	        for(int right=0; right<arr.length; right++)
	        {
	            if(arr[right]==0)
	            {
	                temp=arr[right];
	                arr[right]=arr[left];
	                arr[left]=temp;
	                left++;
	            }
	            
	        }
	        System.out.println("using 2nd mehod "+Arrays.toString(arr));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,0,0,1};
		shiftZeroAndOnes(arr);
		swapMethod(arr);
	}
}
