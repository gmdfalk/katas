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

	@Test
	public void testCommonEnd() {
		assertThat(Array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3 }),
				is(true));
		assertThat(
				Array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3, 2 }),
				is(false));
		assertThat(Array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 1, 3 }),
				is(true));
	}

	@Test
	public void testSum3() {
		assertThat(Array1.sum3(new int[] { 1, 2, 3 }), is(6));
		assertThat(Array1.sum3(new int[] { 5, 11, 2 }), is(18));
		assertThat(Array1.sum3(new int[] { 7, 0, 0 }), is(7));
	}

	@Test
	public void testRotateLeft3() {
		assertThat(Array1.rotateLeft3(new int[] { 1, 2, 3 }), is(new int[] { 2,
				3, 1 }));
		assertThat(Array1.rotateLeft3(new int[] { 5, 11, 9 }), is(new int[] {
				11, 9, 5 }));
		assertThat(Array1.rotateLeft3(new int[] { 7, 0, 0 }), is(new int[] { 0,
				0, 7 }));
	}
	
	@Test
	public void testReverse3() {
		assertThat(Array1.reverse3(new int[] { 1, 2, 3 }), is(new int[] { 3, 2, 1 }));
		assertThat(Array1.reverse3(new int[] { 5, 11, 9 }), is(new int[] { 9, 11, 5 }));
		assertThat(Array1.reverse3(new int[] { 7, 0, 0 }), is(new int[] { 0, 0, 7 }));
	}
}
