package JavaPrograms;

import java.util.*;
import java.util.HashSet;
import java.util.Map;

public class FindDulpicates {
//public static void findDup(int []nums)
//{
//	int c=0;
//	HashSet<Integer> hset=new HashSet<Integer>();
//	for(int num:nums)
//	{
//		if(!hset.add(num))
//		{
//			
//			System.out.println("Duplicates in "+Arrays.toString(nums)+" : "+num+" occurence is "+c);
//	
//			c++;
//		}
//	}
//}
//	public static void main(String[] args) {
//		int nums[]= {1,3,4,3,1,5,2,5};
//		findDup(nums);
//
//	}
	  public static void main(String[] args) {
	      String str = "Kameshwwara";
	      Map<Character,Integer> map=new HashMap<Character,Integer>();
	      for(char dup: str.toCharArray()){
	          map.put(dup,map.getOrDefault(dup,0)+1);
	          
	      }
	     for(char count:map.keySet())
	      if(map.get(count)>1)
          {
        	  System.out.println(map.get(count)+" : "+count );
          }
	      
	    System.out.println(map);
	    }
}
