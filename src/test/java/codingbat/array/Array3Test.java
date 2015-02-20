package codingbat.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Array3Test {

	@Test
	public void testCountEvens() {
		assertThat( Array3.maxSpan( new int[] { 1, 2, 1, 1, 3 } ), is( 4 ) );
		assertThat( Array3.maxSpan( new int[] { 1, 4, 2, 1, 4, 1, 4 } ), is( 6 ) );
		assertThat( Array3.maxSpan( new int[] { 1, 4, 2, 1, 4, 4, 4 } ), is( 6 ) );
	}
}
