package codingbat.array;

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

		for ( final int i : is ) {
			min = Math.min( min, i );
			max = Math.max( max, i );
		}

		return max - min;
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

	public static int sum13( final int[] is ) {
		int result = 0;
		for ( final int i : is ) {
			if ( i == 13 ) {
				break;
			}
			result += i;
		}
		return result;
	}

	public static int sum67( final int[] is ) {
		int result = 0;
		boolean ignore = false;
		for ( final int i : is ) {
			if ( i == 6 ) {
				ignore = true;
			} else if ( ignore && i == 7 ) {
				ignore = false;
				continue;
			}
			if ( ignore ) {
				continue;
			}
			result += i;
		}
		return result;
	}

	public static boolean has22( final int[] is ) {
		for ( int i = 0; i < is.length - 1; i++ ) {
			if ( is[i] == 2 && is[i + 1] == 2 ) {
				return true;
			}
		}
		return false;
	}

	public static boolean lucky13(final int[] is) {
		for (final int i : is) {
			if (i == 1 || i == 3) {
				return false;
			}
		}
		return true;
	}

	public static boolean sum28( final int[] is ) {
		int result = 0;
		for ( final int i : is ) {
			if ( i == 2 ) {
				result += i;
			}
		}
		return result == 8;
	}

	public static boolean more14( final int[] is ) {
		int ones = 0, fours = 0;

		for ( final int i : is ) {
			if ( i == 1 ) {
				ones++;
			} else if ( i == 4 ) {
				fours++;
			}
		}

		return ones > fours;
	}

	public static int[] fizzArray( final int len ) {
		final int[] result = new int[len];
		int n = 0;

		for ( int i = 0; i < len; i++ ) {
			result[i] = n;
			n++;
		}
		return result;
	}

	public static boolean only14( final int[] is ) {
		for ( final int i : is ) {
			if ( i != 1 && i != 4 ) {
				return false;
			}
		}
		return true;
	}

	public static String[] fizzArray2(final int len) {
		final String[] result = new String[len];

		for (int i=0; i < len; i++) {
			result[i] = String.valueOf(i);
		}

		return result;
	}

	public static boolean no14( final int[] is ) {
		boolean has1 = false;
		boolean has4 = false;

		for ( final int i : is ) {
			if ( i == 1 ) {
				has1 = true;
			}
			if ( i == 4 ) {
				has4 = true;
			}
		}

		return !has1 || !has4;
	}

	public static boolean isEverywhere( final int[] is, final int n ) {
		for ( int i = 0; i < is.length - 1; i++ ) {
			if ( is[i] != n && is[i + 1] != n ) {
				return false;
			}
		}
		return true;
	}

	public static boolean either24( final int[] is ) {
		boolean found2 = false;
		boolean found4 = false;

		for ( int i = 0; i < is.length - 1; i++ ) {
			if ( is[i] == 2 && is[i + 1] == 2 ) {
				found2 = true;
			}
			if ( is[i] == 4 && is[i + 1] == 4 ) {
				found4 = true;
			}
		}

		return found2 ^ found4;
	}

	public static int matchUp(final int[] numsA, final int[] numsB) {
		int result = 0;
		int a, b;
		for (int i=0; i < numsA.length; i++) {
			a = numsA[i];
			b = numsB[i];
			if (a != b && Math.abs(a-b) < 3) {
				result++;
			}
		}
		return result;
	}

	public static boolean has77(final int[] is) {
		boolean a, b, c;
		for (int i=0; i < is.length-2; i++) {
			a = is[i] == 7;
			b = is[i+1] == 7;
			c = is[i+2] == 7;
			if (a && b || b && c || a && c) {
				return true;
			}
		}
		return false;
	}

	public static boolean has12( final int[] is ) {
		boolean has1 = false;

		for ( final int i : is ) {
			if ( i == 1 ) {
				has1 = true;
			}
			if ( has1 && i == 2 ) {
				return true;
			}
		}
		return false;
	}

	private static boolean isEven( final int n ) {
		return n % 2 == 0;
	}

	private static boolean areEven( final int a, final int b, final int c ) {
		return isEven( a ) && isEven( b ) && isEven( c );
	}

	private static boolean areOdd( final int a, final int b, final int c ) {
		return !isEven( a ) && !isEven( b ) && !isEven( c );
	}

	public static boolean modThree( final int[] is ) {
		boolean areEven, areOdd;
		for (int i=0; i < is.length-2; i++) {
			areEven = areEven( is[i], is[i + 1], is[i + 2] );
			areOdd = areOdd( is[i], is[i + 1], is[i + 2] );
			if ( areEven || areOdd ) {
				return true;
			}
		}
		return false;
	}

}
