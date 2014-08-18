package warmup1;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

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

	@Test
	public void testFrontBack() {
		assertEquals("eodc", Warmup1.frontBack("code"));
		assertEquals("a", Warmup1.frontBack("a"));
		assertEquals("ba", Warmup1.frontBack("ab"));
	}

	@Test
	public void testFront3() {
		assertEquals("JavJavJav", Warmup1.front3("Java"));
		assertEquals("ChoChoCho", Warmup1.front3("Chocolate"));
		assertEquals("abcabcabc", Warmup1.front3("abc"));
	}

	@Test
	public void testBackAround() {
		assertEquals("tcatt", Warmup1.backAround("cat"));
		assertEquals("oHelloo", Warmup1.backAround("Hello"));
		assertEquals("aaa", Warmup1.backAround("a"));
	}

	@Test
	public void testOr35() {
		assertTrue(Warmup1.or35(3));
		assertTrue(Warmup1.or35(10));
		assertFalse(Warmup1.or35(8));
	}

	@Test
	public void testfront22() {
		assertEquals("kikittenki", Warmup1.front22("kitten"));
		assertEquals("HaHaHa", Warmup1.front22("Ha"));
		assertEquals("ababcab", Warmup1.front22("abc"));
	}

	@Test
	public void testStartHi() {
		assertTrue(Warmup1.startHi("hi there"));
		assertTrue(Warmup1.startHi("hi"));
		assertFalse(Warmup1.startHi("hello hi"));
	}

	@Test
	public void testIcyHot() {
		assertTrue(Warmup1.icyHot(120, -1));
		assertTrue(Warmup1.icyHot(-1, 120));
		assertFalse(Warmup1.icyHot(2, 120));
	}

	@Test
	public void testIn1020() {
		assertTrue(Warmup1.in1020(12, 99));
		assertTrue(Warmup1.in1020(21, 12));
		assertFalse(Warmup1.in1020(8, 99));
	}

	@Test
	public void testHasTeen() {
		assertTrue(Warmup1.hasTeen(13, 20, 10));
		assertTrue(Warmup1.hasTeen(20, 19, 10));
		assertTrue(Warmup1.hasTeen(20, 10, 13));
		assertFalse(Warmup1.hasTeen(20, 10, 12));
	}

	@Test
	public void testLoneTeen() {
		assertTrue(Warmup1.loneTeen(13, 99));
		assertTrue(Warmup1.loneTeen(21, 19));
		assertFalse(Warmup1.loneTeen(13, 13));
	}

	@Test
	public void testDelDel() {
		assertThat(Warmup1.delDel("adelbc"), is("abc"));
		assertThat(Warmup1.delDel("adelHello"), is("aHello"));
		assertThat(Warmup1.delDel("adedbc"), is("adedbc"));
	}

	@Test
	public void testMixStart() {
		assertThat(Warmup1.mixStart("mix snacks"), is(true));
		assertThat(Warmup1.mixStart("pix snacks"), is(true));
		assertThat(Warmup1.mixStart("piz snacks"), is(false));
	}

	@Test
	public void testStartOz() {
		assertThat(Warmup1.startOz("ozymandias"), is("oz"));
		assertThat(Warmup1.startOz("bzoo"), is("z"));
		assertThat(Warmup1.startOz("oxx"), is("o"));
	}

	@Test
	public void testIntMax() {
		assertThat(Warmup1.intMax(1, 2, 3), is(3));
		assertThat(Warmup1.intMax(1, 3, 2), is(3));
		assertThat(Warmup1.intMax(3, 2, 1), is(3));
	}

	@Test
	public void testClose10() {
		assertThat(Warmup1.close10(8, 13), is(8));
		assertThat(Warmup1.close10(13, 8), is(8));
		assertThat(Warmup1.close10(13, 7), is(0));
	}

	@Test
	public void testIn3050() {
		assertThat(Warmup1.in3050(30, 41), is(false));
		assertThat(Warmup1.in3050(30, 31), is(true));
		assertThat(Warmup1.in3050(40, 50), is(true));
	}

	@Test
	public void testMax1020() {
		assertThat(Warmup1.max1020(11, 19), is(19));
		assertThat(Warmup1.max1020(19, 11), is(19));
		assertThat(Warmup1.max1020(11, 9), is(11));
	}
	
	@Test
	public void testStringE() {
		assertThat(Warmup1.stringE("Hello"), is(true));
		assertThat(Warmup1.stringE("Heelle"), is(true));
		assertThat(Warmup1.stringE("Heelele"), is(false));
	}
	
	@Test
	public void testLastDigit() {
		assertThat(Warmup1.lastDigit(7, 17), is(true));
		assertThat(Warmup1.lastDigit(6, 17), is(false));
		assertThat(Warmup1.lastDigit(3, 113), is(true));
	}
	
	@Test
	public void testEndUp() {
		assertThat(Warmup1.endUp("Hello"), is("HeLLO"));
		assertThat(Warmup1.endUp("hi there"), is("hi thERE"));
		assertThat(Warmup1.endUp("hi"), is("HI"));
	}
	
	@Test
	public void testEveryNth() {
		assertThat(Warmup1.everyNth("Miracle", 2), is("Mrce"));
		assertThat(Warmup1.everyNth("abcdefg", 2), is("aceg"));
		assertThat(Warmup1.everyNth("abcdefg", 3), is("adg"));
	}
}
