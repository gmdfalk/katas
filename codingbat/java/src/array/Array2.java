package array;

public class Array2 {

	public static int countEvens( final int[] is ) {
		int count = 0;
		for ( final int i : is ) {
			if ( i % 2 == 0 ) {
				count++;
			}
		}
		return count;
	}

	public static int bigDiff( final int[] is ) {
		int min = is[0];
		int max = is[0];
		min = getMin( is, min );
		max = getMax( is, min );

		return max - min;
	}

	private static int getMin( final int[] is, int min ) {
		for ( final int i : is ) {
			min = Math.min( min, i );
		}
		return min;
	}

	private static int getMax( final int[] is, int max ) {
		for ( final int i : is ) {
			max = Math.max( max, i );
		}
		return max;
	}

	public static int centeredAverage( final int[] is ) {
		int min = is[0], max = is[0], result = 0;

		for ( final int i : is ) {
			min = Math.min( min, i );
			max = Math.max( max, i );
			result += i;
		}

		return ( result - max - min ) / ( is.length - 2 );
	}
}
