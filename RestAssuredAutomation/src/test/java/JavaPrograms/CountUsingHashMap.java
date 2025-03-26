package JavaPrograms;

import java.util.HashMap;

public class CountUsingHashMap {

	public static void countString(String str)
	{
		
		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
		for ( char ch:str.toCharArray() ) {
			if(hmap.containsKey(ch)&&ch != ' ')
			{
				int c = hmap.get(ch);
				hmap.put(ch, c+1);
			}
			else
				hmap.put(ch, 1);
		}
		System.out.println(hmap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s=;
		String str="This This is Kameshwar Rao";
countString(str);
	}

}
