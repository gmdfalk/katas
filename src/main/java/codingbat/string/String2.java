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

}
