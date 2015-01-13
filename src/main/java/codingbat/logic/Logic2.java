package codingbat.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Logic2 {
	public static Boolean makeBricks( final int small, final int big, final int goal ) {
		for ( int i = 1; i <= small; i++ ) {
			if ( i == goal ) {
				return true;
			}
			for ( int j = 1; j <= big; j++ ) {
				final int bigBrickLength = j * 5;
				if ( bigBrickLength == goal || i + bigBrickLength == goal ) {
					return true;
				}
			}
		}
		return false;
	}

	public static int loneSum( final int a, final int b, final int c ) {
		// Trying out Java 8, horribly.
		final List<Integer> list = Arrays.asList( a, b, c );
		final List<Integer> uniques = new ArrayList<Integer>();
		list.stream().filter( i -> isUnique( i, list ) ).forEach( ( i ) -> uniques.add( i ) );
		return uniques.stream().mapToInt( i -> i ).sum();
	}

	private static boolean isUnique( final int n, final List<Integer> is ) {
		int count = 0;
		for ( final int i : is ) {
			if ( i == n ) {
				count++;
			}
		}

		return count < 2;
	}
}
