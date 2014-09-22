package array1;

public class Array1 {

	public static Boolean firstLast6(int[] is) {
		return is[0] == 6 || is[is.length - 1] == 6;
	}

	public static Boolean sameFirstLast(int[] is) {
		return is[0] == is[is.length - 1];
	}

	public static int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public static Boolean commonEnd(int[] is, int[] is2) {
		return is[0] == is2[0] || is[is.length - 1] == is2[is2.length - 1];
	}

	public static Integer sum3(int[] is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++)
			sum += is[i];
		return sum;
	}

	public static int[] rotateLeft3(int[] is) {
		int[] result = new int[is.length];
		for (int i = 0; i < is.length; i++) {
			if (i == 0) {
				result[is.length - 1] = is[i];
			} else {
				result[i - 1] = is[i];
			}
		}
		return result;
	}

	public static int[] reverse3(int[] is) {
		int[] result = new int[is.length];
		for (int i = 0; i < is.length; i++) {
			result[i] = is[is.length - i - 1];
		}
		return result;
	}

	public static int[] maxEnd3(int[] is) {
		int max = Math.max(is[0], is[2]);
		return new int[] { max, max, max };
	}

	public static Integer sum2(int[] is) {
		int sum = 0;
		for (int i = 0; i < is.length && i < 2; i++) {
			sum += is[i];

		}
		return sum;
	}

	public static int[] middleWay(int[] is, int[] is2) {
		return new int[] {is[is.length/2], is2[is2.length/2]};
	}

	public static int[] makeEnds(int[] is) {
		return new int[] {is[0], is[is.length-1]};
	}

}
