package codingbat.logic;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Logic2Test {

	@Test
	public void testCountEvens() {
		assertThat( Logic2.makeBricks( 3, 1, 8 ), is( true ) );
		assertThat( Logic2.makeBricks( 3, 1, 9 ), is( false ) );
		assertThat( Logic2.makeBricks( 3, 2, 10 ), is( true ) );
	}

	@Test
	public void testLoneSum() {
		assertThat( Logic2.loneSum( 1, 2, 3 ), is( 6 ) );
		assertThat( Logic2.loneSum( 3, 2, 3 ), is( 2 ) );
		assertThat( Logic2.loneSum( 3, 3, 3 ), is( 0 ) );
	}

	@Test
	public void testLuckySum() {
		assertThat( Logic2.luckySum( 1, 2, 3 ), is( 6 ) );
		assertThat( Logic2.luckySum( 1, 2, 13 ), is( 3 ) );
		assertThat( Logic2.luckySum( 1, 13, 3 ), is( 1 ) );
	}

	@Test
	public void testNoTeenSum() {
		assertThat( Logic2.noTeenSum( 1, 2, 3 ), is( 6 ) );
		assertThat( Logic2.noTeenSum( 2, 13, 1 ), is( 3 ) );
		assertThat( Logic2.noTeenSum( 2, 1, 14 ), is( 3 ) );
	}

	@Test
	public void testRoundSum() {
		assertThat( Logic2.roundSum( 16, 17, 18 ), is( 60 ) );
		assertThat( Logic2.roundSum( 12, 13, 14 ), is( 30 ) );
		assertThat( Logic2.roundSum( 6, 4, 4 ), is( 10 ) );
		assertThat( Logic2.roundSum( 212, 213, 216 ), is( 640 ) );
	}

	@Test
	public void testCloseFar() {
		assertThat( Logic2.closeFar( 1, 2, 10 ), is( true ) );
		assertThat( Logic2.closeFar( 1, 2, 3 ), is( false ) );
		assertThat( Logic2.closeFar( 4, 1, 3 ), is( true ) );
	}

	@Test
	public void testBlackjack() {
		assertThat( Logic2.blackjack( 19, 21 ), is( 21 ) );
		assertThat( Logic2.blackjack( 21, 19 ), is( 21 ) );
		assertThat( Logic2.blackjack( 19, 22 ), is( 19 ) );
	}

}
