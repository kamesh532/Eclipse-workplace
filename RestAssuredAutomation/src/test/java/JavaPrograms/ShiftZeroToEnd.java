package JavaPrograms;
import java.util.Arrays;
public class ShiftZeroToEnd {

	public static void shiftZerosAndOnes(int []arr) {

		int left,index=0;
		
		for(left=0; left<arr.length; left++)
	      {
	          if(arr[left]!=0)
	          arr[index++]=arr[left];
	      }
	      while(index<arr.length)
	        arr[index++]=0;
	    System.out.println(Arrays.toString(arr));
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,2,4,0,0,1};
		shiftZerosAndOnes(arr);
		
	}
}
