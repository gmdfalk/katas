package codingbat.string;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class String3Test {

	@Test
	public void testCountYZ() {
		assertThat( String3.countYZ( "fez day" ), is( 2 ) );
		assertThat( String3.countYZ( "day fez" ), is( 2 ) );
		assertThat( String3.countYZ( "day fyyyz" ), is( 2 ) );
	}

	@Test
	public void testWithoutString() {
		assertThat( String3.withoutString( "Hello there", "llo" ), is( "He there" ) );
		assertThat( String3.withoutString( "Hello there", "e" ), is( "Hllo thr" ) );
		assertThat( String3.withoutString( "Hello there", "x" ), is( "Hello there" ) );
	}

	@Test
	public void testEqualIsNot() {
		assertThat( String3.equalIsNot( "This is not" ), is( false ) );
		assertThat( String3.equalIsNot( "This is notnot" ), is( true ) );
		assertThat( String3.equalIsNot( "noisxxnotyynotxisi" ), is( true ) );
	}

	@Test
	public void testGHappy() {
		assertThat( String3.gHappy( "yyggyy" ), is( true ) );
		assertThat( String3.gHappy( "yygyy" ), is( false ) );
		assertThat( String3.gHappy( "xxggyygxx" ), is( false ) );
	}

	@Test
	public void testCountTriple() {
		assertThat( String3.countTriple( "abcXXXabc" ), is( 1 ) );
		assertThat( String3.countTriple( "xxxabyyyycd" ), is( 3 ) );
		assertThat( String3.countTriple( "a" ), is( 0 ) );
		assertThat( String3.countTriple( "aaabbccc" ), is( 2 ) );
	}

	@Test
	public void testSumDigits() {
		assertThat( String3.sumDigits( "aa1bc2d3" ), is( 6 ) );
		assertThat( String3.sumDigits( "aa11b33" ), is( 8 ) );
		assertThat( String3.sumDigits( "Chocolate" ), is( 0 ) );
	}

	@Test
	public void testSameEnds() {
		assertThat( String3.sameEnds( "abXYab" ), is( "ab" ) );
		assertThat( String3.sameEnds( "xx" ), is( "x" ) );
		assertThat( String3.sameEnds( "xxx" ), is( "x" ) );
	}

	@Test
	public void testMirrorEnds() {
		assertThat( String3.mirrorEnds( "abXYZba" ), is( "ab" ) );
		assertThat( String3.mirrorEnds( "abca" ), is( "a" ) );
		assertThat( String3.mirrorEnds( "aba" ), is( "aba" ) );
	}

	@Test
	public void testMaxBlock() {
		assertThat( String3.maxBlock( "hoopla" ), is( 2 ) );
		assertThat( String3.maxBlock( "abbCCCddBBBxx" ), is( 3 ) );
		assertThat( String3.maxBlock( "" ), is( 0 ) );
	}

	@Test
	public void testSumNumbers() {
		assertThat( String3.sumNumbers( "abc123xyz" ), is( 123 ) );
		assertThat( String3.sumNumbers( "aa11b33" ), is( 44 ) );
		assertThat( String3.sumNumbers( "7 11" ), is( 18 ) );
	}
}