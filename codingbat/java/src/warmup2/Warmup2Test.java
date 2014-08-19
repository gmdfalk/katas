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

}
