package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoubleStringsTest {

	@Test
	public void test() {
		assertThat(DoubleStrings.main(2), is(2));
		assertThat(DoubleStrings.main(4), is(4));
	}
}
