package arithmetics;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ArithmeticsTest {

	Arithmetics testObj;

	@Before
	public void setUp() {
		testObj = new Arithmetics();
	}

	@Test
	public void testSum() {
		assertThat(testObj.sum(1, 2), is(3));
	}

	@Test
	public void testDifference() {
		assertThat(testObj.diff(1, 2), is(-1));
	}

}
