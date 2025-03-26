package JavaPrograms;

public class SwapCharacters {
	public static char[] swapChar(String str,int k) {
		char[]ch=str.toCharArray();
		int start=0, end=ch.length-1;
		for(int i=0; i<ch.length; i+=k)
		{
			int temp=ch[start];
			ch[start]=ch[end];
			ch[end]=(char) temp;
			start++;
			end--;
		}
		return ch;
		
	}
	public static void main(String[] args) {
		String ch="Kameshwar";int k=2;
		//String ch;
		System.out.println(swapChar(ch,k));
	}

}
