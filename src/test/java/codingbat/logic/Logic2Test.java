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

}
