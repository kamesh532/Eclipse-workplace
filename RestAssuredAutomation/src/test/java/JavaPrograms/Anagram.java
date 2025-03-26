package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void findAnagram(String s1, String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("not Anagram");
		}
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)==true) {
			System.out.println("Anagram");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Madam",s2="Adam ";
findAnagram(s1, s2);
	}

}
