package JavaPrograms;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("Before "+Arrays.toString(nums));
//        for(int num:nums)
//        	System.out.print(num+" ");
        int[] result = removeDuplicates(nums);

        // Print the result array
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        // Add elements to the Set (LinkedHashSet maintains insertion order)
        for (int num : nums) {
            set.add(num);
        }

        // Convert the Set to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
       // Arrays.stream(nums).max().getAsInt();

        return result;
        
        
    }
   
}
