package codechef.easy;

import java.util.Arrays;

public class TurboSort {

	public static int[] main(int[] is) {
		Arrays.sort(is);
		return is;
	}

	public static int[] main2(int[] is) {
		int tmp;
		for (int n = 0; n < is.length; n++) {
			for (int i = 0; i < is.length - 1; i++) {
				if (is[i] > is[i + 1]) {
					tmp = is[i + 1];
					is[i + 1] = is[i];
					is[i] = tmp;
				}
			}
		}
		return is;
	}

}
