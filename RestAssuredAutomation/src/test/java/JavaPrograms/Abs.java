package JavaPrograms;

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is kamesh",rev="";
		
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev+=str.charAt(i);
			StringBuilder sb=new StringBuilder(rev);
			
		}
		System.out.println(rev);
		int i=123;
		int j=45;
		
	//String str1= String.valueOf(i);
	int c=i+j;
	System.out.println(c);

	}

}
