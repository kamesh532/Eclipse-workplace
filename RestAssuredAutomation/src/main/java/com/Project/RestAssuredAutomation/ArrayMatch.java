package com.Project.RestAssuredAutomation;

public class ArrayMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 8, 3, 0, 4, 2, 6 };
		boolean match = false;
		int[] array2 = { 7, 6, 3, 8, 5, 1, 4, 0, 9 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Match " + array1[i]);
					match = true;
					break;
				}
//		if(!match)
//			System.out.println("UnMatch "+array1[i]);
			}

		}
		for(int i=0; i<array2.length; i++)
		{
			for(int j=0; j<array1.length; j++)
			{
				if(array1[i]==array2[j])
				{
					
					match=true;
					break;
				}
//				if(!match)
//					System.out.println("UnMatch "+array1[2]);
			}
			System.out.println("UnMatch "+array2[i]);
	}

}
}
