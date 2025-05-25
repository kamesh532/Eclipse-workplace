package JavaPrograms;

public class ReversString {
	public static void reverse(String str)
	{
		int len=str.length();
		String rev="";
		for(int i=len-1; i>=0; i--)
		{
			 rev=rev+str.charAt(i);
			 
		}
		System.out.println("1st approach: "+rev);
	}
	
	
	//2nd approach
	
public static void reverseStr(String str) {
	 char []ch=str.toCharArray();
     int left=0,right=str.length()-1;
     while(left<right)
     {
         char temp=ch[left];
         ch[left++]=ch[right];
         ch[right--]=temp;
     }
    
     System.out.println("2nd approach: "+ch);
     
     }

public static void reverseWords(String str)
{
	String []words=str.split(" ");
	StringBuilder sb=new  StringBuilder();
	for(String word:words)
	{
		sb.append(word).reverse().append(" ").toString();
	}
	System.out.println(sb.toString());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Kamesh war";
reverse(str);
reverseStr(str);
reverseWords(str);
	}

}
