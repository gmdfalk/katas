package array1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Array1Test {

	@Test
	public void testFirstLast6() {
		assertThat(Array1.firstLast6(new int[] { 1, 2, 6 }), is(true));
		assertThat(Array1.firstLast6(new int[] { 6, 1, 2, 3 }), is(true));
		assertThat(Array1.firstLast6(new int[] { 13, 6, 1, 2, 3 }), is(false));
	}

	@Test
	public void testSameFirstLast() {
		assertThat(Array1.sameFirstLast(new int[] { 1, 2, 3 }), is(false));
		assertThat(Array1.sameFirstLast(new int[] { 1, 2, 3, 1 }), is(true));
		assertThat(Array1.sameFirstLast(new int[] { 1, 2, 1 }), is(true));
	}

	@Test
	public void testMakePi() {
		assertThat(Array1.makePi(), is(new int[] { 3, 1, 4 }));
	}

}
