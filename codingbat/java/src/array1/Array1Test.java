package array1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Array1Test {

	@Test
	public void testStringTimes() {
		assertThat(Array1.firstLast6(new int[] {1, 2, 6}), is(true));
		assertThat(Array1.firstLast6(new int[]{6, 1, 2, 3}), is(true));
		assertThat(Array1.firstLast6(new int[] {13, 6, 1, 2, 3}), is(false));
	}

}
