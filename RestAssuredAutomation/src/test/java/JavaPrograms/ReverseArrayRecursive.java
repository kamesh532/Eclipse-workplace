package JavaPrograms;

public class ReverseArrayRecursive {
	//using Normal method
	public static void reverseArrayNormal(int a[]) {
		System.out.println("Before reverse");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(" "+a[i]);
			
		}
		System.out.println("After reverse:");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(" "+a[i]);
		}
	}
	
	//using Recursive Method 1,2,3
	
	public static void reverseRecursive(int a[], int start, int end) {
		if(start>=end)
		{
			return;
		}
		int temp=a[start];//temp=1
		a[start]=a[end];//start=3
		a[end]=a[temp];//end=1
		//recursively reverse the subarray
		reverseRecursive(a, start+1, end-1);
		//System.out.println();
	}
	public static void main(String[] args) {
		int a[]= {2,5,7,8,9};
		//reverseArrayNormal(a);
		reverseRecursive(a, 0, a.length-1);
		for (int i : a) {
			System.out.print(" "+i);
		}
	}

}
