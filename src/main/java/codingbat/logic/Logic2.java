package codingbat.logic;

public class Logic2 {
	public static Boolean makeBricks( final int small, final int big, final int goal ) {
		for ( int i = 1; i <= small; i++ ) {
			if ( i == goal ) {
				return true;
			}
			for ( int j = 1; j <= big; j++ ) {
				final int bigBrickLength = j * 5;
				if ( bigBrickLength == goal || i + bigBrickLength == goal ) {
					return true;
				}
			}
		}
		return false;
	}

}
