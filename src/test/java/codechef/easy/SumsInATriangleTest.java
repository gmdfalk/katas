package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SumsInATriangleTest {

	@Test
	public void test() {
		assertThat(SumsInATriangle.main(new int[] { 3 }, new int[] { 1 },
				new int[] { 2, 1 }, new int[] { 1, 2, 3 }), is(5));
		assertThat(SumsInATriangle.main(new int[] { 1 }, new int[] { 1, 2 },
				new int[] { 4, 1, 2 }, new int[] { 2, 3, 1, 11 }), is(5));
	}
}
