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

}