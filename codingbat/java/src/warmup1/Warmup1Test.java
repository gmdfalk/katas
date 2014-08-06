package warmup1;

import static org.junit.Assert.*;
import org.junit.Test;

public class Warmup1Test {

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

	@Test
	public void testParrotTrouble() {
		assertTrue(Warmup1.parrotTrouble(true, 6));
		assertFalse(Warmup1.parrotTrouble(true, 7));
		assertFalse(Warmup1.parrotTrouble(false, 6));
	}

	@Test
	public void testMakes10() {
		assertTrue(Warmup1.makes10(9, 10));
		assertFalse(Warmup1.makes10(9, 9));
		assertTrue(Warmup1.makes10(1, 9));
	}

	@Test
	public void testNearHundred() {
		assertTrue(Warmup1.nearHundred(93));
		assertTrue(Warmup1.nearHundred(90));
		assertFalse(Warmup1.nearHundred(89));
	}

	@Test
	public void testPosNeg() {
		assertTrue(Warmup1.posNeg(1, -1, false));
		assertTrue(Warmup1.posNeg(-1, 1, false));
		assertTrue(Warmup1.posNeg(-4, -5, true));
	}

	@Test
	public void testNotString() {
		assertEquals("not candy", Warmup1.notString("candy"));
		assertEquals("not x", Warmup1.notString("x"));
		assertEquals("not bad", Warmup1.notString("bad"));
	}

	@Test
	public void testMissingChar() {
		assertEquals("ktten", Warmup1.missingChar("kitten", 1));
		assertEquals("itten", Warmup1.missingChar("kitten", 0));
		assertEquals("kittn", Warmup1.missingChar("kitten", 4));
	}
}
