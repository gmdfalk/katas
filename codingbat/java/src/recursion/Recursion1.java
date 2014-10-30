package recursion;

public class Recursion1 {

	public static Integer factorial( int n ) {
		return n < 2 ? n : n * factorial(n-1);
	}

}
