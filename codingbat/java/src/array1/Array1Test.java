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
		assertThat(Array1.reverse3(new int[] { 1, 2, 3 }), is(new int[] { 3, 2,
				1 }));
		assertThat(Array1.reverse3(new int[] { 5, 11, 9 }), is(new int[] { 9,
				11, 5 }));
		assertThat(Array1.reverse3(new int[] { 7, 0, 0 }), is(new int[] { 0, 0,
				7 }));
	}

	@Test
	public void testMaxEnd3() {
		assertThat(Array1.maxEnd3(new int[] { 1, 2, 3 }), is(new int[] { 3, 3,
				3 }));
		assertThat(Array1.maxEnd3(new int[] { 11, 5, 9 }), is(new int[] { 11,
				11, 11 }));
		assertThat(Array1.maxEnd3(new int[] { 2, 11, 3 }), is(new int[] { 3, 3,
				3 }));
	}

	@Test
	public void testSum2() {
		assertThat(Array1.sum2(new int[] { 1, 2, 3 }), is(3));
		assertThat(Array1.sum2(new int[] { 1, 1 }), is(2));
		assertThat(Array1.sum2(new int[] { 1, 1, 1, 1 }), is(2));
	}

	@Test
	public void testMiddleWay() {
		assertThat(
				Array1.middleWay(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }),
				is(new int[] { 2, 5 }));
		assertThat(
				Array1.middleWay(new int[] { 7, 7, 7 }, new int[] { 3, 8, 0 }),
				is(new int[] { 7, 8 }));
		assertThat(
				Array1.middleWay(new int[] { 5, 2, 9 }, new int[] { 1, 4, 5 }),
				is(new int[] { 2, 4 }));
	}

	@Test
	public void testMakeEnds() {
		assertThat(Array1.makeEnds(new int[] { 1, 2, 3 }),
				is(new int[] { 1, 3 }));
		assertThat(Array1.makeEnds(new int[] { 1, 2, 3, 4 }), is(new int[] { 1,
				4 }));
		assertThat(Array1.makeEnds(new int[] { 7, 4, 6, 2 }), is(new int[] { 7,
				2 }));
	}

	@Test
	public void testHas23() {
		assertThat(Array1.has23(new int[] { 2, 5 }), is(true));
		assertThat(Array1.has23(new int[] { 4, 3 }), is(true));
		assertThat(Array1.has23(new int[] { 4, 5 }), is(false));
	}

	@Test
	public void testNo23() {
		assertThat(Array1.no23(new int[] { 4, 5 }), is(true));
		assertThat(Array1.no23(new int[] { 4, 2 }), is(false));
		assertThat(Array1.no23(new int[] { 3, 5 }), is(false));
	}

	@Test
	public void testMakeLast() {
		assertThat(Array1.makeLast(new int[] { 4, 5, 6 }), is(new int[] { 0, 0,
				0, 0, 0, 6 }));
		assertThat(Array1.makeLast(new int[] { 1, 2 }), is(new int[] { 0, 0, 0,
				2 }));
		assertThat(Array1.makeLast(new int[] { 3 }), is(new int[] { 0, 3 }));
	}

	@Test
	public void testDouble23() {
		assertThat(Array1.double23(new int[] { 2, 2 }), is(true));
		assertThat(Array1.double23(new int[] { 3, 3 }), is(true));
		assertThat(Array1.double23(new int[] { 2, 3 }), is(false));
	}

	@Test
	public void testFix23() {
		assertThat(Array1.fix23(new int[] { 1, 2, 3 }),
				is(new int[] { 1, 2, 0 }));
		assertThat(Array1.fix23(new int[] { 2, 3, 5 }),
				is(new int[] { 2, 0, 5 }));
		assertThat(Array1.fix23(new int[] { 1, 2, 1 }),
				is(new int[] { 1, 2, 1 }));
	}

	@Test
	public void testStart1() {
		assertThat(Array1.start1(new int[] { 1, 2, 3 }, new int[] { 1, 3 }),
				is(2));
		assertThat(Array1.start1(new int[] { 7, 2, 3 }, new int[] { 1 }), is(1));
		assertThat(Array1.start1(new int[] { 1, 2 }, new int[] {}), is(1));
	}

	@Test
	public void testBiggerTwo() {
		assertThat(Array1.biggerTwo(new int[] { 1, 2 }, new int[] { 3, 4 }),
				is(new int[] { 3, 4 }));
		assertThat(Array1.biggerTwo(new int[] { 3, 4 }, new int[] { 1, 2 }),
				is(new int[] { 3, 4 }));
		assertThat(Array1.biggerTwo(new int[] { 1, 1 }, new int[] { 1, 2 }),
				is(new int[] { 1, 2 }));
	}

	@Test
	public void testMakeMiddle() {
		assertThat(Array1.makeMiddle(new int[] { 1, 2, 3, 4 }), is(new int[] {
				2, 3 }));
		assertThat(Array1.makeMiddle(new int[] { 7, 1, 2, 3, 4, 9 }),
				is(new int[] { 2, 3 }));
		assertThat(Array1.makeMiddle(new int[] { 1, 2 }),
				is(new int[] { 1, 2 }));
	}

	@Test
	public void testPlusTwo() {
		assertThat(Array1.plusTwo(new int[] { 1, 2 }, new int[] { 3, 4 }),
				is(new int[] { 1, 2, 3, 4 }));
		assertThat(Array1.plusTwo(new int[] { 4, 4 }, new int[] { 2, 2 }),
				is(new int[] { 4, 4, 2, 2 }));
		assertThat(Array1.plusTwo(new int[] { 9, 2 }, new int[] { 3, 4 }),
				is(new int[] { 9, 2, 3, 4 }));
	}

	@Test
	public void testSwapEnds() {
		assertThat(Array1.swapEnds(new int[] { 1, 2, 3, 4 }), is(new int[] { 4,
				2, 3, 1 }));
		assertThat(Array1.swapEnds(new int[] { 1, 2, 3 }), is(new int[] { 3, 2,
				1 }));
		assertThat(Array1.swapEnds(new int[] { 8, 6, 7, 9, 5 }), is(new int[] {
				5, 6, 7, 9, 8 }));
	}

	@Test
	public void testMidThree() {
		assertThat(Array1.midThree(new int[] { 1, 2, 3, 4, 5 }), is(new int[] {
				2, 3, 4 }));
		assertThat(Array1.midThree(new int[] { 8, 6, 7, 5, 3, 0, 9 }),
				is(new int[] { 7, 5, 3 }));
		assertThat(Array1.midThree(new int[] { 1, 2, 3 }), is(new int[] { 1, 2,
				3 }));
	}

	@Test
	public void testMaxTriple() {
		assertThat(Array1.maxTriple(new int[] { 1, 2, 3 }), is(3));
		assertThat(Array1.maxTriple(new int[] { 1, 5, 3 }), is(5));
		assertThat(Array1.maxTriple(new int[] { 5, 2, 3 }), is(5));
	}

	@Test
	public void testFrontPiece() {
		assertThat(Array1.frontPiece(new int[] { 1, 2, 3 }), is(new int[] { 1,
				2 }));
		assertThat(Array1.frontPiece(new int[] { 1, 2 }),
				is(new int[] { 1, 2 }));
		assertThat(Array1.frontPiece(new int[] { 1 }), is(new int[] { 1 }));
	}
}
