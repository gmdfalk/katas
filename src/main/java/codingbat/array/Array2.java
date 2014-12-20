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
}
