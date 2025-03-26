package JavaPrograms;

public class FindArray {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	public static void findRangeArray(int a[]) {
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 4, 6, 9, 5 };
		findRangeArray(a);
	}

}
