package codingbat.array;

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

	@Test
	public void testBigDiff() {
		assertThat( Array2.bigDiff( new int[] { 10, 3, 5, 6 } ), is( 7 ) );
		assertThat( Array2.bigDiff( new int[] { 7, 2, 10, 9 } ), is( 8 ) );
		assertThat( Array2.bigDiff( new int[] { 2, 10, 7, 2 } ), is( 8 ) );
	}

	@Test
	public void testCenteredAverage() {
		assertThat( Array2.centeredAverage( new int[] { 1, 2, 3, 4, 100 } ), is( 3 ) );
		assertThat( Array2.centeredAverage( new int[] { 1, 1, 5, 5, 10, 8, 7 } ), is( 5 ) );
		assertThat( Array2.centeredAverage( new int[] { -10, -4, -2, -4, -2, 0 } ), is( -3 ) );
	}

	@Test
	public void testSum13() {
		assertThat( Array2.sum13( new int[] { 1, 2, 2, 1 } ), is( 6 ) );
		assertThat( Array2.sum13( new int[] { 1, 1} ), is( 2 ) );
		assertThat( Array2.sum13( new int[] { 1,2,2,1,13 } ), is( 6) );
	}

}
