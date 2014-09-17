package array1;

public class Array1 {

	public static Boolean firstLast6(int[] is) {
		return is[0] == 6 || is[is.length-1] == 6;
	}

	public static Boolean sameFirstLast(int[] is) {
		return is[0] == is[is.length-1];
	}

	public static int[] makePi() {
		return new int[] {3,1,4};
	}

}
