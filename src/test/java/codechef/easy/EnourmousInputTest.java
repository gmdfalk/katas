package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EnourmousInputTest {

	@Test
	public void test() {
		assertThat(EnourmousInput.main(7, 3, new int[] {1, 51, 966369, 7, 9, 999996, 11}), is(4));
	}
}
