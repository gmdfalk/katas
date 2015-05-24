package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class YetAnotherNumberGameTest {

	@Test
	public void test() {
		assertThat(YetAnotherNumberGame.main(1), is("BOB"));
		assertThat(YetAnotherNumberGame.main(2), is("ALICE"));
	}
}
