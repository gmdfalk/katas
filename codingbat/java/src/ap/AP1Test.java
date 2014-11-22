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

	@Test
	public void testScores100() {
		assertThat( AP1.scores100( new int[] { 1, 100, 100 } ), is( true ) );
		assertThat( AP1.scores100( new int[] { 1, 100, 99, 100 } ), is( false ) );
		assertThat( AP1.scores100( new int[] { 100, 1, 100, 100 } ), is( true ) );
	}

	@Test
	public void testScoresClump() {
		assertThat( AP1.scoresClump( new int[] { 3, 4, 5 } ), is( true ) );
		assertThat( AP1.scoresClump( new int[] { 3, 4, 6 } ), is( false ) );
		assertThat( AP1.scoresClump( new int[] { 1, 3, 5, 5 } ), is( true ) );
	}
}
