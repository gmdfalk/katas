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
		assertThat( Array3.maxSpan( new int[] { 3 } ), is( 1 ) );
	}

	@Test
	public void testFix34() {
		assertThat( Array3.fix34( new int[] { 1, 3, 1, 4 } ), is( new int[] { 1, 3, 4, 1 } ) );
		assertThat( Array3.fix34( new int[] { 1, 3, 1, 4, 4, 3, 1 } ), is( new int[] { 1, 3, 4, 1, 1, 3, 4 } ) );
		assertThat( Array3.fix34( new int[] { 3, 2, 2, 4 } ), is( new int[] { 3, 4, 2, 2 } ) );
		assertThat( Array3.fix34( new int[] { 3, 1, 1, 3, 4, 4 } ), is( new int[] { 3, 4, 1, 3, 4, 1 } ) );
	}

	@Test
	public void testFix45() {
		assertThat( Array3.fix45( new int[] { 5, 4, 9, 4, 9, 5 } ), is( new int[] { 9, 4, 5, 4, 5, 9 } ) );
		assertThat( Array3.fix45( new int[] { 1, 4, 1, 5 } ), is( new int[] { 1, 4, 5, 1 } ) );
		assertThat( Array3.fix45( new int[] { 1, 4, 1, 5, 5, 4, 1 } ), is( new int[] { 1, 4, 5, 1, 1, 4, 5 } ) );
	}

	@Test
	public void testCanBalance() {
		assertThat( Array3.canBalance( new int[] { 1, 1, 1, 2, 1 } ), is( true ) );
		assertThat( Array3.canBalance( new int[] { 2, 1, 1, 2, 1 } ), is( false ) );
		assertThat( Array3.canBalance( new int[] { 10, 10 } ), is( true ) );
	}

	@Test
	public void testLinearIn() {
		assertThat( Array3.linearIn( new int[] { 1, 2, 4, 6 }, new int[] { 2, 4 } ), is( true ) );
		assertThat( Array3.linearIn( new int[] { 1, 2, 4, 6 }, new int[] { 2, 3, 4 } ), is( false ) );
		assertThat( Array3.linearIn( new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 } ), is( true ) );
	}

	@Test
	public void testSquareUp() {
		assertThat( Array3.squareUp( 3 ), is( new int[] { 0, 0, 1, 0, 2, 1, 3, 2, 1 } ) );
		assertThat( Array3.squareUp( 2 ), is( new int[] { 0, 1, 2, 1 } ) );
		assertThat( Array3.squareUp( 4 ), is( new int[] { 0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1 } ) );
	}
}
