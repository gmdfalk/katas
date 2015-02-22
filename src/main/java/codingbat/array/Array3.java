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

	public static int[] fix34( final int[] nums ) {
		int swap;
		int indexOfThree = 0, indexOfFour = 0;
		final int[] result = new int[nums.length];
		System.arraycopy( nums, 0, result, 0, nums.length );
		while ( ( indexOfThree = findIndexOf( 3, nums, indexOfThree ) ) != -1 ) {
			indexOfFour = findIndexOf( 4, nums, indexOfFour );
			swap = nums[indexOfThree + 1];
			result[indexOfThree + 1] = nums[indexOfFour];
			result[indexOfFour] = swap;
			indexOfThree++;
			indexOfFour++;
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
