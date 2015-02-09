package codingbat.string;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class String2Test {

	@Test
	public void testDoubleChar() {
		assertThat( String2.doubleChar( "The" ), is( "TThhee" ) );
		assertThat( String2.doubleChar( "AAbb" ), is( "AAAAbbbb" ) );
		assertThat( String2.doubleChar( "Hi-There" ), is( "HHii--TThheerree" ) );
	}

	@Test
	public void testCountHi() {
		assertThat( String2.countHi( "abc hi ho" ), is( 1 ) );
		assertThat( String2.countHi( "ABChi hi" ), is( 2 ) );
		assertThat( String2.countHi( "hihi" ), is( 2 ) );
	}

	@Test
	public void testCatDog() {
		assertThat( String2.catDog( "catdog" ), is( true ) );
		assertThat( String2.catDog( "catcat" ), is( false ) );
		assertThat( String2.catDog( "1cat1cadodog" ), is( true ) );
	}

	@Test
	public void testCountCode() {
		assertThat( String2.countCode( "aaacodebbb" ), is( 1 ) );
		assertThat( String2.countCode( "codexxcode" ), is( 2 ) );
		assertThat( String2.countCode( "cozexxcope" ), is( 2 ) );
	}

	@Test
	public void testEndOther() {
		assertThat( String2.endOther( "Hiabc", "abc" ), is( true ) );
		assertThat( String2.endOther( "AbC", "HiaBc" ), is( true ) );
		assertThat( String2.endOther( "abc", "abXabc" ), is( true ) );
	}

	@Test
	public void testXyzThere() {
		assertThat( String2.xyzThere( "abcxyz" ), is( true ) );
		assertThat( String2.xyzThere( "abc.xyz" ), is( false ) );
		assertThat( String2.xyzThere( "xyz.abc" ), is( true ) );
	}

	@Test
	public void testBobThere() {
		assertThat( String2.bobThere( "abcbob" ), is( true ) );
		assertThat( String2.bobThere( "b9b" ), is( true ) );
		assertThat( String2.bobThere( "bac" ), is( false ) );
	}

	@Test
	public void testXyBalance() {
		assertThat( String2.xyBalance( "aaxbby" ), is( true ) );
		assertThat( String2.xyBalance( "aaxbb" ), is( false ) );
		assertThat( String2.xyBalance( "yaaxbb" ), is( false ) );
	}

	@Test
	public void testMixString() {
		assertThat( String2.mixString( "abc", "xyz" ), is( "axbycz" ) );
		assertThat( String2.mixString( "Hi", "There" ), is( "HTihere" ) );
		assertThat( String2.mixString( "xxxx", "There" ), is( "xTxhxexre" ) );
	}

	@Test
	public void testRepeatEnd() {
		assertThat( String2.repeatEnd( "Hello", 3 ), is( "llollollo" ) );
		assertThat( String2.repeatEnd( "Hello", 2 ), is( "lolo" ) );
		assertThat( String2.repeatEnd( "Hello", 1 ), is( "o" ) );
	}

	@Test
	public void testRepeatFront() {
		assertThat( String2.repeatFront( "Chocolate", 4 ), is( "ChocChoChC" ) );
		assertThat( String2.repeatFront( "Chocolate", 3 ), is( "ChoChC" ) );
		assertThat( String2.repeatFront( "Ice Cream", 2 ), is( "IcI" ) );
	}

	@Test
	public void testRepeatSeparator() {
		assertThat( String2.repeatSeparator( "Word", "X", 3 ), is( "WordXWordXWord" ) );
		assertThat( String2.repeatSeparator( "This", "And", 2 ), is( "ThisAndThis" ) );
		assertThat( String2.repeatSeparator( "This", "And", 1 ), is( "This" ) );
	}

	@Test
	public void testPrefixAgain() {
		assertThat( String2.prefixAgain( "abXYabc", 1 ), is( true ) );
		assertThat( String2.prefixAgain( "abXYabc", 2 ), is( true ) );
		assertThat( String2.prefixAgain( "abXYabc", 3 ), is( false ) );
	}

	@Test
	public void testXyzMiddle() {
		assertThat( String2.xyzMiddle( "AAxyzBB", 1 ), is( true ) );
		assertThat( String2.xyzMiddle( "AxyzBB", 2 ), is( true ) );
		assertThat( String2.xyzMiddle( "AxyzBBB", 3 ), is( false ) );
	}

	@Test
	public void testGetSandwich() {
		assertThat( String2.getSandwich( "breadjambread" ), is( "jam" ) );
		assertThat( String2.getSandwich( "xxbreadjambreadyy" ), is( "jam" ) );
		assertThat( String2.getSandwich( "xxbreadyy" ), is( "" ) );
	}

	@Test
	public void testSameStarChar() {
		assertThat( String2.sameStarChar( "xy*yzz" ), is( true ) );
		assertThat( String2.sameStarChar( "xy*zzz" ), is( false ) );
		assertThat( String2.sameStarChar( "*xa*az" ), is( true ) );
	}

	@Test
	public void testZipZap() {
		assertThat( String2.zipZap( "zipXzap" ), is( "zpXzp" ) );
		assertThat( String2.zipZap( "zipXzap" ), is( "zpXzp" ) );
		assertThat( String2.zipZap( "zipXzap" ), is( "zpXzp" ) );
	}

	@Test
	public void testStarOut() {
		assertThat( String2.starOut( "ab*cd" ), is( "ad" ) );
		assertThat( String2.starOut( "ab**cd" ), is( "ad" ) );
		assertThat( String2.starOut( "sm*eilly" ), is( "silly" ) );
		assertThat( String2.starOut( "sm*eil*ly" ), is( "siy" ) );
		assertThat( String2.starOut( "sm**eil*ly" ), is( "siy" ) );
		assertThat( String2.starOut( "sm***eil*ly" ), is( "siy" ) );
		assertThat( String2.starOut( "stringy*" ), is( "string" ) );
		assertThat( String2.starOut( "*stringy" ), is( "tringy" ) );
		assertThat( String2.starOut( "*str*in*gy" ), is( "ty" ) );
		assertThat( String2.starOut( "abc" ), is( "abc" ) );
		assertThat( String2.starOut( "a*bc" ), is( "c" ) );
		assertThat( String2.starOut( "ab" ), is( "ab" ) );
		assertThat( String2.starOut( "a*b" ), is( "" ) );
		assertThat( String2.starOut( "a" ), is( "a" ) );
		assertThat( String2.starOut( "a*" ), is( "" ) );
	}

	@Test
	public void testPlusOut() {
		assertThat( String2.plusOut( "12xy34", "xy" ), is( "++xy++" ) );
		assertThat( String2.plusOut( "12xy34", "1" ), is( "1+++++" ) );
		assertThat( String2.plusOut( "12xy34xyabcxy", "xy" ), is( "++xy++xy+++xy" ) );
	}

	@Test
	public void testWordEnds() {
		assertThat( String2.wordEnds( "abcXY123XYijk", "XY" ), is( "c13i" ) );
		assertThat( String2.wordEnds( "XY123XY", "XY" ), is( "13" ) );
		assertThat( String2.wordEnds( "XY1XY", "XY" ), is( "11" ) );
	}
}