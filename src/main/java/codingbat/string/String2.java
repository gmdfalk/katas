package codingbat.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {

	public static String doubleChar( final String string ) {
		String result = "";
		for ( int i = 0; i < string.length(); i++ ) {
			result += string.charAt( i );
			result += string.charAt( i );
		}
		return result;
	}

	public static int countHi( final String string ) {
		if ( string.length() < 2 ) {
			return 0;
		}

		final boolean containsHi = string.substring( 0, 2 ).equals( "hi" );
		return ( containsHi ? 1 : 0 ) + countHi( string.substring( 1 ) );
	}

	public static boolean catDog( final String string ) {
		final int catCount = countOccurrence( "cat", string );
		final int dogCount = countOccurrence( "dog", string );
		return catCount == dogCount;
	}

	private static int countOccurrence( final String sub, final String source ) {
		int count = 0;
		for ( int i = 0; i < source.length() - sub.length() + 1; i++ ) {
			if ( source.substring( i, ( i + sub.length() ) ).equals( sub ) ) {
				count++;
			}
		}
		return count;
	}

	public static int countCode( final String string ) {
		final Matcher matcher = Pattern.compile( "co.e" ).matcher( string );
		int count = 0;
		while ( matcher.find() ) {
			count++;
		}
		return count;
	}

	public static boolean endOther( String s1, String s2 ) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		return s1.endsWith( s2 ) || s2.endsWith( s1 );
	}

	public static boolean xyzThere( final String string ) {
		if ( string.contains( "xyz" ) ) {
			return !string.contains( ".xyz" );
		}
		return false;
	}

	public static boolean bobThere( final String string ) {
		return string.matches( ".*b.b.*" );
	}

	public static boolean xyBalance( final String string ) {
		boolean balanced = true;
		for ( int i = 0; i < string.length(); i++ ) {
			if ( string.charAt( i ) == 'x' ) {
				balanced = false;
			}
			else if ( string.charAt( i ) == 'y' ) {
				balanced = true;
			}
		}
		return balanced;
	}

	public static String mixString( final String s1, final String s2 ) {
		String mixedString = "";
		for ( int i = 0; i < s2.length(); i++ ) {
			if ( i < s1.length() ) {
				mixedString += s1.charAt( i );
			}
			mixedString += s2.charAt( i );
		}
		return mixedString;
	}

	public static String repeatEnd( final String s, final int n ) {
		String result = "";
		for ( int i = 0; i < n; i++ ) {
			result += s.substring( s.length() - n );
		}
		return result;
	}

	public static String repeatFront( final String s, int n ) {
		String result = "";
		while ( n > 0 ) {
			result += s.substring( 0, n );
			n--;
		}
		return result;
	}

	public static String repeatSeparator( final String word, final String separator, final int count ) {
		final StringBuilder builder = new StringBuilder( 30 );
		for ( int i = 0; i < count; i++ ) {
			builder.append( word );
			if ( i < count - 1 ) {
				builder.append( separator );
			}
		}
		return builder.toString();
	}

	public static boolean prefixAgain( final String string, final int n ) {
		final String prefix = string.substring( 0, n );
		return string.substring( n ).contains( prefix );
	}

	public static boolean xyzMiddle( final String string, final int n ) {
		final int idx = string.indexOf( "xyz" );
		final int lenLeft = string.substring( 0, idx ).length();
		final int lenRight = string.substring( idx + 3 ).length();
		return Math.abs( lenLeft - lenRight ) < 2;
	}

	public static String getSandwich( final String string ) {
		final int start = string.indexOf( "bread" ) + 5;
		final int end = string.lastIndexOf( "bread" );
		if ( end < start ) {
			return "";
		}
		return string.substring( start, end );
	}

	public static boolean sameStarChar( final String string ) {
		for ( int i = 1; i < string.length() - 1; i++ ) {
			if ( string.charAt( i ) == '*' ) {
				if ( string.charAt( i - 1 ) != string.charAt( i + 1 ) ) {
					return false;
				}
			}
		}
		return true;
	}

	public static String zipZap( final String string ) {
		return string.replaceAll( "z.p", "zp" );
	}

	public static String starOut( final String string ) {
		return string.replaceAll( "\\w?\\*\\w?", "" );
	}

}
