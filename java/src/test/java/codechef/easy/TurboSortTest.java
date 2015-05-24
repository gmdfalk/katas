package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TurboSortTest {

	@Test
	public void test() {
		assertThat(TurboSort.main(new int[] {5,3,6,7,1}), is(new int[] {1,3,5,6,7}));
		assertThat(TurboSort.main2(new int[] {5,3,6,7,1}), is(new int[] {1,3,5,6,7}));
	}
}
