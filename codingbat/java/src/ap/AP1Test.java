package ap;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AP1Test {

	@Test
	public void testScoresIncreasing() {
		assertThat( AP1.scoresIncreasing( new int[] { 1, 3, 4 } ), is( true ) );
		assertThat( AP1.scoresIncreasing( new int[] { 1, 3, 2 } ), is( true ) );
		assertThat( AP1.scoresIncreasing( new int[] { 1, 1, 4 } ), is( true ) );
	}
}
