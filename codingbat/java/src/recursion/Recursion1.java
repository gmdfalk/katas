package recursion;

public class Recursion1 {

	public static Integer factorial( int n ) {
		return n < 2 ? n : n * factorial( n - 1 );
	}

	public static Integer bunnyEars( int n ) {
		return n < 1 ? 0 : 2 + bunnyEars( n - 1 );
	}

	public static Integer fibonacciLoop( int n ) {
		int a = 0, b = 1, temp;
		for ( int i = 1; i < n; i++ ) {
			temp = b;
			b = a + b;
			a = temp;
		}
		return n < 2 ? n : b;
	}

	public static Integer fibonacci( int n ) {
		int a = 0, b = 1, temp;
		for ( int i = 1; i < n; i++ ) {
			temp = b;
			b = a + b;
			a = temp;
		}
		return n < 2 ? n : fibonacci( n - 1 ) + fibonacci( n - 2 );
	}

	public static Integer bunnyEars2( int n ) {
		return n < 1 ? 0 : individualEars( n ) + bunnyEars2( n - 1 );
	}

	private static int individualEars( int n ) {
		return isEven( n ) ? 3 : 2;
	}

	private static boolean isEven( int n ) {
		return n % 2 == 0;
	}

}
