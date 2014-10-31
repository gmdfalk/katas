package array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Array2Test {

	@Test
	public void testCountEvens() {
		assertThat( Array2.countEvens( new int[] { 2, 1, 2, 3, 4 } ), is( 3 ) );
		assertThat( Array2.countEvens( new int[] { 2, 2, 0 } ), is( 3 ) );
		assertThat( Array2.countEvens( new int[] { 1, 3, 5 } ), is( 0 ) );
	}

}
