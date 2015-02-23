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
		final int[] numsCopy = new int[nums.length];
		System.arraycopy( nums, 0, numsCopy, 0, nums.length );
		while ( ( indexOfThree = findIndexOf( 3, numsCopy, indexOfThree ) ) != -1 ) {
			indexOfFour = findIndexOf( 4, numsCopy, indexOfFour );
			swap = nums[indexOfThree + 1];
			nums[indexOfThree + 1] = nums[indexOfFour];
			nums[indexOfFour] = swap;
			indexOfThree++;
			indexOfFour++;
		}
		return nums;
	}

	private static int findIndexOf( final int n, final int[] is, final int start ) {
		for ( int i = start; i < is.length; i++ ) {
			if ( is[i] == n ) {
				return i;
			}
		}
		return -1;
	}

	public static int[] fix45( final int[] nums ) {
		int swap;
		int indexOfFour = 0, indexOfFive = 0;
		final int[] numsCopy = new int[nums.length];
		System.arraycopy( nums, 0, numsCopy, 0, nums.length );
		while ( ( indexOfFour = findIndexOf( 4, numsCopy, indexOfFour ) ) != -1 ) {
			indexOfFive = findIndexOf( 5, numsCopy, indexOfFive );
			swap = nums[indexOfFour + 1];
			nums[indexOfFour + 1] = nums[indexOfFive];
			nums[indexOfFive] = swap;
			indexOfFour++;
			indexOfFive++;
		}
		return nums;
	}
}
