package string1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class String1Test {

	@Test
	public void testStringTimes() {
		assertThat(String1.helloName("Bob"), is("Hello Bob"));
		assertThat(String1.helloName("Alice"), is("Hello Alice"));
		assertThat(String1.helloName("X"), is("Hello X"));
	}

	@Test
	public void testMakeAbba() {
		assertThat(String1.makeAbba("Hi", "Bye"), is("HiByeByeHi"));
		assertThat(String1.makeAbba("Yo", "Alice"), is("YoAliceAliceYo"));
		assertThat(String1.makeAbba("What", "Up"), is("WhatUpUpWhat"));
	}

	@Test
	public void testMakeTags() {
		assertThat(String1.makeTags("i", "Yay"), is("<i>Yay</i>"));
		assertThat(String1.makeTags("i", "Hello"), is("<i>Hello</i>"));
		assertThat(String1.makeTags("cite", "Yay"), is("<cite>Yay</cite>"));
	}
	
	@Test
	public void testMakeOutWord() {
		assertThat(String1.makeOutWord("<<>>", "Yay"), is("<<Yay>>"));
		assertThat(String1.makeOutWord("<<>>", "WooHoo"), is("<<WooHoo>>"));
		assertThat(String1.makeOutWord("[[]]", "word"), is("[[word]]") );
	}

	@Test
	public void testExtraEnd() {
		assertThat(String1.extraEnd("Hello"), is("lololo"));
		assertThat(String1.extraEnd("ab"), is("ababab"));
		assertThat(String1.extraEnd("Hi"), is("HiHiHi"));
	}
	
	@Test
	public void testFirstTwo() {
		assertThat(String1.firstTwo("Hello"), is("He"));
		assertThat(String1.firstTwo("abcdefg"), is("ab"));
		assertThat(String1.firstTwo("ab"), is("ab"));
	}
	
	@Test
	public void testFirstHalf() {
		assertThat(String1.firstHalf("WooHoo"), is("Woo"));
		assertThat(String1.firstHalf("HelloThere"), is("Hello"));
		assertThat(String1.firstHalf("abcdef"), is("abc"));
	}
	
	@Test
	public void testWithoutEnd() {
		assertThat(String1.withoutEnd("Hello"), is("ell"));
		assertThat(String1.withoutEnd("java"), is("av"));
		assertThat(String1.withoutEnd("coding"), is("odin"));
	}
	
	@Test
	public void testComboString() {
		assertThat(String1.comboString("Hello", "hi"), is("hiHellohi"));
		assertThat(String1.comboString("hi", "Hello"), is("hiHellohi"));
		assertThat(String1.comboString("aaa", "b"), is("baaab"));
	}
	
	@Test
	public void testNonStart() {
		assertThat(String1.nonStart("Hello", "There"), is("ellohere"));
		assertThat(String1.nonStart("java", "code"), is("avaode"));
		assertThat(String1.nonStart("shotl", "java"), is("hotlava"));
	}
}
