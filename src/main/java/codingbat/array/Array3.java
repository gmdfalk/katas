package codingbat.array;

public class Array3 {

	public static int maxSpan( final int[] nums ) {
		int span = 0;
		final int len = nums.length < 2 ? 0 : nums.length - 1;
		for ( int i = 0; i < nums.length; i++ ) {
			for ( int j = len; j >= 0; j-- ) {
				if ( nums[i] == nums[j] ) {
					span = Math.max( span, ( j - i ) + 1 );
				}
			}
		}
		return span;
	}

	public static int[] fix34( final int[] is ) {
		int threeStart = 0, fourStart = 0;
		int indexOfThree, indexOfFour;
		int swap;
		final int[] result = new int[is.length];
		System.arraycopy( is, 0, result, 0, is.length );
		while ( ( indexOfThree = findIndexOf( 3, is, threeStart ) ) != -1 ) {
			indexOfFour = findIndexOf( 4, is, fourStart );
			swap = is[indexOfThree + 1];
			result[indexOfThree + 1] = is[indexOfFour];
			result[indexOfFour] = swap;
			threeStart = indexOfThree + 1;
			fourStart = indexOfFour + 1;
		}
		return result;
	}

	private static int findIndexOf( final int n, final int[] is, final int start ) {
		for ( int i = start; i < is.length; i++ ) {
			if ( is[i] == n ) {
				return i;
			}
		}
		return -1;
	}
}
