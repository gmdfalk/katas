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

	public static boolean equalIsNot(String string) {
		Matcher isMatcher = Pattern.compile("is").matcher(string);
		Matcher notMatcher = Pattern.compile("not").matcher(string);
		int isCount = 0, notCount = 0;
		while (isMatcher.find()) {
			isCount++;
		}
		while (notMatcher.find()) {
			notCount++;
		}
		return isCount == notCount;
	}

}
