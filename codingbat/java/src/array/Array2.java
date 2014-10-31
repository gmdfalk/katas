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
		int min = is[0], max = is[0];

		for ( final int i : is ) {
			min = Math.min( min, i );
			max = Math.max( max, i );
		}
		return max - min;
	}

}
