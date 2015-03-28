package codechef.easy;

public class YetAnotherNumberGame {

	public static String main(int n) {
		if (isEven(n)) {
			return "ALICE";
		} else {
			return "BOB";
		}
	}
	
	private static boolean isEven(int n) {
		return (n & 1) == 0;
	}
}
