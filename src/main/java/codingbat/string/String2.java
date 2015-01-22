package codingbat.string;

public class String2 {

	public static String doubleChar( String string ) {
		String result = "";
		for ( int i = 0; i < string.length(); i++ ) {
			result += string.charAt( i );
			result += string.charAt( i );
		}
		return result;
	}

	public static int countHi( String string ) {
		System.out.println( string );
		if ( string.length() < 2 ) {
			return 0;
		}

		final boolean containsHi = string.substring( 0, 2 ).equals( "hi" );
		return ( containsHi ? 1 : 0 ) + countHi( string.substring( 1 ) );
	}

}
