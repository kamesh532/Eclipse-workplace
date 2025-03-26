package JavaPrograms;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(vowelcheck("My Name is Kamesh"));

String str="My Name is Kamesh";
findVowels(str);
	}

}
