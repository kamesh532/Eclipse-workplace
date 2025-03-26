package JavaPrograms;
import java.util.*;
public class ReverseNum{ 

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]={1,2,3,4};
        System.out.println("original array num: "+Arrays.toString(arr));
        reverseNum(arr);
    }
    public static void reverseNum(int []arr){
        int start=0;int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.println("reverse array num: "+Arrays.toString(arr));
    }
}
