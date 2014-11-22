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

}
