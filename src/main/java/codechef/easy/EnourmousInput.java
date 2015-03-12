package codechef.easy;

public class EnourmousInput {

	public static Object main(int n, int k, int[] ks) {
		int divisorSum = 0;
		for (int i : ks) {
			if (i % k == 0) {
				divisorSum++;
			}
		}
		return divisorSum;
	}

}
