package JavaPrograms;

public class PrimeOrNot {

	public static void checkPrime(int n) {
		int f = 1;
		for (int i = 2; i < n/2; i++) {

			if (n % i == 0) {
				f = 1;
				//
			} else
				f = 0;
			// System.out.println(n + " number is not prime");
		}
		if (f == 0)
			System.out.println(n + " number is prime");
		else
			System.out.println(n + " number is not prime");

	}

	public static void printNthPrime(int num) {

		for (int i = 2; i <= num; i++) {
			boolean isPrime = false;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime == false)
				System.out.println(i);

		}

	}

	public static void main(String[] args) {
		int n = 445;
		int num = 20;
		checkPrime(n);
		printNthPrime(num);
	}
}
