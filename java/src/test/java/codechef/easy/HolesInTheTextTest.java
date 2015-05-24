package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HolesInTheTextTest {

	@Test
	public void test() {
		assertThat(HolesInTheText.main("CODECHEF"), is(2));
		assertThat(HolesInTheText.main("DRINKEATCODE"), is(5));
	}
}
