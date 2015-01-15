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
		final List<Integer> baseList = Arrays.asList( a, b, c );
		final List<Integer> uniqueList = new ArrayList<Integer>();
		baseList.stream().filter( i -> isUnique( i, baseList ) ).forEach( ( i ) -> uniqueList.add( i ) );
		return uniqueList.stream().mapToInt( i -> i ).sum();
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

	public static int luckySum( final int a, final int b, final int c ) {
		int result = 0;
		for ( final int i : new int[] { a, b, c } ) {
			if ( i == 13 ) {
				break;
			}
			result += i;
		}
		return result;
	}

	public static int noTeenSum( int a, int b, int c ) {
		int result = 0;
		result += fixTeen( a );
		result += fixTeen( b );
		result += fixTeen( c );
		return result;
	}

	private static int fixTeen( int c ) {
		return Arrays.asList( 13, 14, 17, 18, 19 ).contains( c ) ? 0 : c;
	}
}
