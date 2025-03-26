package JavaPrograms;

public class ReverseStringWithoutChangePosition {

	public static void reverseStrwithout(String str)
	{
		String[] arr=str.split(" ");
		String rev="";
		for(int i=0; i<arr.length; i++)
		{
			for(int j=arr[i].length()-1; j>=0; j--)
			{
				rev+=arr[i].charAt(j);
			}
			
			//System.out.println(" ");
		}
		System.out.print(" "+rev+" ");
		System.out.print(" ");
	}
	public static void main(String[] args) {
String str="My name is Kamesh";
reverseStrwithout(str);
	}

}
