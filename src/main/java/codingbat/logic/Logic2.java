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

	public static int roundSum( int a, int b, int c ) {
		int sum = 0;
		sum += round10( a );
		sum += round10( b );
		sum += round10( c );

		return sum;
	}

	private static int round10( int n ) {
		int rest = n % 10;
		if ( rest <= 5 ) {
			rest = 0;
		} else {
			rest = 10;
		}
		return ( n / 10 ) * 10 + rest;
	}

	public static boolean closeFar( int a, int b, int c ) {
		if ( isClose( a, b ) ) {
			return isFar( c, a, b );
		}
		if ( isClose( a, c ) ) {
			return isFar( b, a, c );
		}
		return false;
	}

	private static boolean isClose( int n, int j ) {
		return Math.abs( j - n ) < 2;
	}

	private static boolean isFar( int n, int j, int k ) {
		return Math.abs( j - n ) > 1 && Math.abs( k - n ) > 1;
	}

	public static int blackjack( int i, int j ) {
		final int max = Math.max( i, j );
		final int min = Math.min( i, j );
		return max <= 21 ? max : min <= 21 ? min : 0;
	}

	public static boolean evenlySpaced( int a, int b, int c ) {
		final int[] arr = new int[] { a, b, c };
		Arrays.sort( arr );
		return ( arr[1] - arr[0] ) == ( arr[2] - arr[1] );
	}
}
