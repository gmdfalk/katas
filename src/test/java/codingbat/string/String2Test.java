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
}