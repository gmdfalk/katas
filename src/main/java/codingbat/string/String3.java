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
}
