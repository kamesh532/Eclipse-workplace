package JavaPrograms;

import org.testng.reporters.jq.Main;

public class NonRepeatingElements {
	public static void nonRepeated(int a[]) {
		
		int size=a.length, res=0;
		for(int i=0; i<size; i++)
		{
			 res=res^a[i];
	}
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3,3,7,2,5, 5, 7, 4,4 ,9,1};
		nonRepeated(arr);
	}

}
