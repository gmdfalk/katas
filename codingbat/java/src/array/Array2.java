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

}
