package intro;

import java.util.List;

public class PrimeNumber {
	public static void main(String[] args) {

		int n = 50;
		System.out.println("Following are the alternate " + "prime number smaller than " + "or equal to " + n);
		print_alternate_prime(n);
	}
	static int prime(int num) {
		int i, numcount = 0;
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				numcount = 1;
				break;
			}
		}
		if (numcount == 0)
			return 1;
		else
			return 0;
	}
	static void print_alternate_prime(int n) {
		int counter = 0;
		for (int num = 2; num < n; num++) {
			if (prime(num) == 1) {
				if (counter % 2 == 0)
					System.out.print(num + " ");
				counter++;
			}
		}
	}
}
