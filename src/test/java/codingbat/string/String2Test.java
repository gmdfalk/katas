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

}