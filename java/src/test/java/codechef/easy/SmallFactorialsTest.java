package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SmallFactorialsTest {

	@Test
	public void test() {
		assertThat(SmallFactorials.main(1), is(1L));
		assertThat(SmallFactorials.main(2), is(2L));
		assertThat(SmallFactorials.main(5), is(120L));
		assertThat(SmallFactorials.main(3), is(6L));
	}
}
