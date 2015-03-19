package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TheLeadGameTest {

	@Test
	public void test() {
		assertThat(TheLeadGame.main(new int[] {140, 82, 89, 134, 90, 110, 112, 106, 88, 90}), is(new int[] {1, 58}));
	}
}
