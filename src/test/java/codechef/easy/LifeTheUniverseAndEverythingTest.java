package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LifeTheUniverseAndEverythingTest {

	@Test
	public void test() {
		assertThat(LifeTheUniverseAndEverything.main(new String[] { "1", "2", "88", "42", "99" }), is(88));
	}

}
