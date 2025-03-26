package JavaPrograms;

import java.util.Arrays;

public class TwoArrEqualOrNot {
	public static void twoArray(int a[], int b[])
	{
		boolean res=Arrays.equals(a, b);
		if(res==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5};
		int b[]= {1,2,3,4,5};
//		for(int i=0; i<a.length; i++)
//		{
//			 System.out.print(a[i] + " ");
//		}
//		for (int i = 0; i < b.length; i++)
//            System.out.print(b[i] + " ");
//
//        System.out.println();
    twoArray(a, b);
		//System.out.println(a.toString()+" and "+b.toString()+ " are ");
		}
	

}
