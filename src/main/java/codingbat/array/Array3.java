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

	public static boolean canBalance( final int[] array ) {
		for ( int i = 0; i < array.length; i++ ) {
			if ( sumArray( 0, i, array ) == sumArray( i, array.length, array ) ) {
				return true;
			}
		}
		return false;
	}

	private static int sumArray( final int start, final int end, final int[] array ) {
		int sum = 0;
		for ( int i = start; i < end; i++ ) {
			sum += array[i];
		}
		return sum;
	}

	public static boolean linearIn( final int[] outer, final int[] inner ) {
		int innerIndex = 0;
		int outerIndex = 0;
		while ( innerIndex < inner.length && outerIndex < outer.length ) {
			if ( outer[outerIndex] == inner[innerIndex] ) {
				outerIndex++;
				innerIndex++;
			} else {
				outerIndex++;
			}
		}
		return innerIndex == inner.length;
	}

	public static int[] squareUp( final int n ) {
		final int[] result = new int[n * n];
		final int[] pool = new int[n];
		for ( int i = n - 1; i >= 0; i-- ) {
			pool[i] = n - i;
		}
		int start = n - 1, end = 0;
		for ( int i = n - 1; i >= 0; i-- ) {
			System.arraycopy( pool, i, result, start, end + 1 );
			start += n - 1;
			end++;
		}
		return result;
	}
}
