package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ATMTest {

	@Test
	public void test() {
		assertThat(ATM.main(30, 120.00), is(89.50));
		assertThat(ATM.main(42, 120.00), is(120.00));
		assertThat(ATM.main(300, 120.00), is(120.00));
	}
}
