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

}
