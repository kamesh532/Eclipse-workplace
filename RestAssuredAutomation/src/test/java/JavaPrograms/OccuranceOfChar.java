package JavaPrograms;

import java.util.HashMap;

public class OccuranceOfChar {
public static void findDupChar(String str)
{
	char[] arr=str.toCharArray();
	HashMap<Character, Integer> hmap= new HashMap<Character, Integer>();
for (char ch : arr) {
	if(!hmap.containsKey(ch))
	{
		hmap.put(ch, 1);
	}
	else
	{
		hmap.put(ch, (hmap.get(ch))+1);
	}
	
}
System.out.println(hmap);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Kameshwar  rao";
findDupChar(str);
	}

}
