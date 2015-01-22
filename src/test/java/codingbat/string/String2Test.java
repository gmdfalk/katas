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

}