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
}