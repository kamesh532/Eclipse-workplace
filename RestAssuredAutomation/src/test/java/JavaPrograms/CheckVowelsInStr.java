package JavaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckVowelsInStr {
	static int c=0;
	public static boolean vowelcheck(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
		
	}
public static void  findVowels(String str) {
	
	for(int i=0; i<str.length(); i++)
	{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
		System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
	}
	}
}
	//2nd Approach using set
	public static void usingSet(String str)
	{
		Set<Character> vowelsSet=new HashSet<>(Arrays.asList('a','e','i','o','u'));
	       StringBuilder vowels=new StringBuilder();
	       
	       for(char ch: str.toLowerCase().toCharArray())
	       {
	           if(vowelsSet.contains(ch))
	           {
	               vowels.append(ch);
	               c++;
	           }
	       }
	        System.out.println("2nd Approach: "+vowels.toString()+" "+c);
	}
	
	//3rd Approach
	public static void countVowelsAndCons(String str)
	{
		int v=0,c=0;
        
      
        for(char ch:str.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                if("aeiou".indexOf(ch)!=-1)v++;
                else c++;
            }
        }
        System.out.println("3rd Approach: vowels: "+v+"  conso: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(vowelcheck("My Name is Kamesh"));

String str="/Ka@mesh$123/";
//findVowels(str);
usingSet(str);
countVowelsAndCons(str);

	}

}
