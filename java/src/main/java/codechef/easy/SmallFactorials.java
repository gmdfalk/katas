package codechef.easy;

public class SmallFactorials {

	public static long main(int i) {
		return createFactorial(i);
	}
	

	public static long createFactorial(int n) {
		long factorial = 1L;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
