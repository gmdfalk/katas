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

	@Test
	public void testSum67() {
		assertThat( Array2.sum67( new int[] { 1, 2, 2 } ), is( 5 ) );
		assertThat( Array2.sum67( new int[] { 1, 2, 2, 6, 99, 99, 7 } ), is( 5 ) );
		assertThat( Array2.sum67( new int[] { 1, 1, 6, 7, 2 } ), is( 4 ) );
	}

	@Test
	public void testHas22() {
		assertThat( Array2.has22( new int[] { 1, 2, 2 } ), is( true ) );
		assertThat( Array2.has22( new int[] { 1, 2, 1, 2 } ), is( false ) );
		assertThat( Array2.has22( new int[] { 2, 1, 2 } ), is( false ) );
	}

	@Test
	public void testLucky13() {
		assertThat( Array2.lucky13( new int[] { 0,2,4 } ), is( true ) );
		assertThat( Array2.lucky13( new int[] { 1,2,3 } ), is( false ) );
		assertThat( Array2.lucky13( new int[] { 1,2,4 } ), is( false ) );
	}

	@Test
	public void testSum28() {
		assertThat( Array2.sum28( new int[] { 2, 3, 2, 2, 4, 2 } ), is( true ) );
		assertThat( Array2.sum28( new int[] { 2, 3, 2, 2, 4, 2, 2 } ), is( false ) );
		assertThat( Array2.sum28( new int[] { 1, 2, 3, 4 } ), is( false ) );
	}

	@Test
	public void testMore14() {
		assertThat( Array2.more14( new int[] { 1, 4, 1 } ), is( true ) );
		assertThat( Array2.more14( new int[] { 1, 4, 1, 4 } ), is( false ) );
		assertThat( Array2.more14( new int[] { 1, 1 } ), is( true ) );
	}

	@Test
	public void testFizzArray() {
		assertThat( Array2.fizzArray( 4 ), is( new int[] { 0, 1, 2, 3 } ) );
		assertThat( Array2.fizzArray( 1 ), is( new int[] { 0 } ) );
		assertThat( Array2.fizzArray( 10 ), is( new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 } ) );
	}

	@Test
	public void testOnly14() {
		assertThat( Array2.only14( new int[] { 1, 4, 1, 4 } ), is( true ) );
		assertThat( Array2.only14( new int[] { 1, 4, 2, 4 } ), is( false ) );
		assertThat( Array2.only14( new int[] { 1, 1 } ), is( true ) );
	}

	@Test
	public void testFizzArray2() {
		assertThat (Array2.fizzArray2(4), is (new String[] {"0","1","2", "3"}));
		assertThat (Array2.fizzArray2(10), is (new String[] {"0","1","2", "3", "4", "5", "6", "7", "8", "9"}));
		assertThat (Array2.fizzArray2(2), is (new String[] {"0","1"}));
	}

	@Test
	public void testNo14() {
		assertThat( Array2.no14( new int[] { 1, 2, 3 } ), is( true ) );
		assertThat( Array2.no14( new int[] { 1, 2, 3, 4 } ), is( false ) );
		assertThat( Array2.no14( new int[] { 2, 3, 4 } ), is( true ) );
	}

	@Test
	public void testIsEverywhere() {
		assertThat( Array2.isEverywhere( new int[] { 1, 2, 1, 3 }, 1 ), is( true ) );
		assertThat( Array2.isEverywhere( new int[] { 1, 2, 1, 3 }, 2 ), is( false ) );
		assertThat( Array2.isEverywhere( new int[] { 1, 2, 1, 3, 4 }, 1 ), is( false ) );
	}

	@Test
	public void testEither24() {
		assertThat( Array2.either24( new int[] { 1, 2, 2 } ), is( true ) );
		assertThat( Array2.either24( new int[] { 4, 4, 1 } ), is( true ) );
		assertThat( Array2.either24( new int[] { 4, 4, 1, 2, 2 } ), is( false ) );
	}

	@Test
	public void testMatchUp() {
		assertThat( Array2.matchUp( new int[] { 1, 2, 3}, new int[] {2,3,10}), is( 2 ) );
		assertThat( Array2.matchUp( new int[] { 1, 2, 3}, new int[] {2,3,5}), is( 3) );
		assertThat( Array2.matchUp( new int[] { 1, 2, 3}, new int[] {2,3,3}), is( 2 ) );
	}

	@Test
	public void testHas77() {
		assertThat( Array2.has77( new int[] { 1, 7,7 } ), is( true ) );
		assertThat( Array2.has77( new int[] { 1,7,1,7 } ), is( true ) );
		assertThat( Array2.has77( new int[] { 1,7,1,1,7 } ), is( false ) );
	}

	@Test
	public void testHas12() {
		assertThat( Array2.has12( new int[] { 1, 3, 2 } ), is( true ) );
		assertThat( Array2.has12( new int[] { 3, 1, 2 } ), is( true ) );
		assertThat( Array2.has12( new int[] { 3, 1, 4, 5, 2 } ), is( true ) );
	}

	@Test
	public void testModThree() {
		assertThat( Array2.modThree( new int[] { 2, 1, 3, 5 } ), is( true ) );
		assertThat( Array2.modThree( new int[] { 2, 1, 2, 5 } ), is( false ) );
		assertThat( Array2.modThree( new int[] { 2, 4, 2, 5 } ), is( true ) );
	}
}
