package JavaPrograms;

import java.util.Arrays;

public class EtractDigitAndSum {

	
	    public static void main(String[] args) {
	        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};  int sum=0;
	        System.out.println("Sum of "+Arrays.toString(array));
	        for(int i=0; i<array.length; i++){
	        array[i]=array[i].replaceAll("[^0-9]","");
	      if (!array[i].isEmpty()) {
	                sum += Integer.parseInt(array[i]);
	            }
	       
	        }
	        
	         System.out.println(sum);
	    }
	}