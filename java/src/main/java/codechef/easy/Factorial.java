package codechef.easy;

public class Factorial {

	public static int[] main(int T, int[] nums) {
		int[] result = new int[nums.length];
		int zeroes, divisor, quotient, n;
		for (int i = 0; i < nums.length; i++) {
			zeroes = 0;
			divisor = 5;
			n = nums[i];
			for (int j = 0; j < n; j++) {
				quotient = n / divisor;
				if (quotient > 0) {
					zeroes += quotient;
				} else {
					break;
				}
				divisor *= 5;
			}
			result[i] = zeroes;
		}
		return result;
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
