package JavaPrograms;

public class SwappingNums {
	public static void swapNumUsingThird(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapusing third variable  a: " + a + " b: " + b);
	}

	public static void swapWithoutTird(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap without using third variable  a: " + a + " b: " + b);

	}

	public static void main(String[] args) {
		int a = 5, b = 4;
		System.out.println("Before swapusing third variable a: " + a + " b: " + b);
		swapNumUsingThird(a, b);
		System.out.println("------------------------------------");
		System.out.println("Before swap without using third variable a: " + a + " b: " + b);
		swapWithoutTird(a, b);
	}

}
