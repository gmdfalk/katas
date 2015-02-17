package codingbat.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3 {

	public static int countYZ( final String string ) {
		final String[] arr = string.split( "[^A-Za-z]" );
		int count = 0;
		for ( final String s : arr ) {
			if ( s.toLowerCase().endsWith( "y" ) || s.toLowerCase().endsWith( "z" ) ) {
				count++;
			}
		}
		return count;
	}

	public static String withoutString( final String base, final String del ) {
		// ?i adds case insensitivity.
		return base.replaceAll( "(?i)" + del, "" );
	}

	public static boolean equalIsNot( final String string ) {
		final Matcher isMatcher = Pattern.compile( "is" ).matcher( string );
		final Matcher notMatcher = Pattern.compile( "not" ).matcher( string );
		int isCount = 0, notCount = 0;
		while ( isMatcher.find() ) {
			isCount++;
		}
		while ( notMatcher.find() ) {
			notCount++;
		}
		return isCount == notCount;
	}

	public static boolean gHappy( final String string ) {
		for ( int i = 0; i < string.length(); i++ ) {
			if ( string.charAt( i ) == 'g' ) {
				if ( string.charAt( i - 1 ) != 'g' && string.charAt( i + 1 ) != 'g' ) {
					return false;
				}
			}
		}
		return true;
	}

	public static int countTriple( final String string ) {
		int count = 0;
		for ( int i = 0; i < string.length() - 2; i++ ) {
			if ( string.charAt( i ) == string.charAt( i + 1 ) && string.charAt( i ) == string.charAt( i + 2 ) ) {
				count++;
			}
		}
		return count;
	}

	public static int sumDigits( String string ) {
		int sum = 0;
		string = string.replaceAll( "[^\\d]", "" );
		for ( int i = 0; i < string.length(); i++ ) {
			sum += Integer.parseInt( string.substring( i, i + 1 ) );
		}
		return sum;
	}

	public static String sameEnds( final String string ) {
		final String sub = "";
		final int len = string.length();
		final int halfLen = len / 2;

		String left, right;
		for ( int i = 0; i < halfLen; i++ ) {
			left = string.substring( 0, halfLen - i );
			if ( string.length() % 2 == 0 ) {
				right = string.substring( halfLen + i, len );
			} else {
				right = string.substring( halfLen + 1 + i, len );
			}
			if ( left.equals( right ) ) {
				return left;
			}
		}
		return "";
	}

	public static String mirrorEnds( final String string ) {
		String result = "";
		final int len = string.length();
		for ( int i = 0, j = len - 1; i < len; i++, j-- ) {
			if ( string.charAt( i ) == string.charAt( j ) ) {
				result += string.charAt( i );
			} else {
				break;
			}
		}
		return result;
	}

	private static boolean isOdd( final int i ) {
		return i % 2 != 0;
	}
}
