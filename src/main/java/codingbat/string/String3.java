package codingbat.string;

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

}
