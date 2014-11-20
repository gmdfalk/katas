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

}
