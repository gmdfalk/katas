package ap;

public class AP1 {

	public static boolean scoresIncreasing( final int[] is ) {
		for ( int i = 1; i < is.length; i++ ) {
			if ( is[i] >= is[i - 1] ) {
				return true;
			}
		}
		return false;
	}

	public static boolean scores100( final int[] is ) {
		for ( int i = 0; i < is.length - 1; i++ ) {
			if ( is[i] == 100 && is[i + 1] == 100 ) {
				return true;
			}

		}
		return false;
	}

	public static boolean scoresClump( final int[] is ) {
		for ( int i = 0; i < is.length - 2; i++ ) {
			if ( is[i + 2] - is[i] <= 2 && is[i + 1] - is[i] <= 2 ) {
				return true;
			}
		}
		return false;
	}

	public static int scoresAverage( final int[] is ) {
		final int mid = is.length / 2;
		final int avg1 = average( is, 0, mid );
		final int avg2 = average( is, mid, is.length );
		return Math.max( avg1, avg2 );
	}

	private static int average( final int[] scores, final int start, final int end ) {
		int result = 0;
		for ( int i = start; i < end; i++ ) {
			result += scores[i];
		}
		return result / ( end - start );
	}

	public static int wordsCount( final String[] strings, final int i ) {
		int counter = 0;
		for ( final String s : strings ) {
			if ( s.length() == i ) {
				counter++;
			}
		}
		return counter;
	}

}
