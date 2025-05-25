package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Kameshwar Rao";
		findMaxOccerence(str);
	}
	public static void findMaxOccerence(String str)
	{
		int count=0;char res=' ';
		 Map<Character,Integer>map=new HashMap<>();
		
	        for(char c:str.toLowerCase().toCharArray())
	        {
	        	if(c!=' ')
	        	{
	            map.put(c,map.getOrDefault(c,0)+1);
	            
	            if(map.get(c)>count)
	            {
	                res=c;
	                count=map.get(c);
	            }
	        }
	         System.out.println(map);
	        System.out.println(res);
	}
	}
}
