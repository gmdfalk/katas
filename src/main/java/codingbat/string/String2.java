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
		System.out.println( string );
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

}
