package warmup1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Warmup1Test {

	// @Before
	// public void setUp() throws Exception {
	// }
	//
	// @After
	// public void tearDown() throws Exception {
	// }

	@Test
	public void testSleepIn() {
		assertTrue(Warmup1.sleepIn(false, false));
		assertTrue(Warmup1.sleepIn(false, true));
		assertTrue(Warmup1.sleepIn(true, true));
		assertFalse(Warmup1.sleepIn(true, false));
	}

	@Test
	public void testMonkeyTrouble() {
		assertTrue(Warmup1.monkeyTrouble(true, true));
		assertTrue(Warmup1.monkeyTrouble(false, false));
		assertFalse(Warmup1.monkeyTrouble(true, false));
	}

	@Test
	public void testSumDouble() {
		assertEquals(3, Warmup1.sumDouble(1, 2));
		assertEquals(5, Warmup1.sumDouble(3, 2));
		assertEquals(8, Warmup1.sumDouble(2, 2));
	}

	@Test
	public void testDiff21() {
		assertEquals(2, Warmup1.diff21(19));
		assertEquals(11, Warmup1.diff21(10));
		assertEquals(0, Warmup1.diff21(21));
	}

}
