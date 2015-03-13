package codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static int[] main(int t, int[] is) {
		int[] result = new int[is.length];
		for (int i = 0; i < is.length; i++) {
			result[i] = countZeroes(createFactorial(is[i]));
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		int T = Integer.parseInt(input.readLine());
		for (int t = 0; t < T; t++) {
			long N = Long.parseLong(input.readLine());

			int zeroes = 0;
			int divisor = 5;
			for (int i = 0; i < N; i++) {
				if (N / divisor > 0)
					zeroes += N / divisor;
				else
					break;
				divisor *= 5;
			}
			System.out.println(zeroes);

		}
	}

	public static long createFactorial(int n) {
		long factorial = 1L;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static int countZeroes(long factorial) {
		int count = 0;

		String factorialString = String.valueOf(factorial);
		for (char ch : factorialString.toCharArray()) {
			if (ch == '0') {
				count++;
			}
		}
		return count;
	}
}
