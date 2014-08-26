package warmup2;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

import org.junit.Test;

import warmup1.Warmup1;

public class Warmup2Test {

	@Test
	public void testStringTimes() {
		assertThat(Warmup2.stringTimes("Hi", 2), is("HiHi"));
		assertThat(Warmup2.stringTimes("Hi", 3), is("HiHiHi"));
		assertThat(Warmup2.stringTimes("Hi", 1), is("Hi"));
	}

	@Test
	public void testFrontTimes() {
		assertThat(Warmup2.frontTimes("Chocolate", 2), is("ChoCho"));
		assertThat(Warmup2.frontTimes("Chocolate", 3), is("ChoChoCho"));
		assertThat(Warmup2.frontTimes("Abc", 3), is("AbcAbcAbc"));
	}

	@Test
	public void testCountXx() {
		assertThat(Warmup2.countXx("abcxx"), is(1));
		assertThat(Warmup2.countXx("xxx"), is(2));
		assertThat(Warmup2.countXx("xxxx"), is(3));
	}

	@Test
	public void testDoubleX() {
		assertThat(Warmup2.doubleX("axxbb"), is(true));
		assertThat(Warmup2.doubleX("axaxax"), is(false));
		assertThat(Warmup2.doubleX("xxxxx"), is(true));
	}

	@Test
	public void testStringBits() {
		assertThat(Warmup2.stringBits("Hello"), is("Hlo"));
		assertThat(Warmup2.stringBits("Hi"), is("H"));
		assertThat(Warmup2.stringBits("Heeololeo"), is("Hello"));
	}

	@Test
	public void testStringSplosion() {
		assertThat(Warmup2.stringSplosion("ab"), is("aab"));
		assertThat(Warmup2.stringSplosion("abc"), is("aababc"));
		assertThat(Warmup2.stringSplosion("Code"), is("CCoCodCode"));
	}

	@Test
	public void testLast2() {
		assertThat(Warmup2.last2("hixxhi"), is(1));
		assertThat(Warmup2.last2("xaxxaxaxx"), is(1));
		assertThat(Warmup2.last2("axxxaaxx"), is(2));
	}

	@Test
	public void testArrayCount9() {
		assertThat(Warmup2.arrayCount9(new int[] { 1, 2, 9 }), is(1));
		assertThat(Warmup2.arrayCount9(new int[] { 1, 9, 9 }), is(2));
		assertThat(Warmup2.arrayCount9(new int[] { 1, 9, 9, 3, 9 }), is(3));
	}

	@Test
	public void testArrayFront9() {
		assertThat(Warmup2.arrayFront9(new int[] { 1, 2, 9, 3, 4 }), is(true));
		assertThat(Warmup2.arrayFront9(new int[] { 1, 2, 3, 4, 9 }), is(false));
		assertThat(Warmup2.arrayFront9(new int[] { 1, 2, 3, 4, 5 }), is(false));
		assertThat(Warmup2.arrayFront9(new int[] { 1, 9, 3 }), is(true));
	}
	
	@Test
	public void testArray123() {
		assertThat(Warmup2.array123(new int[] { 1, 1, 2, 3, 1 }), is(true));
		assertThat(Warmup2.array123(new int[] { 1, 1, 2, 4, 1 }), is(false));
		assertThat(Warmup2.array123(new int[] { 1, 1, 2, 1, 2, 3 }), is(true));
	}
	

	@Test
	public void testStringMatch() {
		assertThat(Warmup2.stringMatch("xxcaazz", "xxbaaz"), is(3));
		assertThat(Warmup2.stringMatch("abc", "abc"), is(2));
		assertThat(Warmup2.stringMatch("abc", "axc"), is(0));
	}
	
	@Test
	public void testStringX() {
		assertThat(Warmup2.stringX("xxHxix"), is("xHix"));
		assertThat(Warmup2.stringX("abxxxcd"), is("abcd"));
		assertThat(Warmup2.stringX("xabxxxcdx"), is("xabcdx"));
	}
	
	@Test
	public void testAltPairs() {
		assertThat(Warmup2.altPairs("kitten"), is("kien"));
		assertThat(Warmup2.altPairs("Chocolate"), is("Chole"));
		assertThat(Warmup2.altPairs("CodingHorror"), is("Congrr"));
	}
}
