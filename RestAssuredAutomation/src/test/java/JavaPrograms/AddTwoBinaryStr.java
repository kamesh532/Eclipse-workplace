package JavaPrograms;

public class AddTwoBinaryStr {

	public static void addBinaries(String a, String b)
	{
		int n1=Integer.parseInt(a, 2);
		int n2=Integer.parseInt(b, 2);
		int sum=n1+n2;
		
		//convert decimal to binary
		String res=Integer.toBinaryString(sum);
		System.out.println("sum of: "+a+" and  "+b+" is "+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addBinaries("011011", "1010111");

	}

}
